package com.example.examplestatemachine;

public class AB extends State {
    AB(StateContext sc) {
        super(sc);
        accept = true;
        System.out.println("Accept B state");
    }

    public void actionA() {
        context.setState(new RA(context));
    }

    public void actionB() {
        context.setState(this);
    }

    public boolean isAccept() {
        return this.accept;
    }
}
