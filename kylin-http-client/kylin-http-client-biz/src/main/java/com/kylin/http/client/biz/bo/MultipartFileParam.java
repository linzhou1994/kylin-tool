package com.kylin.http.client.biz.bo;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 文件上传存储类
 *
 * @author linzhou
 */
public class MultipartFileParam {

    private MultipartFile file;

    private Map<String, String> param;

    public MultipartFileParam(MultipartFile file, Map<String, String> param) {
        this.file = file;
        this.param = param;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Map<String, String> getParam() {
        return param;
    }

    public void setParam(Map<String, String> param) {
        this.param = param;
    }
}
