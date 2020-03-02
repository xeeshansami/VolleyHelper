package com.cloudchef.VolleyApiHelper;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * Created by xeeshan7860 on 2/15/2018.
 */


public class CustomStringRequest extends Request<CustomStringRequest.mResponse> {


    private Response.Listener<mResponse> mListener;

    public CustomStringRequest(int method, String url, Response.Listener<mResponse> responseListener, Response.ErrorListener listener) {
        super(method, url, listener);
        this.mListener = responseListener;
    }


    @Override
    protected void deliverResponse(mResponse response) {
        this.mListener.onResponse(response);
    }

    @Override
    protected Response<mResponse> parseNetworkResponse(NetworkResponse response) {
        String parsed;
        try {
            parsed = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        } catch (UnsupportedEncodingException e) {
            parsed = new String(response.data);
        }

        mResponse responseM = new mResponse();
        responseM.headers = response.headers;
        responseM.response = parsed;

        return Response.success(responseM, HttpHeaderParser.parseCacheHeaders(response));
    }


    public static class mResponse {
        public Map<String, String> headers;
        public String response;
    }

}