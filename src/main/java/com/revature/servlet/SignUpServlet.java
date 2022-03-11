package com.revature.servlet;

import com.revature.model.User;
import com.revature.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    UserService userService = new UserService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(name, username, password, email);

        userService.saveUser(user);

        if(userService.getUserById(user.getUserId()) != null) {
            HttpSession session = request.getSession();
            session.setAttribute("name", user.getName().toUpperCase());
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }

    }

}
