package in.ops.om.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/api/product")
public class CartRestController {
	
	@Value("${server.port}")
	Integer portNo;
	
	@Value("${my.app.tittle}")
	String info;
	
	@GetMapping("/cart")
	public ResponseEntity<String> getMethodName() {
		
		return new ResponseEntity<String>("Product => cart details...."+portNo+" config server details: "+info, HttpStatus.OK);
				
	}
	

}
