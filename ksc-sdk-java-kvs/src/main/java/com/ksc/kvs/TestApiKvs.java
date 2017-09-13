package com.ksc.kvs;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ksc.KscClientException;
import com.ksc.kvs.model.PresetParam;
import com.ksc.kvs.model.TaskParam;

public class TestApiKvs {
	public static void main(String[] args) throws JSONException {
		KSCKVSApiClient credentials = null;
		try {
			credentials = new KSCKVSApiClient("http://kvs.cn-beijing-6.api.ksyun.com",
					"xxxx",
					"xxxx");
		} catch (Exception e) {
			throw new KscClientException("Cannot load the credentials from the credential profiles file. "
					+ "Please make sure that your credentials file is at the correct "
					+ "location (~/.aws/credentials), and is in valid format.", e);
		}
		String result ;
		PresetParam presetParam = new PresetParam();
		//创建模板
		presetParam.setData(PresetSet("xxxx"));
		result = credentials.Preset(presetParam);
		System.out.println("result = " + result );
		//更新模板
		presetParam.setData(PresetSet("xxxx"));
		result = credentials.UpdatePreset(presetParam);
		System.out.println("result = " + result );
		//删除模板
		presetParam.setPreset("ceshishi");
		result = credentials.DelPreset(presetParam);
		System.out.println("result = " + result );
		//查询模板列表
		presetParam.setWithDetail(1);
		result = credentials.GetPresetList(presetParam);
		System.out.println("result = " + result );
		//查询模板详情
		presetParam.setPreset("ceshishi");
		result = credentials.GetPresetDetail(presetParam);
		System.out.println("result = " + result );
		//创建任务
		TaskParam taskParam = new TaskParam();
		taskParam.setData(setTask("xxxx", "xxxxx", "xxxx", "xxxx"));
		result = credentials.CreateTask(taskParam);
		System.out.println("result = " + result );
		//删除任务
		taskParam.setTaskID("xxxxxxxx");
		result = credentials.DelTaskByTaskID(taskParam);
		System.out.println("result = " + result );
		//置顶任务
		taskParam.setTaskID("xxxxxxxx");
		result = credentials.TopTaskByTaskID(taskParam);
		System.out.println("result = " + result );
		//查询任务列表
		taskParam.setStartDate(20170822);
		taskParam.setEndDate(20170822);
		result = credentials.GetTaskList(taskParam);
		System.out.println("result = " + result );
		//查询任务详情
		taskParam.setTaskID("xxxxxx");
		result = credentials.GetTaskByTaskID(taskParam);
		System.out.println("result = " + result );
		//查询META信息
		taskParam.setStartDate(20170822);
		taskParam.setEndDate(20170822);
		taskParam.setTaskID(null);
		result = credentials.GetTaskMetaInfo(taskParam);
		System.out.println("result = " + result );
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
		video.put("vcodec", "h264");
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
	
	private static JSONArray TaskSrcInfo(String dst_bucket, String dst_object_key) throws JSONException {
		JSONArray srcInfo = new JSONArray();
		JSONObject insrcInfo = new JSONObject();
		insrcInfo.put("path", "/" + dst_bucket + "/" + dst_object_key);
		insrcInfo.put("index", 0);
		insrcInfo.put("type", "video");

		srcInfo.put(insrcInfo);

		return srcInfo;
	}
	private static String setTask(String preset, String dst_bucket, String dst_object_key, String src_object_key) throws JSONException {
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
}