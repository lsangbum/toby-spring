package com.example.demo.proxy;

public class HelloTarget implements Hello{


    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayHi(String name) {
        return "Hi " + name;
    }

    @Override
    public String sayBye(String name) {
        return "Bye " + name;
    }
}
