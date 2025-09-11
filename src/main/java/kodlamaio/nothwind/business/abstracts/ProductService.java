package kodlamaio.nothwind.business.abstracts;

import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.core.utilities.results.Result;
import kodlamaio.nothwind.entities.concretes.Product;
import java.util.List;

public interface ProductService {
	DataResult<List<Product>>  getAll();
	DataResult<List<Product>> getAll(int pageNo , int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	DataResult<Product> getByProductNameAndCategoryId(String productName,int categoryId);
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName ,int categoryId);
	//DataResult<List<Product>> getByCategory_IdIn(List<Integer> categories);
	DataResult<List<Product>> getByProductNameContains(String productName);
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByProductAndCategory(String productName , int categoryId);
}
