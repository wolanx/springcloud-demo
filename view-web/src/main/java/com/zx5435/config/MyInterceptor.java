package com.zx5435.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        Object sid = request.getSession().getAttribute("sid");

        System.out.println("MyInterceptor = " + url + "; sid = " + sid);

        if (url.equals("/user") && sid == null) {
            response.sendRedirect("/user/login?from=" + url);
            return false;
        }

        return super.preHandle(request, response, handler);
    }

}
