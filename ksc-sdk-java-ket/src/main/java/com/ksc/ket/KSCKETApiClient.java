package com.ksc.ket;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.ksc.ket.model.PresetParam;
import com.ksc.ket.model.TaskParam;
import com.ksc.ket.util.AwsSignerV4Util;
import com.ksc.ket.util.Header;
import com.ksc.ket.util.HttpRequest;

public class KSCKETApiClient {
	private String endpoint = "http://ket.cn-beijing-6.api.ksyun.com";
	private String region = "cn-beijing-6";
	private String serviceName = "ket";
	private String version = "2017-01-01";
	private final String accessKey;
	private final String secretKey;

	public KSCKETApiClient(String endpoint, String accessKey, String secretKey) {
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
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
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
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
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
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
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

	public String StartStreamPull(TaskParam param) {
		String action = "StartStreamPull";
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

	public String StopStreamPull(TaskParam param) {
		String action = "StopStreamPull";
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

	public String GetStreamTranList(TaskParam param) {
		String action = "GetStreamTranList";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
		parameters.put("StreamID", param.getStreamID());
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

	public String StartLoop(TaskParam param) {
		String action = "StartLoop";
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

	public String StopLoop(TaskParam param) {
		String action = "StopLoop";
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

	public String UpdateLoop(TaskParam param) {
		String action = "UpdateLoop";
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

	public String GetLoopList(TaskParam param) {
		String action = "GetLoopList";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
		if (param.getStreamID() != null) {
			parameters.put("StreamID", param.getStreamID());
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

	public String CreateDirectorTask(TaskParam param) {
		String action = "CreateDirectorTask";
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

	public String UpdateDirectorTask(TaskParam param) {
		String action = "UpdateDirectorTask";
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

	public String QueryDirectorTask(TaskParam param) {
		String action = "QueryDirectorTask";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
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

	public String DelDirectorTask(TaskParam param) {
		String action = "DelDirectorTask";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("UniqName", param.getUniqName());
		parameters.put("App", param.getApp());
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

	public String GetQuotaUsed(TaskParam param) {
		String action = "GetQuotaUsed";
		String result = "";
		URI uri = URI.create(this.endpoint);
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("Action", action);
		parameters.put("Version", this.version);
		parameters.put("UniqName", param.getUniqName());
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