package com.fingerprintscanner;

import org.json.JSONObject;

public class DataManager {
    String encryptKey;
    String timestamp;
    String captureType;
    String captureData;


    public String encryptFingerprint(JSONObject data){
        return data.toString();
    }

    public Void saveData(String data){
        return null;
    }



    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getCaptureType() {
        return captureType;
    }

    public void setCaptureType(String captureType) {
        this.captureType = captureType;
    }

    public String getCaptureData() {
        return captureData;
    }

    public void setCaptureData(String captureData) {
        this.captureData = captureData;
    }

}
