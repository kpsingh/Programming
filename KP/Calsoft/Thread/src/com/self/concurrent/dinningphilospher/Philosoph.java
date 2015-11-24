package com.self.concurrent.dinningphilospher;

public class Philosoph implements Runnable {

	private Table table;
	private int place;

	Philosoph(Table table, int place) {
		this.table = table;
		this.place = place;
	}

	public void run() // life of a Philospher.
	{
		while (true)
		{
			thinking(place);
			table.takeForks(place);
			eating(place);
			table.putForks(place);
		}
	}
	
	private void thinking(int place)
	{
		System.out.println("Philospher " + place + " is thinking!");
		try
		{
			Thread.sleep((long) (Math.random()*20000));
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private void eating(int place)
	{
		System.out.println("Philospher " + place + " is starts eating!");
		try
		{
			Thread.sleep((long) (Math.random()*20000));
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Philospher " + place + " is finished eating!");
		
	}

}
