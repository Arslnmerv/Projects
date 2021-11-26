package team3Project;

import java.util.Arrays;
import java.util.Scanner;

public class AverageCalculation {
    //  Kullanıcıdan kaç tane sayının ortalamasını bulmasını istediğini sorun
    //  ve buna bağlı olarak aldıgınız değerleri bir dizide saklayın.
    //  Veri alma işlemi bittikten sonra tüm sayıları ve ortalamasını
    //  ekrana yazdırın.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kaç tane sayi girmek istiyorsunuz");
        int sayi = scan.nextInt();
        int toplam = 0;
        int arr[] = new int[sayi];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = scan.nextInt();

            toplam += arr[i];

        }

        System.out.println(Arrays.toString(arr) + "Ortalama :  " + toplam / sayi);

    }
}
