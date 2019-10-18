package com.example.pranjall.fm;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Naveen on 06-03-2017.
 */

public class buildproject extends StringRequest {

    private static String Request_Url="http://192.168.43.222:80/correct.php";
    private Map<String,String> params;


    public buildproject(String filename, Response.Listener<String> listener){
        super(Method.POST,Request_Url,listener,null);
        params=new HashMap<>();
        params.put("filename",filename);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}