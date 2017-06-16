package com.ksc.kvs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ksc.KscClientException;
import com.ksc.auth.AWSCredentials;
import com.ksc.auth.BasicAWSCredentials;
import com.ksc.kvs.model.CreateTaskRequest;
import com.ksc.kvs.model.CreateTasklResult;
import com.ksc.kvs.model.DelTaskByTaskIDRequest;
import com.ksc.kvs.model.DeletePresetRequest;
import com.ksc.kvs.model.GetPresetDetailRequest;
import com.ksc.kvs.model.GetPresetDetailResult;
import com.ksc.kvs.model.GetPresetListRequest;
import com.ksc.kvs.model.GetPresetListResult;
import com.ksc.kvs.model.GetTaskByTaskIDRequest;
import com.ksc.kvs.model.GetTaskByTaskIDResult;
import com.ksc.kvs.model.GetTaskListRequest;
import com.ksc.kvs.model.GetTaskListResult;
import com.ksc.kvs.model.GetTaskMetaRequest;
import com.ksc.kvs.model.GetTaskMetaResult;
import com.ksc.kvs.model.KvsErrResult;
import com.ksc.kvs.model.PresetRequest;
import com.ksc.kvs.model.QueryPipelineRequest;
import com.ksc.kvs.model.QueryPipelineResult;
import com.ksc.kvs.model.TopTaskByTaskIDRequest;
import com.ksc.kvs.model.UpdatePipelineRequest;
import com.ksc.kvs.model.UpdatePresetRequest;

public class TestKvs {
	public static void main(String[] args) throws JSONException {
		AWSCredentials credentials = null;
		try {
			credentials = new BasicAWSCredentials("xxxxxxxxxx",
					"xxxxxxxxxxxxxxxxx");
		} catch (Exception e) {
			throw new KscClientException("Cannot load the credentials from the credential profiles file. "
					+ "Please make sure that your credentials file is at the correct "
					+ "location (~/.aws/credentials), and is in valid format.", e);
		}
		KSCKVSJsonClient ksc = new KSCKVSJsonClient(credentials);
		ksc.setEndpoint("http://kvs.cn-beijing-6.api.ksyun.com/");

		GetPresetListRequest getPresetListRequest = new GetPresetListRequest();
		getPresetListRequest.setWithDetail(1);
		GetPresetListResult getpresetlistResult = ksc.GetPresetList(getPresetListRequest);
		System.out.println(getpresetlistResult.getPresetList().size());

		DeletePresetRequest deletePresetRequest = new DeletePresetRequest();
		deletePresetRequest.setPreset("preset");
		KvsErrResult deletePresetResult = ksc.DelPreset(deletePresetRequest);
		System.out.println(deletePresetResult.getErrNum());

		PresetRequest presetRequest = new PresetRequest();
		String data = PresetSet("preset");
		presetRequest.setData(data);
		KvsErrResult presetResult = ksc.Preset(presetRequest);
		System.out.println(presetResult.getErrNum());

		UpdatePresetRequest presetRequest1 = new UpdatePresetRequest();
		String data1 = PresetSet("liubohua9");
		presetRequest1.setData(data1);
		KvsErrResult presetResult1 = ksc.UpdatePreset(presetRequest1);
		System.out.println(presetResult1.getErrNum());

		GetPresetDetailRequest getPresetDetailRequest = new GetPresetDetailRequest();
		getPresetDetailRequest.setPreset("preset");
		GetPresetDetailResult getPresetDetailResult = ksc.GetPresetDetail(getPresetDetailRequest);
		System.out.println(getPresetDetailResult.getPresetDetail().getPresetType());

		CreateTaskRequest createTaskRequest = new CreateTaskRequest();
		String data2 = setTask("preset_avop1", "wangshuai9", "ksyun_a.flv", "ksyun.flv");
		createTaskRequest.setData(data2);
		System.out.println("Create Task JSON " + data2);
		CreateTasklResult createTasklResult = ksc.CreateTask(createTaskRequest);
		System.out.println(createTasklResult.getErrNum());
		System.out.println("taskid:" + createTasklResult.getTaskID());

		DelTaskByTaskIDRequest delTaskByTaskIDRequest = new DelTaskByTaskIDRequest();
		delTaskByTaskIDRequest.setTaskID("359832c8b368ab27c1f4a5b5396e1af120160923");
		KvsErrResult DelTaskByTaskIDResult = ksc.DelTaskByTaskID(delTaskByTaskIDRequest);
		System.out.println(DelTaskByTaskIDResult.getErrMsg());

		TopTaskByTaskIDRequest topTaskByTaskIDRequest = new TopTaskByTaskIDRequest();
		topTaskByTaskIDRequest.setTaskID("39c4926af7e04bd0d0ef9808c74286292016110");
		KvsErrResult TopTaskByTaskIDResult = ksc.TopTaskByTaskID(topTaskByTaskIDRequest);
		System.out.println(TopTaskByTaskIDResult.getErrNum());

		GetTaskListRequest getTaskListRequest = new GetTaskListRequest();
		getTaskListRequest.setStartDate(20161101);
		GetTaskListResult getTaskListResult = ksc.GetTaskList(getTaskListRequest);
		System.out.println(getTaskListResult.getErrNum());

		GetTaskByTaskIDRequest getTaskByTaskIDRequest = new GetTaskByTaskIDRequest();
		getTaskByTaskIDRequest.setTaskID("359832c8b368ab27c1f4a5b5396e1af120160923");
		GetTaskByTaskIDResult getTaskByTaskIDResult = ksc.GetTaskByTaskID(getTaskByTaskIDRequest);
		System.out.println(getTaskByTaskIDResult.getErrNum());

		GetTaskMetaRequest getTaskMetaInfoRequest = new GetTaskMetaRequest();
		getTaskMetaInfoRequest.setTaskID("b444d1e644af2585c07fa62fc509623620161109");
		getTaskMetaInfoRequest.setStartDate(20161101);
		GetTaskMetaResult getTaskMetaResult = ksc.GetTaskMetaInfo(getTaskMetaInfoRequest);
		System.out.println(getTaskMetaResult.getErrNum());
		
		UpdatePipelineRequest updatePipelineRequest = new UpdatePipelineRequest();
		updatePipelineRequest.setData(setPipeline("usual"));
		KvsErrResult updatePipelineResult = ksc.UpdatePipeline(updatePipelineRequest);
		System.out.println(updatePipelineResult.getErrNum());
		
		QueryPipelineRequest queryPipelineRequest = new QueryPipelineRequest();
		queryPipelineRequest.setPipelineName("usual");
		QueryPipelineResult queryPipelineResult = ksc.QueryPipeline(queryPipelineRequest);
		System.out.println(queryPipelineResult.getErrNum());
	}

