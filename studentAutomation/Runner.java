package studentAutomation;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        int secim = 0;
        while (secim != 4) {

            System.out.println("Lütfen yapmak istediginiz islemi seciniz :  \n" + " 1-Ogrenci Kaydi\n 2-Ogrenci Bilgileri Görüntüleme \n 3-Ogrenci Silme \n 4-Cikis");
            Scanner scan = new Scanner(System.in);
            secim = scan.nextInt();
            switch (secim) {

                case 1:
                    OgrenciOlusturma.ogrenciKaydi();
                    break;
                case 2:
                    OgrenciOlusturma.ogrenciBilgileriGoruntuleme();
                    break;
                case 3:
                    OgrenciOlusturma.ogrenciSilme();
                    break;
                case 4:
                    System.out.println("Iyi gunler!");
                    break;


            }

        }

    }

}

