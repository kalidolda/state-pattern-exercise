package com.example.examplestatemachine;

public class AA extends State {
    AA(StateContext sc) {
        super(sc);
        accept = true;
        System.out.println("Accept A state");
    }

    public void actionA() {
        context.setState(this);
    }

    public void actionB() {
        context.setState(new RB(context));
    }

    public boolean isAccept() {
        return this.accept;
    }
}
