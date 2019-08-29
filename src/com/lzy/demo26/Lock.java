package com.lzy.demo26;

import java.util.Collection;
import java.util.Collections;

public interface Lock {


    public Collection<Thread> blockThread = null;

    public void lock();

    public void unlock();

    public int getBolckSize();
}
