package Cocky_Camel.hospital;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nurse {
	@JsonProperty("Name")
	private String name;
	@JsonProperty("User")
	private String user;
	@JsonProperty("Password")
	private String password;

	public Nurse() {
	}

	public Nurse(String name, String user, String password) {
		this.name = name;
		this.user = user;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
