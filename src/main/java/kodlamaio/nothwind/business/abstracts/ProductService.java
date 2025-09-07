package kodlamaio.nothwind.business.abstracts;

import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.core.utilities.results.Result;
import kodlamaio.nothwind.entities.concretes.Product;
import java.util.List;

public interface ProductService {
	DataResult<List<Product>>  getAll();
	Result add(Product product);
}
