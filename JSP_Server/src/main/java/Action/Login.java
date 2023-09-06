package Action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends Action{
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response, Connection con){
		String sql="select password from crud where user=?";
		try {
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, request.getParameter("uname"));
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			String pass=rs.getString(1);
			if(pass.equals(request.getParameter("psw"))) {
				return "wpage";
			}
		}
		return "rpage";
		}
		catch(Exception e)
		{
			System.out.println("User not found");
			e.printStackTrace();
			return "rpage";
		}
	}
}
