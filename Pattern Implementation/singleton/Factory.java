package com.company.singletonfactory;

class Product{
}

public interface Factory {
    Product create();
}

class SingletonFactory implements Factory {
    private Product product;

    public synchronized Product create() {
        if (this.product == null) {
            product = new Product();
        }
        return product;
    }
}