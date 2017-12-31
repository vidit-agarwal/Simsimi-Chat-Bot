package com.hugeardor.vidit.simsimichatbot.Models;

/**
 * Created by vidit on 31/12/17.
 */

public class SimsimiModel  {

    public String response ;
    public String id ;
    public String result ;
    public String msg ;


    public SimsimiModel(String response, String id, String result, String msg) {

        this.response = response;
        this.id = id;
        this.result = result;
        this.msg = msg;
    }


    public SimsimiModel() {

    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
