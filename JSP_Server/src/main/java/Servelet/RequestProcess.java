package Servelet;

import java.sql.Connection;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;

import Action.Action;
public class RequestProcess {
	public void task(HttpServletRequest request, HttpServletResponse response,Connection con)
	{
		try {
		ServletContext src=request.getServletContext();
		Properties pr=(Properties)src.getAttribute("prop");
		System.out.println(pr);
		String att=request.getParameter("formid");
		System.out.println(att);
		String str=pr.getProperty(att);
		System.out.println(str);
		Action ac=(Action)Class.forName(str).getConstructor().newInstance(); 
		String nextpage=ac.execute(request, response, con);
		RequestDispatcher rd=request.getRequestDispatcher(pr.getProperty(nextpage));
		rd.forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
