package org.radio;

import java.util.ArrayList;

public class RadioPresenter {
    private String name;
    private int experience;
    private String resume;
    private ArrayList<ConcreteBroadcasting> concreteBroadcastings = new ArrayList<>();

    private RadioPresenter() {
    }

    public static class Builder{
        private RadioPresenter radioPresenter = new RadioPresenter();
        public Builder name(String name){
            radioPresenter.name = name;
            return this;
        }
        public Builder experience(int experience){
            radioPresenter.experience = experience;
            return this;
        }
        public Builder broadcasting(ConcreteBroadcasting broadcasting){
            radioPresenter.concreteBroadcastings.add(broadcasting);
            return this;
        }
        public Builder resume (String resume){
            radioPresenter.resume = resume;
            return this;
        }

        public RadioPresenter build(){
            return radioPresenter;
        }
    }

    @Override
    public String toString() {
        return "RadioPresenter{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", resume='" + resume + '\'' +
                ", concreteBroadcastings=" + concreteBroadcastings +
                '}';
    }
}
