package in.ops.om.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class FirstController {
	
	@GetMapping("/showA")
	public ResponseEntity<String> method(){
		RestTemplate template = new RestTemplate();
		String body = template.getForEntity("http://localhost:9091/showB", String.class).getBody();
		return new ResponseEntity<String>("From Service A, "+body, HttpStatus.OK);
	}

}
