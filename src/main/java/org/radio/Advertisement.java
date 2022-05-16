package org.radio;

public class Advertisement extends ConcreteBroadcasting {
    private String nameAdProduuct;
    private final int priceSecond = 5;

    public Advertisement(int duration, String nameAdProduuct) {
        super(duration);
        this.nameAdProduuct = nameAdProduuct;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "nameAdProduuct='" + nameAdProduuct + '\'' +
                ", priceSecond=" + priceSecond +
                '}';
    }

    @Override
    public int getProfit() {
        return this.priceSecond*60*this.getDuration();
    }
}
