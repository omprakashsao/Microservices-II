package in.ops.om.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {
	
	@JmsListener(destination = "dest-topic")
	public void getMessage(String msg) {
		System.out.println(msg);
	}

}
