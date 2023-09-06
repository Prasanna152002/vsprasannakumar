package Servelet;

import java.io.FileInputStream;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class WebListerner
 *
 */
@WebListener
public class WebListerner implements ServletContextListener, HttpSessionListener, ServletRequestListener {
	ServletContext application;
    public void sessionCreated(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	try {
        this.application=sce.getServletContext();
        Properties pr=new Properties();
        String str=application.getRealPath("/WEB-INF/Data.properties");
        //System.out.println(str);
        pr.load(new FileInputStream(str));
        String driver=pr.getProperty("Driver");
        Class.forName(driver);
        application.setAttribute("url", pr.getProperty("url"));
        application.setAttribute("password", pr.getProperty("password"));
        application.setAttribute("user", pr.getProperty("user"));
        Properties pr2=new Properties();
        String str1=application.getRealPath("/WEB-INF/Config.properties");
        //System.out.println(str);
        pr2.load(new FileInputStream(str1));
        application.setAttribute("prop", pr2);
    	}catch(Exception e) {e.printStackTrace();}
        
    }
	
}
