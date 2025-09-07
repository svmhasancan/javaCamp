package kodlamaio.nothwind.business.abstracts;

import java.util.List;

import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.entities.concretes.Category;

public interface CategoryService {
	DataResult<List<Category>> getAll();
}
