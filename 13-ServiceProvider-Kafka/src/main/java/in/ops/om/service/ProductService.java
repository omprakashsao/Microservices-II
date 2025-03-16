package in.ops.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	private KafkaTemplate<String, String> kft;
	
	@Value("${my.topic.name}")
	private String topicName;
	
	
	public String sendData(String message) {
		
		kft.send(topicName, message);	
		return "SUCCESS";
	}
}
