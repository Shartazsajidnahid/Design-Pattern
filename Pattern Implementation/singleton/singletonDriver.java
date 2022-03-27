package com.company.singletonfactory;

public class singletonDriver {
    public void run_singleton() {
        Factory factory = new SingletonFactory();
        Product p1 = factory.create();
        for (int i = 0; i < 100; i++) {
            if (factory.create() != p1) {
                System.out.println("Factory returned another instance of Product!");
            }
        }
    }
}