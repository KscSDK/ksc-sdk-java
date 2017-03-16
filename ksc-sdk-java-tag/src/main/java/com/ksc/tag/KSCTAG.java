package com.ksc.tag;

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

public interface KSCTAG {

	/**
	 * 创建标签
	 * 
	 * @param createTagsRequest
	 * @return
	 */
	CreateTagsResult createTages(CreateTagsRequest createTagsRequest);

	/**
	 * 删除标签
	 * 
	 * @param deleteTagsRequest
	 * @return
	 */
	DeleteTagsResult deleteTages(DeleteTagsRequest deleteTagsRequest);

	/**
	 * 描述标签
	 * 
	 * @param describeTagsRequest
	 * @return
	 */
	DescribeTagsResult describeTags(DescribeTagsRequest describeTagsRequest);

	/**
	 * 描述标签名称
	 * 
	 * @param describeTagValuesRequest
	 * @return
	 */
	DescribeTagValuesResult describeTagValues(
			DescribeTagValuesRequest describeTagValuesRequest);

	/**
	 * 描述标签分类
	 * 
	 * @param describeTagKeysRequest
	 * @return
	 */
	DescribeTagKeysResult describeTagKeys(
			DescribeTagKeysRequest describeTagKeysRequest);

}
