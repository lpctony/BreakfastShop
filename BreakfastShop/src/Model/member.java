package Model;

public class member {

	private Integer id;
	private String name;
	private String username;
	private String password;
	private String address;
	private String mob;
	private String tel;

	public member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public member(String name, String username, String password, String address, String mob, String tel) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.address = address;
		this.mob = mob;
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
