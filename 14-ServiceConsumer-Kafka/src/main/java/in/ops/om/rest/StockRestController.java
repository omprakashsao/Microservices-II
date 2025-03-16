package in.ops.om.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ops.om.bean.StockData;
import in.ops.om.store.MessageStore;


@RestController
@RequestMapping("v1/api/stock/info")
public class StockRestController {
	
	@Autowired
	private MessageStore ms;
	
	@GetMapping("/all")
	public ResponseEntity<List<StockData>> getAllStock() {
		List<StockData> list = ms.getAll();
		return new ResponseEntity<List<StockData>>(list, HttpStatus.OK);
	}
	

}
