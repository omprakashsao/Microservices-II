package in.ops.om.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ops.om.bean.StockData;

public interface IStockReo extends JpaRepository<StockData, Integer> {

}
