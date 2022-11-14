// https://app.patika.dev/
// https://app.patika.dev/thendbranch

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan Değer Al
        System.out.print("satır sayısı giriniz : ");
        int s = input.nextInt();

        // Satır sayısı için döngü kur
        for (int i = 1; i <= s; i++) {
            //Hesaplanan boşluk için döngü
            for (int j = 1; j <= s-i; j++) {
                System.out.print(" ");
            }
            //Hesaplanan * için döngü
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            // alt satıra geç
            System.out.println("");
        }
        // geri dönüş adımları başangıçlar değişir satır azalı
        for (int i = s-1; i >= 1; i--) {
            // boşluk döngüsü
            for (int j = 1; j <= (s-i) ; j++) {
                System.out.print(" ");
            }
            // * döngüsü
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            // alt satıra geç
            System.out.println();
        }
    }
}
