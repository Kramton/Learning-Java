package JavaBasics01;

class Monkey
{
	String type = "Spider Monkey";
	
	public static void sayOAA()
	{
		System.out.println("Ooh Aah Aah");
	}
}

public class ObjectArrayJava 
{
	public static void main(String[] args) 
	{
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		
		Monkey[] monkeys = {m1, m2, m3};
		
		for(Monkey m : monkeys)
		{
			m.sayOAA();
		}
	}
}