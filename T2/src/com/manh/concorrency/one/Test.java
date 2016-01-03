package com.manh.concorrency.one;

public class Test {
    public static void main(String[] args) throws InterruptedException {

           Task task1 = new Task("T1 ----->");
           Task task2 = new Task("T2");
           ThreadContainer tc = new ThreadContainer(task1, task2);
           tc.runThreads();
    }
}

class ThreadContainer {
    Task r1;
    Task r2;

    ThreadContainer(Task r1, Task r2) {
           this.r1 = r1;
           this.r2 = r2;

    }

    void runThreads() throws InterruptedException {
           while (true) {
                  r1.run();
                  r2.setCondition(true);
                  r1.setCondition(false);
                  r2.run();
                  r2.setCondition(false);
                  r1.setCondition(true);
                  //Thread.sleep(1000);
           }
    }
}

class Task implements Runnable {

    String name;
    Boolean condition = false;

    public Task(String name) {

           this.name = name;

    }

    public void setCondition(Boolean name) {
           this.condition = name;
    }

    @Override
    public void run() {
           if (condition) {
                  process();
           }

    }

    void process() {

           System.out.println("Running " + name + " method");

    }

}
