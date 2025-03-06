package in.ops.om.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("02-EurekaClient-CART-SERVICE")
public interface ICustomerOrder {
	
	@GetMapping("v1/api/product/cart")
	public ResponseEntity<String> getCartDetails();

}
