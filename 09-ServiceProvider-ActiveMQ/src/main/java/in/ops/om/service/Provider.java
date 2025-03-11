package in.ops.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Provider {
	
	@Autowired
	private JmsTemplate template;
	
	@Value("${my.app.desti-name}")
	private String destination;
	
	public void sendData(String mgs) {
		 
		
		template.send(destination, session->session.createTextMessage(mgs));
		
		System.out.println("message is sent");	
		
	}

}
