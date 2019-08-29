package com.lzy.demo21;

public class threadService2 {
    public Object deadlock = new Object();
    private threadService1 threadService1;

    public void setThreadService1(threadService1 threadService1) {
        this.threadService1 = threadService1;
    }

    public void Service2_m() {
        synchronized (deadlock) {
            System.out.println("service_m");
            threadService1.Service1_m();
        }
    }


    public void Service2_m2() {
        synchronized (deadlock) {
            System.out.println("service_m2");
        }
    }
}
