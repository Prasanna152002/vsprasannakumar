package Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response, Connection con) {
		String sql="insert into crud(user,password,email) values(?,?,?)";
		try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, request.getParameter("usrnm"));
		ps.setString(2, request.getParameter("psw"));
		ps.setString(3, request.getParameter("email"));
		ps.execute();
		return "lpage";
		}
		catch(Exception e)
		{
			System.out.println("fuck");
			e.printStackTrace();
			return "lpage";
		}
	}
}
