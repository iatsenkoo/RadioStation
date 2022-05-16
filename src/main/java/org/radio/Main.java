package org.radio;

public class Main {
    public static void main(String[] args) {
        Broadcasting broadcast = new Broadcasting(45);
        Radio radio = new Radio(broadcast);
        radio.start();
        System.out.println(broadcast.toString());

        ConcreteBroadcasting song = new Song(5, "tt","tt");
        RadioPresenter radioPresenter = new RadioPresenter.Builder()
                                                            .name("Alex")
                                                            .broadcasting(song)
                                                            .build();
        System.out.println(radioPresenter.toString());
        broadcast.addBroadcast(song);

        ConcreteBroadcasting interview = new Interview(15, "Ivan");
        RadioPresenter unknownRadioPresenter = new RadioPresenter.Builder()
                .resume("резюме")
                .broadcasting(interview)
                .build();
        System.out.println(unknownRadioPresenter.toString());
        broadcast.addBroadcast(interview);

        ConcreteBroadcasting ad = new Advertisement(20,"some ad");
        broadcast.addBroadcast(ad);

        ConcreteBroadcasting ad2 = new Advertisement(10, "some else ad");
        broadcast.addBroadcast(ad2);

        ConcreteBroadcasting interview2 = new Interview(5,"Vasya");
        broadcast.addBroadcast(interview2);

    }
}
