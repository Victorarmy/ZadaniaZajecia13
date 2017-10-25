package controller;

import computation.MeterConverterSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/meter")
public class MeterConverterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        int meter = Integer.valueOf(request.getParameter("meter"));
        int centimeter = MeterConverterSupport.computateCentimeter(meter);
        int milimeter = MeterConverterSupport.computateMilimeter(meter);

        writer.println("Meter : " + meter + "<br/>");
        writer.println("Centimeter : " + centimeter + "<br/>");
        writer.println("Milimeter : " + milimeter + "<br/>");
    }
}
