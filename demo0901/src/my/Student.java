package my;

/**
 * 仅仅是一个POJO，Student类
 * @author 25614
 *
 */
public class Student
{
	
	public int id;
	public String name;
	public boolean sex;
	public String cellPhone;
	
	public Student(int id, String name, boolean sex, String cellPhone) 
	{
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.cellPhone = cellPhone;
	}

	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public boolean isSex()
	{
		return sex;
	}
	
	public void setSex(boolean sex) 
	{
		this.sex = sex;
	}
	
	public String getCellPhone() 
	{
		return cellPhone;
	}
	
	public void setCellPhone(String cellPhone) 
	{
		this.cellPhone = cellPhone;
	}
	
}
