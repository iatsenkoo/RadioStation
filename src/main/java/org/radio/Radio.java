package org.radio;

public class Radio {
    private Broadcasting broadcast;

    public Radio(Broadcasting broadcast) {
        this.broadcast = broadcast;
    }

    public void start(){
        System.out.println("radio started broadcasting");
    }

}
