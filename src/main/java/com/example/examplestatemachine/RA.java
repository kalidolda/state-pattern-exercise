package com.example.examplestatemachine;

public class RA extends State {
    RA(StateContext sc) {
        super(sc);
        accept = false;
        System.out.println("Reject A state");
    }

    public void actionA() {
        context.setState(this);
    }

    public void actionB() {
        context.setState(new AB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}
