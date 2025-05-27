package com.headfirstjava.chapter11;

import javax.sound.midi.*;

public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Успешно получили синтезатор");
        } catch (MidiUnavailableException ex) {
            System.out.println("Неудача");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}