package com.github.wx.api;

import com.alibaba.fastjson.JSONObject;
import com.github.wx.result.Code2SessionRequest;
import com.github.wx.result.Code2SessionResponse;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class WxRestImpl implements WxRest {
    private String appId;
    private String security;

    public WxRestImpl(String appId, String security) {
        this.appId = appId;
        this.security = security;
    }

    public Code2SessionResponse code2Session(Code2SessionRequest request) throws IOException {
        HttpGet httpGet = new HttpGet("https://api.weixin.qq.com/sns/jscode2session?appid=" + appId + "&secret=" + security + "&js_code=" + request.getJsCode() + "&grant_type=authorization_code");
        HttpResponse response = HttpClients.createDefault().execute(httpGet);
        StatusLine statusLine = response.getStatusLine();
        if (statusLine.getStatusCode() != 200) return null;

        HttpEntity entity = response.getEntity();
        InputStream content = entity.getContent();
        InputStreamReader inputStreamReader = new InputStreamReader(content);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        return JSONObject.parseObject(s, Code2SessionResponse.class);
    }
}
