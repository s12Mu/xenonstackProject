package com.user.servlet;

import com.dao.User_dao;
import com.db.DBConnection;
import com.entity.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/u_register")
public class UserRegister extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String pass = req.getParameter("pass");
			//int phone = Integer.parseInt(req.getParameter("phone"));
			
			// print all record 
			System.out.println(name);
			System.out.println(email);
			//System.out.println(phone);
			System.out.println(pass);
			
			User u = new User(name,email,pass/*,phone*/);  // set the all data 
			
			User_dao dao = new User_dao(DBConnection.GetConnection());  // connect the Data Base
			
			// HttpSession session = req.getSession();     //
			
			boolean status = dao.register(u);
			System.out.println(status);
			
			if(status == true) {
				/*session.setAttribute("sucMsg","Register Successfully");*/
				resp.sendRedirect("logIn.jsp");
				System.out.println("Add Sucessful");
			}else {
				System.out.println("Not Add , Error Some this please solve it");
				/*session.setAttribute("errorMsg","Something wrong on server");*/
				resp.sendRedirect("Signup.jsp");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

