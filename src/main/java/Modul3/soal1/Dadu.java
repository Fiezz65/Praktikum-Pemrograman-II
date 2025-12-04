package Modul3.soal1;

import java.util.Random;

public class Dadu {
    private int value;
    private Random random = new Random();

    public void acakNilai() {
        value = random.nextInt(6) + 1;
    }

    public int getValue() {
        return value;
    }
}