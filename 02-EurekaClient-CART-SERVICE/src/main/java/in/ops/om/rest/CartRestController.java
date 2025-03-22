package in.ops.om.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("v1/api/product")
@RefreshScope
public class CartRestController {
	
	@Value("${server.port}")
	Integer portNo;
	
	@Value("${my.app.tittle}")
	String info;
	
	@GetMapping("/cart")
	public ResponseEntity<String> getMethodName(@RequestHeader String TOKENUUID) {
		
		return new ResponseEntity<String>(" config server details: "+info+ "TOKENUUID request prefilter"+ TOKENUUID+" Product => cart details...."+portNo, HttpStatus.OK);
				
	}
	

}
