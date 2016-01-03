package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Threadtest {
	
	private static boolean stopRequest;
	
	public static void main(String[] args) throws InterruptedException
	{/*
		Thread backgroud = new Thread(new Runnable() {
			
			@Override
			public void run()
			{
				int i =0;
				
				while(stopRequest)
				{
					i++;
				}
				
			}
		});
		
		backgroud.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequest = true;
		
	*/
		
	Integer []arry = {new Integer(1), new Integer(2), new Integer(3)};
	Arrays.asList(arry);
	
	
	}

}
