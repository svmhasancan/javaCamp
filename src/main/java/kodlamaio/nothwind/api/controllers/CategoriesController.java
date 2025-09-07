package kodlamaio.nothwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.nothwind.business.abstracts.CategoryService;
import kodlamaio.nothwind.core.utilities.results.DataResult;
import kodlamaio.nothwind.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
	private CategoryService categoryService;

	@Autowired
	public CategoriesController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Category>> getAll(){
		return categoryService.getAll();
	}
}
