package com.example.dictionaryhub;

import com.example.dictionaryhub.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
