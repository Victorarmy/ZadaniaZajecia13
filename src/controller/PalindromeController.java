package controller;

import com.sun.deploy.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/palindrom")
public class PalindromeController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String text = request.getParameter("text");

        PrintWriter writer = response.getWriter();

        writer.println("All characteres: " + text.length() + "<br/>");

        writer.println("All chahracters without space: " + text.replaceAll(" ", "")
                                                               .length() + "<br/>");

        writer.println("All words : " + text.split(" ").length + "<br/>");

        writer.println("Is palindrome? : " + new StringBuilder().append(text)
                                                                .reverse()
                                                                .toString()
                                                                .equals(text) + "<br/>");
        writer.println("<h5><a href=\"index.jsp\">Exercises homepage</h5></a>" );
    }
}
