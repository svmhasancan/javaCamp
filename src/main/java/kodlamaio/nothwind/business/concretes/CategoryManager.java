package kodlamaio.nothwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nothwind.business.abstracts.CategoryService;
import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.core.utilities.results.SuccessDataResult;
import kodlamaio.nothwind.dataAccess.abstracts.CategoryDao;
import kodlamaio.nothwind.entities.concretes.Category;

@Service
public class CategoryManager implements CategoryService{
	private CategoryDao categoryDao;

	@Autowired
	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	
	public DataResult<List<Category>> getAll(){
		return new SuccessDataResult<List<Category>>(categoryDao.findAll());
	}
}