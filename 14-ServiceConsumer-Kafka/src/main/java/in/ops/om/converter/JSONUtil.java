package in.ops.om.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.ops.om.bean.StockData;

public class JSONUtil {
	
	
	
	public static StockData JsontoObject(String s) {
		ObjectMapper obj = new ObjectMapper();
		StockData stk = null;
		try {
			stk = obj.readValue(s, StockData.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return stk;
	}

}
