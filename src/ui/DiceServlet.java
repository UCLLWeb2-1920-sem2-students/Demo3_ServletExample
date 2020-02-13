package ui;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dice")
public class DiceServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Dice</title>");
		out.println("<link rel='stylesheet' href='css/sample.css' type='text/css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Playing with the dice</h1>");
		int eyes = new Random().nextInt(6) + 1;
		out.println("<h2>You threw a " + eyes + " </h2>");
		out.println("<img src='images/dice.jpg'>");
		out.println("<p>");
		out.println("<a href='index.html'>Home</a>");
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
	}

}
