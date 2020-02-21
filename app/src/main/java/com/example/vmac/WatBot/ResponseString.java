package com.example.vmac.WatBot;

import com.google.gson.annotations.SerializedName;

public class ResponseString {

    @SerializedName("text")
    public String text;

    public ResponseString(String text){
        this.text=text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getText(){
        return text;
    }
}
