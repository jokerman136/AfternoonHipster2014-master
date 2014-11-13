package ctec.hipster.model;


/**
 * Hipster object for the Hipster Project 2014
 * @author rjon7928
 * @version 1.1 11/13/14
 *
 */
public class Hipster
{

	private String name;
	private int age;
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterAlbums()
	{
		return hipsterAlbums;
	}

	public void setHipsterAlbums(String[] hipsterAlbums)
	{
		this.hipsterAlbums = hipsterAlbums;
	}

	private String [] hipsterAlbums;
	
	public Hipster()
	{
		name = "";
		age = -99;
		hipsterAlbums = null;
	}
	
	public Hipster(String name, int age)
	{
		this.name = name;
		this.age = age;
		hipsterAlbums = null;
	}
}
