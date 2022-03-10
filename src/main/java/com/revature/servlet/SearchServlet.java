package com.revature.servlet;

import com.revature.model.Gundam;
import com.revature.repository.GundamRepository;
import com.revature.repository.GundamRepositoryImpl;
import com.revature.service.GundamService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    GundamService gundamService = new GundamService();
    List<Gundam> gundams = gundamService.getAllGundam();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modelName = request.getParameter("model");

        Gundam gundam = null;

        for(Gundam g : gundams) {
            if(modelName.equals(g.getModel())) {
                gundam = g;
            }
        }

        if(gundam != null) {

            HttpSession session = request.getSession();

            session.setAttribute("gname", gundam.getName());
            session.setAttribute("model", gundam.getModel());
            session.setAttribute("pilot", gundam.getPilot());

            response.sendRedirect("model.jsp");

        } else {
            response.sendRedirect("welcome.jsp");
        }

    }
}
