package com.ltts.PrakharRastogi_99004321.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.PrakharRastogi_99004321.dao.ProductionDao;
import com.ltts.PrakharRastogi_99004321.model.Productions;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no=Integer.parseInt(request.getParameter("pid"));
		String name=request.getParameter("pname");
		String addr=request.getParameter("addr");
		String dateofstarted=request.getParameter("dos");
		String ownname=request.getParameter("ownername");
		
		Productions p=new Productions(no,name,addr,dateofstarted,ownname);
		ProductionDao pd=new ProductionDao();
		boolean b=true;
		try {
			b=pd.updateProduction(p);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=null;
		if(b==false) {
			rd=request.getRequestDispatcher("success.html");
			//rd.forward(request, response);
			rd.include(request, response);
			
		}
		else {
			rd=request.getRequestDispatcher("register.html");
			rd.forward(request, response);
			System.out.println("Some error ... ");
		}
	}

}
