package com.ksc.offline;

import java.io.FileInputStream;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.http.KSCHttpClient;
import com.ksc.offline.model.CreateTaskRequest;
import com.ksc.offline.model.CreateTasklResult;
import com.ksc.offline.model.DeletePresetRequest;
import com.ksc.offline.model.GetListRequest;
import com.ksc.offline.model.GetPresetDetailRequest;
import com.ksc.offline.model.GetPresetDetailResult;
import com.ksc.offline.model.GetTaskByTaskIDRequest;
import com.ksc.offline.model.GetTaskByTaskIDResult;
import com.ksc.offline.model.GetTaskListRequest;
import com.ksc.offline.model.GetTaskListResult;
import com.ksc.offline.model.GetTaskMetaRequest;
import com.ksc.offline.model.GetTaskMetaResult;
import com.ksc.offline.model.OfflineErrResult;
import com.ksc.offline.model.OfflineResult;
import com.ksc.offline.model.PresetRequest;
import com.ksc.offline.model.TaskRequest;
import com.ksc.offline.model.TopTaskByTaskIDRequest;
import com.ksc.offline.model.UpdatePersetRequest;


public class TestOffline {
	public static void main(String[] args) throws JSONException {
		AWSCredentials credentials = null;
		try {
			credentials = new BasicAWSCredentials("xxxxxxxx",
					"xxxxxxxxxx");
		} catch (Exception e) {
			throw new KscClientException("Cannot load the credentials from the credential profiles file. "
					+ "Please make sure that your credentials file is at the correct "
					+ "location (~/.aws/credentials), and is in valid format.", e);
		}
		KSCOFFJsonClient ksc = new KSCOFFJsonClient(credentials);
		ksc.setEndpoint("http://offline.cn-beijing-6.api.ksyun.com/");

		GetListRequest gitlistrequest = new GetListRequest();
		gitlistrequest.setWithDetail(1);
		gitlistrequest.setPresettype("avop");
		OfflineResult getpresetlistResult = ksc.GetPresetList(gitlistrequest);

		DeletePresetRequest deletePresetRequest = new DeletePresetRequest();
		deletePresetRequest.setPreset("liubohua1");
		OfflineErrResult deletePresetResult = ksc.DelPreset(deletePresetRequest);

		PresetRequest presetRequest = new PresetRequest();
		String data = PresetSet("preset");
		presetRequest.setData(data);
		System.out.println("Create Preset Json:"+data);
		OfflineErrResult presetResult = ksc.Preset(presetRequest);

		UpdatePersetRequest presetRequest1 = new UpdatePersetRequest();
		String data1 = PresetSet("liubohua9");
		presetRequest1.setData(data1);
		System.out.println("Update Preset JSON "+data1);
		OfflineErrResult presetResult1 = ksc.UpdatePreset(presetRequest1);

		GetPresetDetailRequest getPresetDetailRequest = new GetPresetDetailRequest();
		getPresetDetailRequest.setPreset("preset");
		GetPresetDetailResult getPresetDetailResult = ksc.GetPresetDetail(getPresetDetailRequest);
		System.out.println("gop:"+getPresetDetailResult.getPresetdetail().getParam().getVideo().getOrientationAdapt());

		CreateTaskRequest createTaskRequest = new CreateTaskRequest();
		String data2 = setTask("preset_avop1", "wangshuai9", "ksyun_a.flv", "ksyun.flv");
		createTaskRequest.setData(data2);
		System.out.println("Create Task JSON "+data2);
		CreateTasklResult createTasklResult = ksc.CreateTask(createTaskRequest);

		TaskRequest tashRequest = new TaskRequest();
		tashRequest.setTaskid("359832c8b368ab27c1f4a5b5396e1af120160923");
		OfflineErrResult DelTaskByTaskIDResult = ksc.DelTaskByTaskID(tashRequest);

		TopTaskByTaskIDRequest topTaskByTaskIDRequest = new TopTaskByTaskIDRequest();
		topTaskByTaskIDRequest.setTaskid("39c4926af7e04bd0d0ef9808c74286292016110");
		OfflineErrResult TopTaskByTaskIDResult = ksc.TopTaskByTaskID(topTaskByTaskIDRequest);

		GetTaskListRequest getTaskListRequest = new GetTaskListRequest();
		getTaskListRequest.setStartdate(20161101);
		GetTaskListResult getTaskListResult = ksc.GetTaskList(getTaskListRequest);

		GetTaskByTaskIDRequest getTaskByTaskIDRequest = new GetTaskByTaskIDRequest();
		getTaskByTaskIDRequest.setTaskid("359832c8b368ab27c1f4a5b5396e1af120160923");
		GetTaskByTaskIDResult getTaskByTaskIDResult = ksc.GetTaskByTaskID(getTaskByTaskIDRequest);
		
		GetTaskMetaRequest getTaskMetaInfoRequest = new GetTaskMetaRequest();
		getTaskMetaInfoRequest.setTaskid("b444d1e644af2585c07fa62fc509623620161109");
		GetTaskMetaResult GetTaskMetaResult = ksc.GetTaskMetaInfo(getTaskMetaInfoRequest);
		

	}

	private static String PresetSet(String preset) throws JSONException {
		String presettype = "avop";
		JSONObject data = new JSONObject();
		JSONObject param = new JSONObject();
		JSONObject video = new JSONObject();
		JSONObject audio = new JSONObject();
		data.put("preset", preset);
		data.put("presettype", presettype);
		data.put("description", "desc:" + preset);

		video.put("vr", "13");
		video.put("vb", "780000");
		video.put("vcodec", "h264");
		video.put("width", 500);
		video.put("height", 600);
		video.put("as", 0);
		video.put("rotate", "0");
		video.put("vn", 0);
		video.put("orientationAdapt", 1);
		video.put("gop", 10);

		audio.put("ar", "44100");
		audio.put("ab", "64k");
		audio.put("acodec", "aac");
		audio.put("an", 0);

		param.put("f", "flv");
		param.put("VIDEO", video);
		param.put("AUDIO", audio);
		data.put("param", param);

		return data.toString();
	}

	private static String setTask(String preset, String dst_bucket, String dst_object_key, String src_object_key)
			throws JSONException {
		JSONObject data = new JSONObject();
		data.put("preset", preset);
		data.put("srcInfo", TaskSrcInfo(dst_bucket, src_object_key));
		data.put("dstBucket", dst_bucket);
		data.put("dstObjectKey", dst_object_key);
		data.put("dstDir", "");
		data.put("isTop", 0);
		data.put("dstAcl", "public-read");
		data.put("cbUrl", "");
		data.put("cbMethod", "POST");
		data.put("extParam", "");
		

		return data.toString();
	}

	private static JSONArray TaskSrcInfo(String dst_bucket, String dst_object_key) throws JSONException {
		JSONArray srcInfo = new JSONArray();
		JSONObject insrcInfo = new JSONObject();
		insrcInfo.put("path", "/" + dst_bucket + "/" + dst_object_key);
		insrcInfo.put("index", 0);
		insrcInfo.put("type", "video");
		insrcInfo.put("aaa", System.currentTimeMillis());

		srcInfo.put(insrcInfo);

		return srcInfo;
	}

}