	private static String PresetSet(String preset) throws JSONException {
		String presettype = "avtrans";
		JSONObject data = new JSONObject();
		JSONObject param = new JSONObject();
		JSONObject video = new JSONObject();
		JSONObject audio = new JSONObject();
		JSONArray logos = new JSONArray();
		data.put("Preset", preset);
		data.put("PresetType", presettype);
		data.put("Description", "desc:" + preset);

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
		for (int i = 0; i < 4; i++) {
			JSONArray logo = new JSONArray();
			for (int j = 0; j < 2; j++) {
				JSONObject tmp = new JSONObject();
				tmp.put("url", String.valueOf(i) + ":" + String.valueOf(j));
				tmp.put("ss", i + j);
				logo.put(tmp);
			}
			logos.put(logo);
		}

		audio.put("ar", "44100");
		audio.put("ab", "64k");
		audio.put("acodec", "aac");
		audio.put("an", 0);

		param.put("f", "flv");
		param.put("VIDEO", video);
		param.put("AUDIO", audio);
		param.put("logos", logos);
		data.put("Param", param);

		return data.toString();
	}

	private static String setTask(String preset, String dst_bucket, String dst_object_key, String src_object_key)
			throws JSONException {
		JSONObject data = new JSONObject();
		data.put("Preset", preset);
		data.put("SrcInfo", TaskSrcInfo(dst_bucket, src_object_key));
		data.put("DstBucket", dst_bucket);
		data.put("DstObjectKey", dst_object_key);
		data.put("DstDir", "");
		data.put("IsTop", 0);
		data.put("DstAcl", "public-read");
		data.put("CbUrl", "");
		data.put("CbMethod", "POST");
		data.put("ExtParam", "");

		return data.toString();
	}

	private static JSONArray TaskSrcInfo(String dst_bucket, String dst_object_key) throws JSONException {
		JSONArray srcInfo = new JSONArray();
		JSONObject insrcInfo = new JSONObject();
		insrcInfo.put("path", "/" + dst_bucket + "/" + dst_object_key);
		insrcInfo.put("index", 0);
		insrcInfo.put("type", "video");

		srcInfo.put(insrcInfo);

		return srcInfo;
	}
	
	private static String setPipeline(String PipelineName){
		JSONObject data = new JSONObject();
		data.put("PipelineName", PipelineName);
		data.put("State", "Active");
		return data.toString();
		
	}
}
