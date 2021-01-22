package com.icoderman.behavioral.state.example1;

public class Fan {
    private State fanOffState;
    private State fanLowState;
    private State fanMedState;
    private State fanHighState;

    private State state;
    private State highLowState;

    public Fan() {
        fanOffState = new FanOffState(this);
        fanLowState = new FanLowState(this);
        fanMedState = new FanMedState(this);
        fanHighState = new FanHighState(this);

        state = fanOffState;
    }

    public State getFanLowState() {
        return fanLowState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pullChain() {
        state.handleRequest();
    }

    public String toString() {
        return state.toString();
    }

    public State getFanOffState() {
        return fanOffState;
    }

    public State getFanMedState() {
        return fanMedState;
    }

    public State getState() {
        return state;
    }

    public State getFanHighState() {
        return fanHighState;
    }

}
