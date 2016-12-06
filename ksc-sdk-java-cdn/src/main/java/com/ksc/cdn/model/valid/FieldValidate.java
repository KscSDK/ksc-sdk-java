package com.ksc.cdn.model.valid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * FieldValidate
 *
 * bean属性字段数据验证
 * 目前仅对非空验证
 *
 * @author jiangran@kingsoft.com
 * @date 08/11/2016
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
public @interface FieldValidate {
    boolean nullable() default false;
}
