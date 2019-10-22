package com.headout.demo;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

class blackone {
    public static void main(String[] args) {
        String url = "http://costcard.int.lb/cc/cost_card/search";

        Map<String, String> params = new HashMap<>();
        params.put("serviceType", "p2p");
        params.put("costingFor", "normal");
        params.put("serviceCity", "kolkata");
        params.put("financeType", "kuchto hai");
        params.put("carCategory", "Share");
        params.put("carTagging", "city_taxi");
        params.put("pickupDate", "1569864101000");
        params.put("segmentName", "nullnhi");
        params.put("Hello", "city_taxicd");


        String newUrl = setRequestParams(url, params);
        System.out.println("new URL " + newUrl);
        try {
            URL finalUrl = new URL(newUrl);
            System.out.println("final url " + finalUrl);
        } catch (Exception ex) {
            System.out.println("Hello bro");
        }
    }

    private static String setRequestParams(String url, Map<String, String> requestParams) {
        StringBuilder builder = new StringBuilder();
        try {
            builder.append(url);
            if (null != requestParams) {
                builder.append("?");
                for (String key : requestParams.keySet()) {
                    builder.append(key);
                    builder.append("=");
                    if (requestParams.get(key) != null)
                        builder.append(URLEncoder.encode(requestParams.get(key), StandardCharsets.UTF_8.toString()).replaceAll("\\+","%20"));
                    else
                        builder.append(requestParams.get(key));
                    builder.append("&");
                }
                return builder.toString().substring(0, builder.toString().length() - 1);
            }
            return builder.toString();
        } catch (Exception ex) {
            System.out.print("Ex");
        }
        return builder.toString();
    }

}

