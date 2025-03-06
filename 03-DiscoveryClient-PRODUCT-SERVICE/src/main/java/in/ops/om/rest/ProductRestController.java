package in.ops.om.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.ops.om.consumer.Consumer;


@RestController
@RequestMapping("v1/api/product")
public class ProductRestController {
	
	@Autowired
	private Consumer consumer;

@GetMapping("/show")
public ResponseEntity<String> getMethodName() {
	
	String cartResponse = consumer.getCartResponse();
	
    return new ResponseEntity<String>("product service with  :: "+cartResponse, HttpStatus.OK);
}
	
}
