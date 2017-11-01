package com.ksc.ket;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ksc.KscClientException;
import com.ksc.ket.model.PresetParam;
import com.ksc.ket.model.TaskParam;

public class TestApiKet {
	static String App = "xxxx";
	static String UniqName = "xxxx";

	public static void main(String[] args) throws JSONException {
		KSCKETApiClient credentials = null;
		try {
			credentials = new KSCKETApiClient("http://kvs.cn-beijing-6.api.ksyun.com", "xxxx", "xxxx");
		} catch (Exception e) {
			throw new KscClientException("Cannot load the credentials from the credential profiles file. "
					+ "Please make sure that your credentials file is at the correct "
					+ "location (~/.aws/credentials), and is in valid format.", e);
		}
		PresetParam presetParam = new PresetParam();
		TaskParam taskParam = new TaskParam();
		String result;
		// 创建模板
		presetParam.setData(PresetSet("xxxx", 1));
		result = credentials.Preset(presetParam);
		System.out.println("result = " + result);
		// 更新模板
		presetParam.setData(PresetSet("xxxx", 1));
		result = credentials.UpdatePreset(presetParam);
		System.out.println("result = " + result);
		// 删除模板
		presetParam.setApp(App);
		presetParam.setUniqName(UniqName);
		presetParam.setPreset("xxxx");
		result = credentials.DelPreset(presetParam);
		System.out.println("result = " + result);
		// 查询模板列表
		presetParam.setApp(App);
		presetParam.setUniqName(UniqName);
		result = credentials.GetPresetList(presetParam);
		System.out.println("result = " + result);
		// 查询模板详情
		presetParam.setApp(App);
		presetParam.setUniqName(UniqName);
		presetParam.setPreset("xxxxx");
		result = credentials.GetPresetDetail(presetParam);
		System.out.println("result = " + result);
		// 查询任务列表
		taskParam.setApp(App);
		taskParam.setUniqName(UniqName);
		taskParam.setStreamID("xxxxx");
		result = credentials.GetStreamTranList(taskParam);
		System.out.println("result = " + result);
		// 发起外网拉流
		taskParam.setData(StreamPullSet("xxxxx", 0));
		result = credentials.StartStreamPull(taskParam);
		System.out.println("result = " + result);
		// 停止外网拉流
		taskParam.setData(StreamPullSet("xxxxx", 1));
		result = credentials.StopStreamPull(taskParam);
		System.out.println("result = " + result);
		// 发起轮播转码
		taskParam.setData(StartLoopSet());
		result = credentials.StartLoop(taskParam);
		System.out.println("result = " + result);
		// 更新轮播转码
		taskParam.setData(UpdateLoopSet());
		result = credentials.UpdateLoop(taskParam);
		System.out.println("result = " + result);
		// 查询轮播列表
		taskParam.setApp(App);
		taskParam.setUniqName(UniqName);
		taskParam.setStreamID("xxxxx");
		result = credentials.GetLoopList(taskParam);
		System.out.println("result = " + result);
		// 停止轮播转码
		taskParam.setData(StopLoopSet());
		result = credentials.StopLoop(taskParam);
		System.out.println("result = " + result);
		// 创建选流任务
		taskParam.setData(DirectorTaskSet());
		result = credentials.CreateDirectorTask(taskParam);
		System.out.println("result = " + result);
		// 更新选流任务
		taskParam.setData(DirectorTaskSet());
		result = credentials.UpdateDirectorTask(taskParam);
		System.out.println("result = " + result);
		// 查询选流任务
		taskParam.setApp(App);
		taskParam.setUniqName(UniqName);
		taskParam.setTaskID("xxxxx");
		result = credentials.QueryDirectorTask(taskParam);
		System.out.println("result = " + result);
		// 删除选流任务
		taskParam.setApp(App);
		taskParam.setUniqName(UniqName);
		taskParam.setTaskID("xxxxx");
		result = credentials.DelDirectorTask(taskParam);
		System.out.println("result = " + result);
		// 配额占用查询
		taskParam.setUniqName(UniqName);
		result = credentials.GetQuotaUsed(taskParam);
		System.out.println("result = " + result);
	}

	private static String UpdateLoopSet() {
		JSONObject data = new JSONObject();
		data.put("App", "live");
		data.put("UniqName", UniqName);
		data.put("StreamID", "java_sdk_1234");
		data.put("DurationHour", 10);
		return data.toString();
	}

	private static String StopLoopSet() {
		JSONObject data = new JSONObject();
		data.put("App", "live");
		data.put("UniqName", UniqName);
		data.put("StreamID", "java_sdk_1234");
		return data.toString();
	}

	private static String StartLoopSet() {
		JSONObject data = new JSONObject();
		JSONArray srcInfo = new JSONArray();
		data.put("PubDomain", "xxxxx");
		data.put("UniqName", UniqName);
		data.put("Preset", "xxxx");
		data.put("StreamID", "xxxx");
		data.put("App", "live");
		data.put("DurationHour", 168);
		JSONObject tmp = new JSONObject();
		tmp.put("Path", "xxxxxxxx");
		tmp.put("Index", 0);
		srcInfo.put(tmp);
		data.put("SrcInfo", srcInfo);
		return data.toString();
	}

	private static String StreamPullSet(String StreamID, int type) {
		JSONObject data = new JSONObject();
		data.put("UniqName", UniqName);
		data.put("StreamID", StreamID);
		if (type == 0) {
			data.put("SrcUrl", "xxxxxxxxx");
		}
		data.put("App", "live");
		return data.toString();
	}

	private static String PresetSet(String preset, int num) throws JSONException {
		int formatSet[] = new int[] { 271 };
		JSONObject data = new JSONObject();
		JSONArray output = new JSONArray();
		JSONObject video = new JSONObject();
		data.put("UniqName", UniqName);
		data.put("Preset", preset);
		data.put("Description", "desc:" + preset);
		data.put("App", "live");
		for (int i = 0; i < num; i++) {
			JSONObject output_tmp = new JSONObject();
			JSONObject format = new JSONObject();
			format.put("output_format", formatSet[i]);
			output_tmp.put("format", format);
			output.put(output_tmp);
		}
		data.put("Output", output);
		data.put("Video", video);
		return data.toString();
	}

	private static String DirectorTaskSet() {
		JSONObject data = new JSONObject();
		data.put("App", "xxxx");
		data.put("UniqName", UniqName);
		JSONArray SrcInfo = new JSONArray();
		for (int i = 0; i < 2; i++) {
			JSONObject info = new JSONObject();
			info.put("SrcUrl", "xxxx");
			info.put("Index", i);
			SrcInfo.put(info);
		}
		data.put("SrcInfo", SrcInfo);
		return data.toString();
	}
}