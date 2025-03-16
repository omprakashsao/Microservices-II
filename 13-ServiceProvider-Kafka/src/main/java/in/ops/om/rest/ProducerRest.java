package in.ops.om.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ops.om.bean.StockData;
import in.ops.om.converter.Converter;
import in.ops.om.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/api/stock")
public class ProducerRest {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("/product")
	public String getMethodName(@RequestParam String code, @RequestParam String cost) {
		
		StockData stk = new StockData();
		stk.setCode(code);
		stk.setCost(cost);
		
		String str= new Converter().objectConvertToJsonString(stk);
		String response = "Failure";
		if(str != null) {
			
			 response = service.sendData(str);
		}
		
	return response;
	}
	

}
