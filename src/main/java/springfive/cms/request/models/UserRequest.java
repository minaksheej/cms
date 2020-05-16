package springfive.cms.request.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserRequest  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8512176292974644276L;
	
	private String identity;
	
	private String name;
	
	private String role;
	

}
