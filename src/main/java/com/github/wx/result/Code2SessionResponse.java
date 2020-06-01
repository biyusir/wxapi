package com.github.wx.result;

import com.github.wx.domain.ErrorMsg;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@AllArgsConstructor
public class Code2SessionResponse extends ErrorMsg {
    private String openId;
    private String sessionKey;
    private String unionId;
    private String grantType;
}
