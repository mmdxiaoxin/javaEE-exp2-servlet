package com.example;

public class AuthenticationService {

    public static boolean authenticate(String username, String password) {
        // 在这里实现用户验证逻辑，可以连接数据库或使用其他验证方式
        // 如果验证成功，返回true；否则返回false
        // 这里只是一个示例，实际验证逻辑应根据具体情况编写
        return "admin".equals(username) && "123456".equals(password);
    }
}
