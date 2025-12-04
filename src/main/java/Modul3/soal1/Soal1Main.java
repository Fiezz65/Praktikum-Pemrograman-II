package Modul3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Dadu> diceList = new LinkedList<>();

        int totalDice = sc.nextInt();
        int total = 0;
        for (int i = 1; i <= totalDice; i++) {
            Dadu dice = new Dadu();
            dice.acakNilai();
            diceList.add(dice);
            System.out.println("Dadu ke-" + i + " bernilai " + dice.getValue());
            total += dice.getValue();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
        sc.close();
    }
}