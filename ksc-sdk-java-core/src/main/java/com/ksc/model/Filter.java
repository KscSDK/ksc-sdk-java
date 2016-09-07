/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.ksc.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * <p>
 * A filter name and value pair that is used to return a more specific list of
 * results. Filters can be used to match a set of resources by various criteria,
 * such as tags, attributes, or IDs.
 * </p>
 */
@ToString
@EqualsAndHashCode
@SuppressWarnings("serial")
public class Filter implements Serializable, Cloneable {

	/**
	 * <p>
	 * The name of the filter. Filter names are case-sensitive.
	 * </p>
	 */
	private String name;
	/**
	 * <p>
	 * One or more filter values. Filter values are case-sensitive.
	 * </p>
	 */
	private com.ksc.internal.SdkInternalList<String> values;

	/**
	 * Default constructor for Filter object. Callers should use the setter or
	 * fluent setter (with...) methods to initialize the object after creating
	 * it.
	 */
	public Filter() {
	}

	/**
	 * Constructs a new Filter object. Callers should use the setter or fluent
	 * setter (with...) methods to initialize any additional object members.
	 * 
	 * @param name
	 *            The name of the filter. Filter names are case-sensitive.
	 */
	public Filter(String name) {
		setName(name);
	}

	/**
	 * Constructs a new Filter object. Callers should use the setter or fluent
	 * setter (with...) methods to initialize any additional object members.
	 * 
	 * @param name
	 *            The name of the filter. Filter names are case-sensitive.
	 * @param values
	 *            One or more filter values. Filter values are case-sensitive.
	 */
	public Filter(String name, java.util.List<String> values) {
		setName(name);
		setValues(values);
	}

	/**
	 * <p>
	 * The name of the filter. Filter names are case-sensitive.
	 * </p>
	 * 
	 * @param name
	 *            The name of the filter. Filter names are case-sensitive.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>
	 * The name of the filter. Filter names are case-sensitive.
	 * </p>
	 * 
	 * @return The name of the filter. Filter names are case-sensitive.
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * <p>
	 * The name of the filter. Filter names are case-sensitive.
	 * </p>
	 * 
	 * @param name
	 *            The name of the filter. Filter names are case-sensitive.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public Filter withName(String name) {
		setName(name);
		return this;
	}

	/**
	 * <p>
	 * One or more filter values. Filter values are case-sensitive.
	 * </p>
	 * 
	 * @return One or more filter values. Filter values are case-sensitive.
	 */

	public java.util.List<String> getValues() {
		if (values == null) {
			values = new com.ksc.internal.SdkInternalList<String>();
		}
		return values;
	}

	/**
	 * <p>
	 * One or more filter values. Filter values are case-sensitive.
	 * </p>
	 * 
	 * @param values
	 *            One or more filter values. Filter values are case-sensitive.
	 */

	public void setValues(java.util.Collection<String> values) {
		if (values == null) {
			this.values = null;
			return;
		}

		this.values = new com.ksc.internal.SdkInternalList<String>(values);
	}

	/**
	 * <p>
	 * One or more filter values. Filter values are case-sensitive.
	 * </p>
	 * <p>
	 * <b>NOTE:</b> This method appends the values to the existing list (if
	 * any). Use {@link #setValues(java.util.Collection)} or
	 * {@link #withValues(java.util.Collection)} if you want to override the
	 * existing values.
	 * </p>
	 * 
	 * @param values
	 *            One or more filter values. Filter values are case-sensitive.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public Filter withValues(String... values) {
		if (this.values == null) {
			setValues(new com.ksc.internal.SdkInternalList<String>(
					values.length));
		}
		for (String ele : values) {
			this.values.add(ele);
		}
		return this;
	}

	/**
	 * <p>
	 * One or more filter values. Filter values are case-sensitive.
	 * </p>
	 * 
	 * @param values
	 *            One or more filter values. Filter values are case-sensitive.
	 * @return Returns a reference to this object so that method calls can be
	 *         chained together.
	 */

	public Filter withValues(java.util.Collection<String> values) {
		setValues(values);
		return this;
	}

	@Override
	public Filter clone() {
		try {
			return (Filter) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new IllegalStateException(
					"Got a CloneNotSupportedException from Object.clone() "
							+ "even though we're Cloneable!", e);
		}
	}
}
