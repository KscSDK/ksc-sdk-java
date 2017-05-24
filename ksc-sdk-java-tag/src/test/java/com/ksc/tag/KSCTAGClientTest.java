package com.ksc.tag;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.ksc.model.Filter;
import com.ksc.tag.model.CreateTagsRequest;
import com.ksc.tag.model.CreateTagsResult;
import com.ksc.tag.model.DeleteTagsRequest;
import com.ksc.tag.model.DeleteTagsResult;
import com.ksc.tag.model.DescribeTagKeysRequest;
import com.ksc.tag.model.DescribeTagKeysResult;
import com.ksc.tag.model.DescribeTagValuesRequest;
import com.ksc.tag.model.DescribeTagValuesResult;
import com.ksc.tag.model.DescribeTagsRequest;
import com.ksc.tag.model.DescribeTagsResult;
import com.ksc.tag.model.Resource;
import com.ksc.tag.model.Tag;

public class KSCTAGClientTest {

	private static final Logger log = Logger.getLogger(KSCTAGClientTest.class);

	@Test
	public void describeTags() {
		DescribeTagsRequest describeTagsRequest = new DescribeTagsRequest();
		describeTagsRequest.setMaxResults(6);
		KSCTAGClient client = new KSCTAGClient();
		client.setEndpoint("http://tag.cn-shanghai-3.api.ksyun.com");
		List<Filter> filters = new ArrayList<Filter>();
		Filter filter = new Filter();
		filter.setName("resource-type");
		List<String> values = new ArrayList<String>();
		values.add("kec-image");
		values.add("vpc");
		filter.setValues(values);
		
//		Filter filter1 = new Filter();
//		filter1.setName("resource-id");
//		List<String> values1 = new ArrayList<String>();
//		values1.add("cf4b5bde-c567-4035-a2e8-ed98014be8d6");
//		values1.add("b258a6c4-9632-42c4-82e5-cefec73efa2e");
//		filter1.setValues(values1);
		
		filters.add(filter);
//		filters.add(filter1);
		describeTagsRequest.setMaxResults(5);
		describeTagsRequest.setNextToken("NQ==");
		describeTagsRequest.setFilters(filters);
		DescribeTagsResult result = client.describeTags(describeTagsRequest);
		log.info(result);
	}

	@Test
	public void describeTagKeys() {
		KSCTAGClient client = new KSCTAGClient();
		client.setEndpoint("http://tag.cn-shanghai-3.api.ksyun.com");

		DescribeTagKeysRequest describeTagKeysRequest = new DescribeTagKeysRequest();
		describeTagKeysRequest.setResourceType("vpc");
		describeTagKeysRequest.setMaxResults(5);
		describeTagKeysRequest.setNextToken("MTA=");
		DescribeTagKeysResult result = client
				.describeTagKeys(describeTagKeysRequest);
		log.info(result);
	}

	@Test
	public void describeTagValues() {
		KSCTAGClient client = new KSCTAGClient();
		client.setEndpoint("http://tag.cn-shanghai-3.api.ksyun.com");

		DescribeTagValuesRequest describeTagValuesRequest = new DescribeTagValuesRequest();
		describeTagValuesRequest.setTagKey("MyVpcTag");
		describeTagValuesRequest.setMaxResults(5);
		describeTagValuesRequest.setNextToken("NQ==");
		DescribeTagValuesResult result = client
				.describeTagValues(describeTagValuesRequest);
		log.info(result);
	}

	@Test
	public void createTags() {
		KSCTAGClient client = new KSCTAGClient();
		client.setEndpoint("http://tag.cn-shanghai-3.api.ksyun.com");
		
		CreateTagsRequest createTagsRequest = new CreateTagsRequest();
		Tag tag = new Tag();
		tag.setKey("tag-sdk-test");
		tag.setValue("tag-sdk-test-a");
		Tag tag1 = new Tag();
		tag1.setKey("tag-sdk-test1");
		tag1.setValue("tag-sdk-test-b");
		List<Tag> tags = new ArrayList<Tag>();
		tags.add(tag);
		tags.add(tag1);
		Resource resource = new Resource();
		resource.setId("b2c4eaf1-943d-438d-a7dc-1345f1fbb6c9");		
		resource.setType("vpc");
		List<Resource> resources = new ArrayList<Resource>();
		resources.add(resource);
		
		createTagsRequest.setTags(tags);
		createTagsRequest.setResources(resources);
		
		CreateTagsResult result = client.createTages(createTagsRequest);
		log.info(result);
	}
	
	@Test
	public void deleteTags() {
		KSCTAGClient client = new KSCTAGClient();
		client.setEndpoint("http://tag.cn-shanghai-3.api.ksyun.com");
		
		DeleteTagsRequest deleteTagsRequest = new DeleteTagsRequest();
		Tag tag = new Tag();
		tag.setKey("vpc_key");
		tag.setValue("vpc_value_change");
		List<Tag> tags = new ArrayList<Tag>();
		tags.add(tag);
		
		Resource resource = new Resource();
		resource.setId("8825d888-4a8d-436e-9418-ce0dc2681075");		
		resource.setType("vpc");
		List<Resource> resources = new ArrayList<Resource>();
		resources.add(resource);
		
		deleteTagsRequest.setTags(tags);
		deleteTagsRequest.setResources(resources);
		
		DeleteTagsResult result = client.deleteTages(deleteTagsRequest);
		log.info(result);
	}
	
}
