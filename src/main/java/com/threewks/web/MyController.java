package com.threewks.web;

import java.util.HashMap;
import java.util.Map;
import com.threewks.thundr.view.jsp.JspView;

public class MyController {
    public JspView home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("message", "Hello World!");
        return new JspView("home.jsp", model);
    }
}