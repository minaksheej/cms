package springfive.cms.service;

import springfive.cms.models.Category;
import springfive.cms.request.models.CategoryRequest;

public interface CategoryService {

	Category findOneCategory(String id);

	Category create(CategoryRequest category);

	Category update(CategoryRequest categoryRequest, String id);

	void delete(String id);

}
