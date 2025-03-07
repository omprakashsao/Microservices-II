package in.ops.om.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RefresherPropertyFile {
	
	@Scheduled(cron = "10 * * * * *")
	public static void postRequestForRefreshData() {
		
		RestTemplate template = new RestTemplate();
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<String> entity = new HttpEntity<String>("{}", httpHeaders);
		
		ResponseEntity<String> output = template.postForEntity("http://localhost:9991/actuator/refresh", entity, String.class);
		System.out.println(output);
	}

}
