package ex08Class;

public class Human
{

	String name;
	int age;
	int energy;

	void walking()
	{
		energy--;
		if (energy < 0)
		{
			energy = 0;
			System.out.println("[walk] || 4700 944.");
			System.out.println("49.");
			System.out.println("[walk] || 1 849");
		} else
		{
		}
	}

	void thinking()
	{
		energy -= 2;
		if (energy < 0)
		{
			energy = 0;

			System.out.println("[thinking] 400 4.");
			System.out.println(" ");
		} 
		else
		{
			System.out.println("[thinking] 24");
		}
	}
}
