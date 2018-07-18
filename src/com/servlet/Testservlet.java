package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import com.DB.MysqlDB;
import com.information.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Testservlet
 */
@WebServlet("/Testservlet")
public class Testservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Testservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String year = request.getParameter("year");
		String month = request.getParameter("month");
		//String days = request.getParameter("days");
		String market = request.getParameter("market");
		String name = request.getParameter("name");
		String manage = request.getParameter("manage");
		String location = request.getParameter("location");
		String channels = request.getParameter("channels");
		System.out.println("year:"+year+";"+"month:"+month+";"+"market:"+market+";"+"manage:"+manage+";"+"name:"+name+";"+"location:"+location+";"+"channels"+channels+";");
		MysqlDB mysqldb = new MysqlDB();
		Connection connection=mysqldb.getConnection();
		User user = new User();
		user.setYear(year);
		user.setMonth(month);
		user.setMarket(market);
		user.setManage(manage);
		user.setName(name);
		user.setLocation(location);
		user.setChannels(channels);
		String data = year + month + market + manage + name + location + channels;
		out.println(data);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
