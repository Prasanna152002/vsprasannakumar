package Action;

import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	abstract public String execute(HttpServletRequest request, HttpServletResponse response,Connection con);
}
