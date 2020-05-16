package springfive.cms.request.models;

import java.io.Serializable;
import java.util.Set;

import lombok.Data;
import springfive.cms.models.Category;
import springfive.cms.models.Tag;

@Data
public class NewsRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3131301905268008319L;
	
	private String title;
	
	private String content;
	
	private Set<Category> categories;
	
	private Set<Tag> tags;
	
	

}
