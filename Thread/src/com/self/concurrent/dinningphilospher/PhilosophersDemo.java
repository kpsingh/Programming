package com.self.concurrent.dinningphilospher;

public class PhilosophersDemo {

	private static final int noOfPhilosphers = 5;

	public static void main(String[] args)
	{

		Table table = new Table(noOfPhilosphers);
		for(int i = 0; i< noOfPhilosphers; i++)
		{
			new Thread(new Philosoph(table, i)).start();;
		}
	}

}
