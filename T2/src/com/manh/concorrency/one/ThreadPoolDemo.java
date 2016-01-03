package com.manh.concorrency.one;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo
{
    public static void main(String[] args)
    {
        ExecutorService executer = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 100; i++)
        {
            executer.execute(new MyTask(i));
        }
    }

}

class MyTask implements Runnable
{
    int taskId;

    public MyTask(int taskId)
    {
        this.taskId = taskId;
    }

    public void run()
    {
        System.out.println("Task : " + taskId + ", executed by thread " + Thread.currentThread().getName());

    }
}