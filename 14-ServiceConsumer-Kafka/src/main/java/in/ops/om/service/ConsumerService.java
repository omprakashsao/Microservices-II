package in.ops.om.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import in.ops.om.bean.StockData;
import in.ops.om.converter.JSONUtil;
import in.ops.om.store.MessageStore;

@Component
public class ConsumerService {
	
	@Autowired
	private MessageStore ms;

	@KafkaListener(groupId = "MYID",topics = "${my.topic.name}")
	public void getMessage(String message) {
		
		System.out.println(message);
		
		StockData obj = JSONUtil.JsontoObject(message);
		
		ms.saveData(obj);
		
	}
}
