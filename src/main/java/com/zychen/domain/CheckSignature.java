package com.zychen.domain;

import java.io.Serializable;

/**
 * Created by wb-zyc241205 on 2017/3/14.
 *
 * @author wb-zyc241205
 * @date 2017/03/14
 */
public class CheckSignature implements Serializable {

    private static final long serialVersionUID = -1L;
    private String signature;
    private Long timestamp;
    private Long nonce;
    private String echostr;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getNonce() {
        return nonce;
    }

    public void setNonce(Long nonce) {
        this.nonce = nonce;
    }

    public String getEchostr() {
        return echostr;
    }

    public void setEchostr(String echostr) {
        this.echostr = echostr;
    }
}