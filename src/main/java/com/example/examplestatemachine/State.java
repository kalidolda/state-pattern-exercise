package com.example.examplestatemachine;

public abstract class State {
    protected StateContext context;
    protected boolean accept;

    public State(StateContext sc) {
        context = sc;
    }
    
    public void actionA() {}
    
    public void actionB() {}
    
    public boolean isAccept() {
        return this.accept;
    }
}
