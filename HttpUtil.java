package com.hola.weather.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by wangxin on 17-9-1.
 */

public class HttpUtil {

    public static InputStream download(String key) throws IOException {
        HttpURLConnection urlConnection = (HttpURLConnection) new URL(key).openConnection();
        return urlConnection.getInputStream();
    }
}
