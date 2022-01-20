package com.shankar.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
/*
s = 'ADOBECODEBANC'
t = 'ABC'

 */
    public static void main(String[] args) {
        String s= "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindowSubstring(s, t);
        System.out.println(result);
    }
    public static String minWindowSubstring(String s, String t){
        int left = 0, right = 0;
        Map<String, Integer> map = new HashMap<>(){{
            put("A",-1);
            put("B",-1);
            put("C",-1);
            put("start", -1);
            put("end",-1);
        }};
        while ( left < s.length() && right < s.length()){

            if(s.charAt(right) == 'A'){
                map.put("A", right);
            }else if(s.charAt(right) == 'B'){
                map.put("B",right);
            }else if(s.charAt(right) == 'C'){
                map.put("C",right);
            }
            if(map.get("A") != -1 && map.get("B") != -1  && map.get("C") != -1){
                if(map.get("A") < map.get("B") && map.get("A") < map.get("C")){
                    map.put("start", map.get("A"));
                } else if(map.get("B") < map.get("C")){
                    map.put("start",map.get("B"));
                }else{
                    map.put("start",map.get("C"));
                }
                if(map.get("A") > map.get("B") && map.get("A") > map.get("C")){
                    map.put("end", map.get("A"));
                } else if(map.get("B") > map.get("C")){
                    map.put("end",map.get("B"));
                }else{
                    map.put("end",map.get("C"));
                }

                System.out.println(map);
            }

            right++;

        }

        return s.substring(map.get("start"),map.get("end"));
        //return "";
    }
}
