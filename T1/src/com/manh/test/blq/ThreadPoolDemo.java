package com.manh.test.blq;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo
{

    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(10);
       // Executor service2 = Executors.

        int count = 0;
        for (int i = 0; i < 100; i++)
        {
            count ++;
            service.submit(new Task(i));
       //     service2.execute(new Task(i));
        }
        

        service.shutdown();
        System.out.println(count);
    }

}

class Task implements Runnable
{
    int taskId;

    public void run()
    {
        System.out.println("Task ID : " + this.taskId + " , " + Thread.currentThread().getName());

    }

    public Task(int taskid)
    {
        this.taskId = taskid;
    }
}