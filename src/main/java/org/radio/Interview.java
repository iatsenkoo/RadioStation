package org.radio;

public class Interview extends ConcreteBroadcasting {
    private String nameInterviewee;
    private final int priceMinute = 30;

    public Interview(int duration, String nameInterviewee) {
        super(duration);
        this.nameInterviewee = nameInterviewee;
    }

    @Override
    public String toString() {
        return "Interview{" +
                "nameInterviewee='" + nameInterviewee + '\'' +
                ", priceMinute=" + priceMinute +
                '}';
    }

    @Override
    public int getProfit() {
        return this.priceMinute*this.getDuration();
    }
}
