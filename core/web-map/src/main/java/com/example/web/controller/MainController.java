package com.example.web.controller;

import com.example.data.annotation.MainControl;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@MainControl
public class MainController {


    @GetMapping("/default")
    public Map<String, String> getDefault() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }
}
