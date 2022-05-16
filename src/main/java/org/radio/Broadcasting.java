package org.radio;

import java.util.ArrayList;

public class Broadcasting implements Broadcast {
    private final int duration;
    private int profit;
    private int currentDuration;
    private ArrayList<ConcreteBroadcasting> concreteBroadcastArrayList = new ArrayList<>();

    public Broadcasting(int duration) {
        this.duration = duration;
    }

    @Override
    public void addBroadcast(ConcreteBroadcasting concreteBroadcast) {

        if( this.currentDuration + concreteBroadcast.getDuration() <= this.duration){
            if(concreteBroadcast.isProfitable()){
                if(this.currentDuration <= this.duration/2){
                    this.currentDuration += concreteBroadcast.getDuration();
                    this.profit += concreteBroadcast.getProfit();
                    this.concreteBroadcastArrayList.add(concreteBroadcast);
                    System.out.println("profitable broadcast added");
                    System.out.println(this.toString());
                } else {
                    System.out.println("you can't add this broadcast, payable broadcasting is more then 50%");
                    System.out.println(this.toString());
                }
            } else {
                this.currentDuration += concreteBroadcast.getDuration();
                this.profit += concreteBroadcast.getProfit();
                this.concreteBroadcastArrayList.add(concreteBroadcast);
                System.out.println("broadcast added");
                System.out.println(this.toString());
            }
        } else {
            System.out.println("you can't add this broadcast, additional duration is more then whole duration");
            System.out.println(this.toString());
        }
    }

    @Override
    public String toString() {
        return "Broadcast{" +
                "duration=" + duration +
                ", profit=" + profit +
                ", currentDuration=" + currentDuration +
                ", concreteBroadcastArrayList=" + concreteBroadcastArrayList +
                '}';
    }
}
