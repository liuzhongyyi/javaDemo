package com.lzy.demo26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BooleanLock implements Lock {

    private static Collection<Thread> blockThread = new ArrayList<>();

    private static Boolean intValue = false;

    Thread currentThread;

    @Override
    public void lock() {
        synchronized (intValue) {
            while (intValue == true) {
                blockThread.add(Thread.currentThread());
                try {
                    intValue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        blockThread.remove(Thread.currentThread());
        intValue = true;
        currentThread = Thread.currentThread();

    }

    @Override
    public void unlock() {
        synchronized (intValue) {
            if (Thread.currentThread() == currentThread) {
                intValue.notifyAll();
                intValue = false;

                System.out.println("lock release");
            }
        }
    }

    @Override
    public int getBolckSize() {
        return Collections.unmodifiableCollection(blockThread).size();
    }
}
