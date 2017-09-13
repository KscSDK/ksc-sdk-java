package com.ksc.kvs;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ksc.kvs.model.PresetParam;
import com.ksc.kvs.model.TaskParam;
import com.ksc.kvs.util.AwsSignerV4Util;
import com.ksc.kvs.util.Header;
import com.ksc.kvs.util.HttpRequest;

public class KSCKVSApiClient {
	private String endpoint = "http://kvs.cn-beijing-6.api.ksyun.com";
	private String region = "cn-beijing-6";
	private String serviceName = "kvs";
	private String version = "2017-01-01";
	private final String accessKey;
	private final String secretKey;

	public KSCKVSApiClient(String endpoint, String accessKey, String secretKey) {
		if (endpoint != null) {
			this.endpoint = endpoint;
		}
		if (accessKey == null) {
			throw new IllegalArgumentException("Access key cannot be null.");
		}
		if (secretKey == null) {
			throw new IllegalArgumentException("Secret key cannot be null.");
		}
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}
	
	public String Preset(PresetParam param) {
		String action = "Preset";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		Map<String, String> headers = new HashMap<String, String>();
		try {
			InputStream body = new ByteArrayInputStream(param.getData().getBytes("ISO-8859-1"));
			List<Header> header = AwsSignerV4Util.getAuthHeaderForPost(uri, parameters, body, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendPost(this.endpoint + "/?" + MapToString(parameters), param.getData(), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String UpdatePreset(PresetParam param) {
		String action = "UpdatePreset";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		Map<String, String> headers = new HashMap<String, String>();
		try {
			InputStream body = new ByteArrayInputStream(param.getData().getBytes("ISO-8859-1"));
			List<Header> header = AwsSignerV4Util.getAuthHeaderForPost(uri, parameters, body, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendPost(this.endpoint + "/?" + MapToString(parameters), param.getData(), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String DelPreset(PresetParam param) {
		String action = "DelPreset";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("Preset", param.getPreset());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String GetPresetDetail(PresetParam param) {
		String action = "GetPresetDetail";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("Preset", param.getPreset());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String GetPresetList(PresetParam param) {
		String action = "GetPresetList";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		if (param.getWithDetail() == 1) {
			parameters.put("WithDetail", String.valueOf(param.getWithDetail()));
		}
		if (param.getPresetType() != null) {
			parameters.put("PresetType", param.getPresetType());
		}
		if (param.getPresets() != null) {
			parameters.put("Presets", param.getPresets());
		}
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String CreateTask(TaskParam param) {
		String action = "CreateTask";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		Map<String, String> headers = new HashMap<String, String>();
		try {
			InputStream body = new ByteArrayInputStream(param.getData().getBytes("ISO-8859-1"));
			List<Header> header = AwsSignerV4Util.getAuthHeaderForPost(uri, parameters, body, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendPost(this.endpoint + "/?" + MapToString(parameters), param.getData(), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String CreateFlowTask(TaskParam param) {
		String action = "CreateFlowTask";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		Map<String, String> headers = new HashMap<String, String>();
		try {
			InputStream body = new ByteArrayInputStream(param.getData().getBytes("ISO-8859-1"));
			List<Header> header = AwsSignerV4Util.getAuthHeaderForPost(uri, parameters, body, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendPost(this.endpoint + "/?" + MapToString(parameters), param.getData(), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String DelTaskByTaskID(TaskParam param) {
		String action = "DelTaskByTaskID";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("TaskID", param.getTaskID());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String TopTaskByTaskID(TaskParam param) {
		String action = "TopTaskByTaskID";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("TaskID", param.getTaskID());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String GetTaskList(TaskParam param) {
		String action = "GetTaskList";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		if (param.getStartDate() > 0) {
			parameters.put("StartDate", String.valueOf(param.getStartDate()));
		}
		if (param.getEndDate() > 0) {
			parameters.put("EndDate", String.valueOf(param.getEndDate()));
		}
		if (param.getMarker() > 0) {
			parameters.put("Marker", String.valueOf(param.getMarker()));
		}
		if (param.getLimit() > 0) {
			parameters.put("Limit", String.valueOf(param.getLimit()));
		}
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String GetTaskByTaskID(TaskParam param) {
		String action = "GetTaskByTaskID";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("TaskID", param.getTaskID());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String GetTaskMetaInfo(TaskParam param) {
		String action = "GetTaskMetaInfo";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		if (param.getStartDate() > 0) {
			parameters.put("StartDate", String.valueOf(param.getStartDate()));
		}
		if (param.getEndDate() > 0) {
			parameters.put("EndDate", String.valueOf(param.getEndDate()));
		}
		if (param.getMarker() > 0) {
			parameters.put("Marker", String.valueOf(param.getMarker()));
		}
		if (param.getLimit() > 0) {
			parameters.put("Limit", String.valueOf(param.getLimit()));
		}
		if (param.getTaskID() != null) {
			parameters.put("Limit", param.getTaskID());
		}

		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String UpdatePipeline(TaskParam param) {
		String action = "UpdatePipeline";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		Map<String, String> headers = new HashMap<String, String>();
		try {
			InputStream body = new ByteArrayInputStream(param.getData().getBytes("ISO-8859-1"));
			List<Header> header = AwsSignerV4Util.getAuthHeaderForPost(uri, parameters, body, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendPost(this.endpoint + "/?" + MapToString(parameters), param.getData(), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String QueryPipeline(TaskParam param) {
		String action = "QueryPipeline";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("PipelineName", param.getPipelineName());
		Map<String, String> headers = new HashMap<String, String>();
		try {
			Map<String, String> header = AwsSignerV4Util.getAuthHeaderForGet(uri, parameters, headers, this.serviceName,
					this.region, this.accessKey, this.secretKey);
			result = HttpRequest.sendGet(this.endpoint + "/", MapToString(parameters), header);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String MapToString(Map<String, String> parameters) {
		String param = "";
		for (String key : parameters.keySet()) {
			param = param + key + "=" + parameters.get(key) + "&";
		}
		return param;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAccessKey() {
		return accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}
}