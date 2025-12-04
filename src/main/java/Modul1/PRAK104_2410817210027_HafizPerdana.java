package Modul1;

import java.util.Scanner;

public class PRAK104_2410817210027_HafizPerdana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String[] abuMoves = sc.nextLine().split(" ");

        System.out.print("Tangan Bagas: ");
        String[] bagasMoves = sc.nextLine().split(" ");

        int abuScore = 0;
        int bagasScore = 0;

        for (int i = 0; i < 3; i++) {
            String abu = abuMoves[i];
            String bagas = bagasMoves[i];

            if (abu.equals(bagas)) {
            } else if (abu.equals("B") && bagas.equals("G")) {
                abuScore++;
            } else if (abu.equals("G") && bagas.equals("K")) {
                abuScore++;
            } else if (abu.equals("K") && bagas.equals("B")) {
                abuScore++;
            } else {
                bagasScore++;
            }
        }

        if (abuScore > bagasScore) {
            System.out.println("Abu");
        } else if (bagasScore > abuScore) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
        sc.close();
    }
}