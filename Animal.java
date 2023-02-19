package Method;

public class Animal {
	//variable name
	String name;
	String breed;
	int age;
	String Color;
	//constructor declaring a class
	public Animal(String name,String breed,int age,String Color )
	{
		this.name = name;
		this.breed = breed;
		this.age  = age;
		this.Color = Color;
	}
	//method 1
	public String getname()
	{
		return name;
		
	}
		//method 2
	public String getbreed()
	{
		return  breed;
	}
  //method 3
	public int getage()
	{
	
	return age;
	}
	//method 4 
	public String getcolor()
	{
		return Color;
	}
	public String toString()
    {
        return("Hi my  pet name is "+ this.getname()+
               ".\nher breed,age and color are " +
               this.getbreed()+"," + this.getage()+
               ","+ this.getcolor());
    }
	  public static void main(String[] args)
	    {
	        Animal tuffy = new Animal("tuffy","papillon", 5, "white");
	        System.out.println(tuffy.toString());
	}

	
	}
	
	

