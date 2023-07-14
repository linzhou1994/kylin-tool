package com.kylin.http.client.biz.context.body.file;

import com.kylin.http.client.biz.annotation.HttpFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

/**
 * 文件上传存储类
 *
 * @author linzhou
 */
public class UploadMultipartFile implements FileBody{

    private HttpFile httpFile;

    private MultipartFile file;

    private Map<String, String> param;

    public UploadMultipartFile(HttpFile httpFile, MultipartFile file) {
        this.httpFile = httpFile;
        this.file = file;
    }

    public UploadMultipartFile(HttpFile httpFile, MultipartFile file, Map<String, String> param) {
        this.httpFile = httpFile;
        this.file = file;
        this.param = param;
    }

    public HttpFile getHttpFile() {
        return httpFile;
    }

    public void setHttpFile(HttpFile httpFile) {
        this.httpFile = httpFile;
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

    @Override
    public String getName(){
        return httpFile.value();
    }

    @Override
    public String getFileName() {
        return file.getOriginalFilename();
    }

    @Override
    public byte[] getFileBytes() throws IOException {
        return file.getBytes();
    }
}
