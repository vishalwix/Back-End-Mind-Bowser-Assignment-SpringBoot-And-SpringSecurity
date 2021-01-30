package com.mindbowser.assignment.message.request;

import java.util.Set;

import javax.validation.constraints.*;

import org.hibernate.annotations.NaturalId;

public class SignUpForm {
	
	private Set<String> role;
	
	
	@NotBlank
    @Size(min=3, max = 50)
    private String first_name; 
    

	@NotBlank
    @Size(min=6, max = 50)
    private String last_name;

    @NotBlank
    @Size(min=3, max = 50)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(min=6, max = 100)
    private String password;  
    
    
    @NotBlank
    @Size(min=6, max = 50)
    private String dob;
    
    @NotBlank
    @Size(min=6, max = 50)
    private String company;
    
    @NotBlank
    @Size(min=6, max = 50)
    private String address;

    public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String fisrt_name) {
		this.first_name = fisrt_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    public Set<String> getRole() {
    	return this.role;
    }
    
    public void setRole(Set<String> role) {
    	this.role = role;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}



