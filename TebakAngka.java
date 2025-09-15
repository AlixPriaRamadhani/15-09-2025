package BuAull;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        int angkaTebakan = 7;
        int tebakan = 0;
        int kesempatan = 3;

        System.out.println("Selamat datang di permainan tebak angka");
        System.out.println("Silahkan tebak angka antara 1-100");
        System.out.println("Kamu memiliki " + kesempatan + " kesempatan");

        while (tebakan != angkaTebakan && kesempatan > 0) {
            System.out.println("Masukkan tebakanmu : ");
            Scanner input = new Scanner(System.in);
            tebakan = input.nextInt();
            kesempatan--;

            if (tebakan == angkaTebakan) {
                System.out.println("Selamat, tebakanmu benar!");
            } else if (tebakan < angkaTebakan) {
                System.out.println("Tebakanmu terlalu rendah.");
            } else {
                System.out.println("Tebakanmu terlalu tinggi.");
            }

            if (kesempatan > 0 && tebakan != angkaTebakan) {
                System.out.println("Kesempatan tersisa: " + kesempatan);
            }
        }

        if (kesempatan == 0 && tebakan != angkaTebakan) {
            System.out.println("Maaf, kamu kehabisan kesempatan. Angka yang benar adalah " + angkaTebakan);
        }

        System.out.println("Terima kasih sudah bermain!");
    }
    
}
