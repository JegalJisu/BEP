package name.beptest.api.dto;

import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "USER_TBL")
public class UserDTO {
	private String idx;
	private String id;
	private String password;
	private String name;
	private String email;
}
