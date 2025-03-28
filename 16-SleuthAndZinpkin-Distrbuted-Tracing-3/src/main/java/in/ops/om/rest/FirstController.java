package in.ops.om.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstController {
	
	@GetMapping("/showC")
	public ResponseEntity<String> method(){
		return new ResponseEntity<String>("Service C", HttpStatus.OK);
	}

}
