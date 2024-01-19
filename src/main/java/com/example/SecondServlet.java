package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondServlet", value = "/servFix")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应的字符编码
        response.setCharacterEncoding("UTF-8");
        // 设置响应内容的MIME类型
        response.setContentType("text/html;charset=UTF-8");

        // 获取一个PrintWriter对象，用于写入响应
        PrintWriter out = response.getWriter();

        // 写入中文内容
        out.println("欢迎来到天涯海角@@@");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
