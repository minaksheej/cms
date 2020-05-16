package springfive.cms.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfive.cms.models.Category;
import springfive.cms.request.models.CategoryRequest;
import springfive.cms.service.CategoryService;

@RestController
@RequestMapping("/api/category")
@Api(tags="category",description="Category API")
public class CategoryResource {

	@Autowired
	private CategoryService categoryService;

	@GetMapping("/{id}")
	@ApiOperation(value="Find Category" ,notes="Find the Category by ID")
	@ApiResponses(value= {
		@ApiResponse(code=200,message="category found"),
		@ApiResponse(code=404,message="category not found"),
	})
	public ResponseEntity<Category> findOneCategory(@PathVariable("id") String id) {
		return new ResponseEntity<Category>(categoryService.findOneCategory(id), HttpStatus.OK);
	}

	@ApiOperation(value="Find Category list " ,notes="Find all  Category ")
	@ApiResponses(value= {
		@ApiResponse(code=200,message="category found"),
		@ApiResponse(code=404,message="category not found"),
	})
	@GetMapping
	public ResponseEntity<List<Category>> findAll(@RequestBody CategoryRequest categoryRequest) {
		return null;

	}

	@ApiOperation(value="create  Category  " ,notes="it permits to create a new category")
	@ApiResponses(value= {
		@ApiResponse(code=201,message="category created successfully"),
		@ApiResponse(code=400,message="invalid request"),
	})
	@PostMapping
	public ResponseEntity<Category> newCategory(@RequestBody CategoryRequest category) {
		return new ResponseEntity<Category>(categoryService.create(category), HttpStatus.CREATED);

	}

	@ApiOperation(value="delete  Category  " ,notes="it permits to delete a  category")
	@ApiResponses(value= {
		@ApiResponse(code=200,message="category removed  successfully"),
		@ApiResponse(code=404,message="category not found"),
	})
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remove(@PathVariable("id") String id) {
		categoryService.delete(id);

	}

	@ApiOperation(value="update  Category  " ,notes="it permits to update a  category")
	@ApiResponses(value= {
		@ApiResponse(code=200,message="category updated  successfully"),
		@ApiResponse(code=404,message="category nor found"),
		@ApiResponse(code=400,message="invalid request"),
	})
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@RequestBody CategoryRequest categoryRequest,
			@PathVariable("id") String id) {
		return new ResponseEntity<Category>(categoryService.update(categoryRequest, id), HttpStatus.OK);
	}

}
