package com.rutuja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rutuja.dao.ServletDao;
import com.rutuja.model.Test;

public class ServletController extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rno=Integer.parseInt(request.getParameter("rno"));
		ServletDao dao=new ServletDao();
		Test a1=dao.getdata(rno);
		request.setAttribute("test", a1);
		
		RequestDispatcher rd=request.getRequestDispatcher("Display.jsp");
		rd.forward(request, response);
		
		
		
		
		}

	

}
