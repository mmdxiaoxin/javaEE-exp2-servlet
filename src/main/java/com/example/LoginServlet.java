package com.example;

import com.example.AuthenticationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (AuthenticationService.authenticate(username, password)) {
            // 验证成功，创建Cookie
            Cookie usernameCookie = new Cookie("username", username);
            Cookie passwordCookie = new Cookie("password", password);

            // 设置Cookie的有效期，这里可以根据需求设置
            usernameCookie.setMaxAge(7 * 24 * 60 * 60); // 7天
            passwordCookie.setMaxAge(7 * 24 * 60 * 60);

            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);

            // 将用户名存入Session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // 登录成功后重定向到主页
            response.sendRedirect("admin.jsp");
        } else {
            // 登录失败，重定向到登录页面
            response.sendRedirect("login.jsp");
        }
    }
}

