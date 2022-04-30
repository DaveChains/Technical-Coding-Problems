package com.coding.publisher.hackerrank;

import netscape.javascript.JSObject;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class OriginalTypeConverter {

    public static void main(String[] args){
        Map<String, String> map = new HashMap();
        map.put("name", "David CJ");
        map.put("age", "25.6");
        map.put("applySub", "true");
        map.put("applyverified", "null");
        System.out.println(map);
        Map<String, Object> result = transformType(map);

        System.out.println("json : " + printJson(result));
        System.out.println("Object : " + result);
    }

    private static String printJson(Map<String, Object> map){
        String jsonString = "{"+map.entrySet().stream()
                .map(e -> "\""+ e.getKey() + "\":\"" + String.valueOf(e.getValue()) + "\"")
                .collect(Collectors.joining(", "))+"}";

        return jsonString;
    }

    private static Map<String, Object> transformType(Map<String, String> m){
        Map<String, Object> response = new HashMap<>();

        for(Map.Entry<String, String> toEvaluate : m.entrySet()){
            if (toEvaluate.getValue().matches("\\d+")) {
                response.put(toEvaluate.getKey(),Integer.parseInt(toEvaluate.getValue()));
            }
            else if (toEvaluate.getValue().matches("\\d*[.]\\d+")) {

                response.put(toEvaluate.getKey(), Double.parseDouble(toEvaluate.getValue()));

            } else if (toEvaluate.getValue().equals("true") || toEvaluate.getValue().equals("false")){

                response.put(toEvaluate.getKey(), Boolean.parseBoolean(toEvaluate.getValue()));

            } else if(toEvaluate.getValue().equals("null")){

                response.put(toEvaluate.getKey(), null);
            } else {
                response.put(toEvaluate.getKey(), toEvaluate.getValue());
            }
        }
        return response;
    }

}
