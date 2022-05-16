package org.radio;

public abstract class ConcreteBroadcasting {
    private int duration;

    public ConcreteBroadcasting(int duration) {
        this.duration = duration;
    }

    public abstract int getProfit();
    public boolean isProfitable(){
        return getProfit()>0;
    }

    public int getDuration() {
        return duration;
    }

}
