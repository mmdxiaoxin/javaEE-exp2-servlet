package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FormServlet", urlPatterns = "/form")
public class FormServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取表单提交的数据
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        int age = Integer.parseInt(request.getParameter("age"));
        String[] hobbies = request.getParameterValues("hobbies");

        // 验证年龄
        if (age < 16) {
            request.setAttribute("errorMessage", "年龄必须大于或等于16岁");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            // 将数据传递到result.jsp
            request.setAttribute("name", name);
            request.setAttribute("gender", gender);
            request.setAttribute("age", age);
            request.setAttribute("hobbies", hobbies);
            request.getRequestDispatcher("result.jsp").forward(request, response);
        }
    }
}
