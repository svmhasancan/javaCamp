package kodlamaio.nothwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo -1, pageSize);
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}
	
	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC , "productName");
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort));
	}
	
	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName));
	}

	@Override
	public DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId));
	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategoryId(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId));
	}

//	@Override
//	public DataResult<List<Product>> getByCategory_IdIn(List<Integer> categories) {
//		return new SuccessDataResult<List<Product>>(this.productDao.getByCategory_IdIn(categories));
//	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName));
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName));
	}

	@Override
	public DataResult<List<Product>> getByProductAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductAndCategory(productName, categoryId));
	}
}