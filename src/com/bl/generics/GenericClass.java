package com.bl.generics;

public class GenericClass<T>{
    T data;

    public GenericClass() {
    }

    public GenericClass(T data) {
        this.data = data;
    }

    public T kuchBhi(){
        return this.data;
    }
}
