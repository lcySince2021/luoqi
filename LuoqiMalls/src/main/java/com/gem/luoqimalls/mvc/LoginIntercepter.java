package com.gem.luoqimalls.mvc;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginIntercepter implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path=request.getRequestURI();
        if (path.indexOf("/login")>0||
                path.indexOf("/main")>0
                ){
            //放行
            return  true;
        }

//        存在session,都能操作,登录成功
        HttpSession sessions=request.getSession();
        if (sessions.getAttribute("user")!=null){
            return true;
        }
        //跳转到登录页面
        response.sendRedirect(request.getContextPath()+"/toLogin");
        return false;
    }
}
