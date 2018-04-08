package com.example.examplestatemachine;

public class RB extends State {
    RB(StateContext sc) {
        super(sc);
        accept = false;
        System.out.println("Reject B state");
    }

    public void actionA() {
        context.setState(new AA(context));
    }

    public void actionB() {
        context.setState(this);
    }

    public boolean isAccept() {
        return this.accept;
    }
}
