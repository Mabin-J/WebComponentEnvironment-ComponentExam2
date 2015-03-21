package info.mabin.wce.componentexam2;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import info.mabin.wce.manager.ComponentAbstract;
import info.mabin.wce.manager.exception.ComponentException;

public class Component extends ComponentAbstract implements ServletContextListener{
	protected ServletContext contextServlet;
	
	private static Component instance;
	
	public static Component getInstance(){
		return instance;
	}
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		instance = this;
		// ======== Read & Set Servlet
		contextServlet = event.getServletContext();
		
		try {
			loadComponent(contextServlet, this);
		} catch (ComponentException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		try {
			unloadComponent();
		} catch (ComponentException e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void initComponent() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void destroyComponent() {
		// TODO Auto-generated method stub
	}
}
