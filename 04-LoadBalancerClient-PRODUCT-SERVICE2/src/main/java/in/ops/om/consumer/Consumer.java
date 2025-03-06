package in.ops.om.consumer;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Consumer {
	
	@Autowired
	private LoadBalancerClient client;
	

	
	

	public String getCartResponse() {
		
		ServiceInstance instance = client.choose("02-EurekaClient-CART-SERVICE");
		
		URI uri = instance.getUri();
		String url = uri + "/v1/api/product/cart";
		
		RestTemplate template = new RestTemplate();
		
		ResponseEntity<String> response = template.getForEntity(url, String.class);	
		
		return response.getBody();
	}





}
