package com.example.examplestatemachine;

public class Initial extends State{
    Initial(StateContext sc) {
        super(sc);
        accept = false;
        System.out.println("Initial state");
    }

    public void actionA() {
        context.setState(new AA(context));
    }

    public void actionB() {
        context.setState(new AB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}
