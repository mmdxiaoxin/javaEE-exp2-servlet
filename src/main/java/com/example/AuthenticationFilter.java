package com.example;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // 获取用户的Session
        HttpSession session = httpRequest.getSession(false);

        // 获取用户请求的URI
        String uri = httpRequest.getRequestURI();

        // 检查用户是否已经登录
        boolean loggedIn = (session != null && session.getAttribute("username") != null);

        if (uri.endsWith("login.jsp") || uri.endsWith("loginServlet")) {
            // 如果用户请求登录页面或登录操作，继续执行
            chain.doFilter(request, response);
        } else if (loggedIn) {
            // 如果用户已登录，继续执行
            chain.doFilter(request, response);
        } else {
            // 用户没有登录，检查是否有自动登录的Cookie
            Cookie[] cookies = httpRequest.getCookies();
            String username = null;
            String password = null;

            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if (cookie.getName().equals("username")) {
                        username = cookie.getValue();
                    } else if (cookie.getName().equals("password")) {
                        password = cookie.getValue();
                    }
                }
            }

            // 进行自动登录
            if (username != null && password != null && AuthenticationService.authenticate(username, password)) {
                // 验证成功，将用户名存入Session
                session = httpRequest.getSession();
                session.setAttribute("username", username);
                chain.doFilter(request, response);
            } else {
                // 自动登录失败，重定向到登录页面
                httpResponse.sendRedirect("login.jsp");
            }
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}



