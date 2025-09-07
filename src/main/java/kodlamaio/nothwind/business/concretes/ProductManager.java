package kodlamaio.nothwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nothwind.business.abstracts.ProductService;
import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.core.utilities.results.Result;
import kodlamaio.nothwind.core.utilities.results.SuccessDataResult;
import kodlamaio.nothwind.core.utilities.results.SuccessResult;
import kodlamaio.nothwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nothwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{
	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll());
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}
}