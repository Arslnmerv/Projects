package team3Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Loto {

    public static void main(String[] args) {
	/*
    1-Kullanıcıdan haftanin sonuçlarını al.(6Top--random)

-Random r=new Random(); //random sınıfı
 int a=r.nextInt(7);
 Burada parantez içerisine 7 yazmamızın sebebi,1 den 7'ye  kadar değerler üretmesidir.Fakat buna 7 dahil değildir.
 Eğer parantez içerisini boş bırakırsak -2147483648 ve +2147486647 arasındaki bütün int değerlerini üretir.

 --Java'da random sayı üretmenin bir diğer yolu yolu da Math sınıfında bulunan Random metodudur.
int sayi = (int)(Math.random()*49);
System.out.println(sayi);

    2-Kullanicidan oynamış olduğu kolonun numaralarını al.(Top[6])
    3-1.ve2.maddeyi karşılaştır.(nested for-if-else)
    4-sonucu ekrana yaz.
    5-Başka Kolon oynayıp oynamadığını sor(do || while)
    6-Başka kolon oynamışsa 2.maddeye geri dön.Aksi takdirde,programi bitir.
     */


        String devamMi = "";
        do {
            int kolon[] = new int[6];
            Scanner scan = new Scanner(System.in);
            System.out.println("Kolondaki 6 numarayi giriniz : ");

            for (int i = 0; i < kolon.length; i++) {
                kolon[i] = scan.nextInt();

            }
            System.out.println(Arrays.toString(kolon));
            List<Integer> eslesenler = new ArrayList<>();
            eslesenler = karsilastir(kolon, rastgeleNumaraUret());

            if (eslesenler.size() == 0) {
                System.out.println("Hic tutturamadiniz!!Tekrar deneyiniz");
            } else {
                System.out.println("Tebrikler!" + eslesenler.size() + " sayi tutturdunuz.");

            }
            System.out.println("Devam etmek istiyor musnz (E/H)");
            devamMi = scan.next();
        } while (devamMi.equalsIgnoreCase("E"));
        System.out.println("Gayet basarisiz");
    }

    public static int[] rastgeleNumaraUret() {
        int lotoNumber[] = new int[6];
        for (int i = 0; i < lotoNumber.length; i++) {
            lotoNumber[i] = 1 + (int) (Math.random() * 49);
        }
        System.out.println(Arrays.toString(lotoNumber));
        return lotoNumber;
    }

    private static List<Integer> karsilastir(int[] kolon, int[] rastgeleNumaraUret) {

        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < kolon.length; i++) {
            if (kolon[i] == rastgeleNumaraUret[i]) {
                lst.add(kolon[i]);
            }
        }

        return lst;


    }


}

