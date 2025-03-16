package in.ops.om.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "stock_info")
public class StockData {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stkId;
	private String code;
	private String cost;
}
