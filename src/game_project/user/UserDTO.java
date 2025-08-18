package game_project.user;

public class UserDTO {
	// 유저 DTO
	// 유저 1명의 정보 저장
	
	private String id;
	private String pass;
	private String name;
	
	public UserDTO() {}
	
	public UserDTO(String id, String pass, String name) {
		this.id = id;
		this.pass = pass;
		this.name = name;
	}
	
	// 중복 검사 (Map으로 바뀌어서 사용하지 않음)
	// 처음에 Set으로 구상했다가 유저 검색 시 빠른 탐색을 위해 Map으로 자료구조를 바꾸면서
	// 중복 검사에 사용하지 않는 코드가 되었음
	@Override
    public int hashCode() { 
		return id.hashCode() + name.hashCode();
    }
	
	@Override
    public boolean equals(Object obj) {
		if (obj instanceof UserDTO) {
			UserDTO user = (UserDTO)obj;
			return user.getId().equals(this.id) && user.getName().equals(this.name);
		}
		return false;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
