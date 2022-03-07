import java.util.concurrent.TimeUnit;

public class DmvSimulator 
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the Virtual DMV!");
		time(1);
		
		int position = (int)(Math.random() * 200 + 1);
		System.out.println("Your number is " + position + ", please wait until it is called.");
		
		int iter = position + 1;
		while (iter <= 200)
		{
			time(1);
			System.out.println(iter + "!");
			iter++;
		}
		
		iter = 1;
		while (iter <= position)
		{
			time(1);
			System.out.println(iter + "!");
			iter++;
		}
		time(3);
		System.out.println("Welcome to the Virtual DMV, can I see your paperwork?");
		time(3);
		System.out.println("Oh, you don't have it?");
		time(1);
		System.out.println("Wow, way to waste out time, have you never been to a DMV before or something? Your mother doesn't love you!");
	}
	
	public static void time(int s)
	{
		try 
		{
			TimeUnit.SECONDS.sleep(s);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("ERROR");
			System.exit(1);
		}
	}
}
