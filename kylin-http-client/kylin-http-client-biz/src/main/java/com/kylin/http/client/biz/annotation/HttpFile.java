package com.kylin.http.client.biz.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 文件上传参数注解
 *
 * @author linzhou
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpFile {

    /**
     * 参数名称
     *
     * @return
     */
    String value();

}
