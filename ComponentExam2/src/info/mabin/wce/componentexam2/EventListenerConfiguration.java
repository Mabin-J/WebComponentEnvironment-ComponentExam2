package info.mabin.wce.componentexam2;

import org.w3c.dom.NodeList;

import info.mabin.wce.manager.Logger;
import info.mabin.wce.manager.eventlistener.EventListenerConfigurationImpl;

public class EventListenerConfiguration implements EventListenerConfigurationImpl{
	private Logger logger;
	
	public EventListenerConfiguration() {
		try {
			logger = Logger.getInstance(this.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void eventChangedConfiguration(NodeList configuration) {
		logger.i("Configuration Changed!");
	}
}
