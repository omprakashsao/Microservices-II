package in.ops.om.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import in.ops.om.service.Provider;

@Component
public class ProducerTest {
	
	@Autowired
	private Provider provider;
	
	
	@Scheduled(cron = "*/10 * * * * *")
	public void sendMessage() {
		
		provider.sendData("Data is sent"+new Date());
	}

}
