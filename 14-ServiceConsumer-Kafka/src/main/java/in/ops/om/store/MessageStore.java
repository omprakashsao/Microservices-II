package in.ops.om.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ops.om.bean.StockData;
import in.ops.om.repo.IStockReo;

@Component
public class MessageStore {

	@Autowired
	private IStockReo repo;
	
	public void saveData(StockData s) {
		repo.save(s);
	}
	
	public List<StockData> getAll(){
		return repo.findAll();
	}
}
