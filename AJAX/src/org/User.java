package org;

public class User
{
	String userName;
	String password;
	String email;
	String name;
	
	public User()
	{}

	public User(String userName, String password, String email, String name)
	{
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.name = name;
	}

	public String getUserName()
	{
		return userName;
	}

	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	
}
