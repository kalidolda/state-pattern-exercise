package com.example.examplestatemachine;

public class StateContext {
    private State state;

    StateContext() {
        state = new Initial(this);
    }

    public void actionA() {
        state.actionA();
    }

    public void actionB() {
        state.actionB();
    }

    public boolean isAccept() {
        return state.isAccept();
    }

    public void setState(State newState) {
        state = newState;
    }
}
