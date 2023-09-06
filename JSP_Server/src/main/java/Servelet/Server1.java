package Servelet;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Server1", "*.pk" })
public class Server1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext application;
	RequestProcess rp;
	Connection con;
	@Override
		public void init(ServletConfig config) throws ServletException {
			System.out.println("Init called.....");
			try {
			this.application=config.getServletContext();
			String url=(String) application.getAttribute("url");
			String user=(String) application.getAttribute("user");
			String password=(String) application.getAttribute("password");
			con=DriverManager.getConnection(url, user, password);
			rp=new RequestProcess();
			//System.out.println(con);
			}catch(Exception e) {e.printStackTrace();}
			super.init(config);
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Get method called....");
		doPost(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Post method called....");
		rp.task(request, response, con);
		//doGet(request, response);
	}

}
