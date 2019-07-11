package com.zx5435.pcmoto.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Demo1 {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(222);
        a.add(333);
        a.add(123);

        Iterator<Integer> iterator = a.iterator();

        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }

        List<Integer> integers = Collections.unmodifiableList(a);

        ReentrantLock r = new ReentrantLock();
        r.lock();

        try {
            System.out.println("qwe = 1");
        } finally {
            r.unlock();
        }

    }

}

abstract class Cat {
    public static void sayHi() {
        System.out.println("hi~");
    }
}
