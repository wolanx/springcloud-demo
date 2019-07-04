package com.zx5435.pcmoto.admin.config;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        Object uid = request.getSession().getAttribute("uid");

        System.out.println("MyInterceptor = " + url + "; uid = " + uid);

        if (uid == null) {
            response.sendRedirect("/user/login?from=" + url);
            return false;
        }

        return super.preHandle(request, response, handler);
    }

}
