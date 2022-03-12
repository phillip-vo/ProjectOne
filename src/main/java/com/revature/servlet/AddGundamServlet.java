package com.revature.servlet;

import com.revature.model.Gundam;
import com.revature.service.GundamService;
import com.revature.util.HibernateUtil;
import org.hibernate.Session;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@WebServlet("/add")
public class AddGundamServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    GundamService gundamService = new GundamService();


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String model = request.getParameter("model");
        String pilot = request.getParameter("pilot");

        /*
        String file = request.getParameter("myfile");

        System.out.println(file);

        BufferedImage image = ImageIO.read(new File(file));
        */

        Gundam gundam = new Gundam(name, model, pilot);

        gundamService.saveGundam(gundam);

        response.sendRedirect("index.jsp");


    }

}
