package kodlamaio.nothwind.business.abstracts;

import java.util.List;

import kodlamaio.nothwind.entities.concretes.Category;

public interface CategoryService {
	List<Category> getAll();
}
