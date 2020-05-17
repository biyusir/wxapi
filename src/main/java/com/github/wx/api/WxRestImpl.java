package com.github.wx.api;

import com.github.wx.pool.HttpClientPool;
import com.github.wx.result.Code2SessionRequest;
import com.github.wx.result.Code2SessionResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;

import java.io.IOException;

public class WxRestImpl implements WxRest {
    private String openId;
    private String security;

    public WxRestImpl(String openId, String security) {
        this.openId = openId;
        this.security = security;
    }

    public Code2SessionResponse code2Session(Code2SessionRequest request) throws IOException {
        HttpClientPool httpClientPool = HttpClientPool.getInstance();
        HttpClient httpClient = httpClientPool.borrowClient();
        HttpResponse response = httpClient.execute(new HttpGet());

        httpClientPool.returnClient(httpClient);
        return null;
    }
}
