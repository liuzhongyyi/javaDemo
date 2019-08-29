package com.lzy.demo21;

public class threadService1 {
    public Object deadlock = new Object();
    private threadService2 threadService2;

    public void setThreadService2(com.lzy.demo21.threadService2 threadService2) {
        this.threadService2 = threadService2;
    }

    public void Service1_m() {
        synchronized (deadlock) {
            System.out.println("service_m");
            threadService2.Service2_m();
        }
    }


    public void Service1_m2() {
        synchronized (deadlock) {
            System.out.println("service_m2");
        }
    }
}