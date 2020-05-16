package springfive.cms.request.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class CategoryRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8552072183614502862L;
	
	private  String name;

}
