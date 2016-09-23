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
			credentials = new BasicAWSCredentials("AKLT8QD8WDFRSxmuqccfPXSx5A",
						"OF9XpifwDTJ4gasNh9QfDPzxyK7AvwYvP3BiSRRg63vOAmqu91YemRg6iFYORtj/ow==");
			} catch (Exception e) {
				throw new KscClientException(
						"Cannot load the credentials from the credential profiles file. "
								+ "Please make sure that your credentials file is at the correct "
								+ "location (~/.aws/credentials), and is in valid format.",
						e);
			}
		KSCOFFJsonClient ksc = new KSCOFFJsonClient(credentials);
		ksc.setEndpoint("http://offline.cn-beijing-6.api.ksyun.com/");
		/*
		 * 发送get请求，获取模板列表
		 */
		long expire = 600 + System.currentTimeMillis()/1000;
		
//		GetListRequest gitlistrequest = new GetListRequest();
//		gitlistrequest.setExpire(expire);
//		OfflineResult getpresetlistResult = ksc.GetPresetList(gitlistrequest);
//		
		
		/*
		 * 发送get请求，删除模板
		 */
//		DeletePresetRequest deletePresetRequest = new DeletePresetRequest();
//		deletePresetRequest.setPreset("liubohua1");
//		OfflineErrResult deletePresetResult = ksc.DelPreset(deletePresetRequest);
				
		/*
		 * 发送post请求,建立模板
		 */
//		PresetRequest presetRequest = new PresetRequest();
//		String data = PresetSet("liubohua9");
//		presetRequest.setData(data);
//		OfflineErrResult presetResult = ksc.Preset(presetRequest);
		
		/*
		 * 发送post请求，更新模板
		 */
//		UpdatePersetRequest presetRequest = new UpdatePersetRequest();
//		String data = PresetSet("liubohua9");
//		presetRequest.setData(data);
//		OfflineErrResult presetResult = ksc.UpdatePreset(presetRequest);
		
		/*
		 * 发送get请求，获取模板详情
		 */
		
//		GetPresetDetailRequest getPresetDetailRequest = new GetPresetDetailRequest();
//		getPresetDetailRequest.setPreset("preset_avop1");
//		GetPresetDetailResult getPresetDetailResult = ksc.GetPresetDetail(getPresetDetailRequest);
//		
		
		
		/*
		 * 发送post请求，新建任务
		 *
		 */
//		CreateTaskRequest createTaskRequest = new CreateTaskRequest();
//		String data = setTask("preset_avop1","wangshuai9","ksyun_a.flv","ksyun.flv");
//		createTaskRequest.setData(data);
//		CreateTasklResult createTasklResult = ksc.CreateTask(createTaskRequest);
		
		
		
		
		/*
		 * 发送get请求，删除任务
		 *
		 */
		
//		TaskRequest tashRequest = new TaskRequest();
//		tashRequest.setTaskid("359832c8b368ab27c1f4a5b5396e1af120160923");
//		OfflineErrResult DelTaskByReqIDResult = ksc.DelTaskByTaskID(tashRequest);
//		
		
		/*
		 * 发送get请求，置顶任务
		 */
//		TopTaskByTaskIDRequest topTaskByReqIDRequest = new TopTaskByTaskIDRequest();
//		topTaskByReqIDRequest.setTaskid("359832c8b368ab27c1f4a5b5396e1af120160923");
//		OfflineErrResult TopTaskByTaskIDResult = ksc.TopTaskByTaskID(topTaskByReqIDRequest);
		
		/*
		 * 发送get请求，查询任务列表
		 */
//		GetTaskListRequest getTaskListRequest = new GetTaskListRequest();
//		GetTaskListResult getTaskListResult = ksc.GetTaskList(getTaskListRequest);
		
		/*
		 * 发送个体请求，查询任务详情
		 */
//		GetTaskByTaskIDRequest getTaskByReqIDRequest = new GetTaskByTaskIDRequest();
//		getTaskByReqIDRequest.setTaskid("359832c8b368ab27c1f4a5b5396e1af120160923");
//		GetTaskByTaskIDResult getTaskByReqIDResult = ksc.GetTaskByTaskID(getTaskByReqIDRequest);
		
		
		System.out.println("aaaaa");
		
	}
	
	private  static String PresetSet(String preset) throws JSONException{
		String presettype = "avop";
		JSONObject data = new JSONObject();
		JSONObject param = new JSONObject();
		JSONObject video = new JSONObject();
		JSONObject audio = new JSONObject();
		data.put("preset", preset);    //模板名
		data.put("presettype",presettype);  //模板类型，固定为avop
		data.put("description","desc:"+preset);   //模板描述
		
		//模板的参数设置，用户可自行设置
		video.put("vr", "13");
		video.put("vb", "780000");
		video.put("vcodec", "h264");
		video.put("width", 500);
		video.put("height", 600);
		video.put("as", 0);
		video.put("rotate", "0");
		video.put("vn", 0);
		
		audio.put("ar", "44100");
		audio.put("ab", "64k");
		audio.put("acodec", "aac");
		audio.put("an", 0);
		
		param.put("f", "flv");
		param.put("VIDEO", video);
		param.put("AUDIO", audio);
		data.put("param",param);
		
		return data.toString();
	}
	
	
	//设置新加任务的数据参数
	
		private static String setTask(String preset,String dst_bucket,String dst_object_key,String src_object_key) throws JSONException{
			JSONObject data = new JSONObject();		
			data.put("preset", preset);			//模板名称
			data.put("srcInfo", TaskSrcInfo(dst_bucket,src_object_key));   
			data.put("dstBucket", dst_bucket);
			data.put("dstObjectKey",dst_object_key);
			data.put("dstDir", "");
			data.put("isTop", 0);
			
			return data.toString();
		}
		
		//设置任务路径
		private static JSONArray TaskSrcInfo(String dst_bucket,String dst_object_key) throws JSONException{
			JSONArray srcInfo = new JSONArray();
			JSONObject insrcInfo = new JSONObject();
			insrcInfo.put("path","/"+dst_bucket+"/"+dst_object_key);
			insrcInfo.put("index", 0);
			insrcInfo.put("type", "video");
			insrcInfo.put("aaa", System.currentTimeMillis());
			
			srcInfo.put(insrcInfo);
			
			return srcInfo;
		}
	
	
}
