package org.radio;

public class Song extends ConcreteBroadcasting {
    private String nameSinger;
    private String titleSong;
    private final int priceMinute = 0;

    public Song(int duration, String nameSinger, String titleSong) {
        super(duration);
        this.nameSinger = nameSinger;
        this.titleSong = titleSong;
    }

    @Override
    public String toString() {
        return "Song{" +
                "nameSinger='" + nameSinger + '\'' +
                ", titleSong='" + titleSong + '\'' +
                ", priceMinute=" + priceMinute +
                '}';
    }

    @Override
    public int getProfit() {
        return this.priceMinute*this.getDuration();
    }
}
