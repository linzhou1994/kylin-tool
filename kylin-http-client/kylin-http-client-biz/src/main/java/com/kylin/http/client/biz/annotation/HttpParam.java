package com.kylin.http.client.biz.annotation;


import com.kylin.http.client.biz.constant.HttpClientConstant;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 表单提交参数注解
 *
 * @author linzhou
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpParam {

    /**
     * 参数名称
     *
     * @return
     */
    String value() default "";

    /**
     * 编码格式
     *
     * @return
     */
    String charset() default HttpClientConstant.UTF8;

    String mimeType() default HttpClientConstant.APPLICATION_X_WWW_FORM_URLENCODED;
}
