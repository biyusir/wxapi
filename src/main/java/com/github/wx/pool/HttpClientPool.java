package com.github.wx.pool;

import org.apache.http.client.HttpClient;

import java.util.ArrayList;
import java.util.List;

public class HttpClientPool {
    private List<HttpClient> onWork = new ArrayList<HttpClient>();
    private List<HttpClient> free = new ArrayList<HttpClient>();
    private static HttpClientPool pool = null;

    public void returnClient(HttpClient client) {
        this.onWork.remove(client);
        this.free.add(client);
    }

    public HttpClient borrowClient() {
        HttpClient client = this.free.remove(0);
        this.onWork.add(client);
        return client;
    }

    public static HttpClientPool getInstance() {
        if (pool==null) {
            pool = new HttpClientPool();
        }
        return pool;
    }
}
