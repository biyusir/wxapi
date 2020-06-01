package com.github.wx.api;

import com.github.wx.domain.GetAccessTokenResponse;
import com.github.wx.result.Code2SessionRequest;
import com.github.wx.result.Code2SessionResponse;

import java.io.IOException;

public class WxRestAdapterImpl implements WxRest {

    private BaseRest baseRest;

    public WxRestAdapterImpl(String openId, String security) {
        this.baseRest = new BaseRestImpl(openId, security);
    }

    @Override
    public Code2SessionResponse code2Session(Code2SessionRequest request) throws IOException {
        return this.baseRest.code2Session(request);
    }

    @Override
    public GetAccessTokenResponse getAccessToken() throws IOException {
        return this.baseRest.getAccessToken();
    }
}
