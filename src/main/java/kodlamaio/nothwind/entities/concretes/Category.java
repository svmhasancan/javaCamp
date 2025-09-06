package kodlamaio.nothwind.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name = "category_id")
	public int categoryId;
	
	@Column(name = "category_name")
	public String categoryName;

	public Category() {
		
	}
	
	public Category(int categoryId, String categoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
	}


	
}