package controller;

import computation.KilogramConverterSupport;
import computation.MeterConverterSupport;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/kilogram")
public class KilogramConverterController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();

        int kilogram = Integer.valueOf(request.getParameter("kg"));
        int gram = KilogramConverterSupport.computateGram(kilogram);
        int miligram = KilogramConverterSupport.computateMiligram(kilogram);

        writer.println("Kilogram : " + kilogram + "<br/>");
        writer.println("gram : " + gram + "<br/>");
        writer.println("miligram : " + miligram + "<br/>");
    }
}
