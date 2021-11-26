package studentAutomation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OgrenciOlusturma {

    /*1 - Bir Ogrenci giris sistemi olusturun. Once kullanici adi ve sifre girmesini isteyin
       Sistemde kayitli degilse uyelik olusturma menusune yonlendirin. Olusturukdan sonra giris sayfasina donsun
       Eger basarili bir sekilde giris yaparsa OgrenciOlusturma menusune gonderin
      2 - Ogrenci adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
      ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
      getter ve setter methodlari olusturun default constructor ve tum degiskenleri
      iceren parametleri constructor olusturun.
      3 -OgrenciOlusturma adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
      ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile cagirin.
      4 - Runner olusturun ve programi calistirin
.*/
    static String username = "";
    static String password = "";
    static int no;
    static Map<String, String> usernameAndPasswords = new HashMap<>();
    static Map<Integer, String> ogrenciBilgileri = new HashMap<>();

    static Scanner scan = new Scanner(System.in);
    //Ogrenci obje = new Ogrenci();

    public static void main(String[] args) {
        ogrenciBilgileri.put(101, "Esra Buyuk");
        ogrenciBilgileri.put(102, "Ayse Kaplan");
        ogrenciBilgileri.put(103, "Fatma Kucuk");
        ogrenciBilgileri.put(104, "Hayriye Kocak");
        ogrenciBilgileri.put(105, "Su Mabeyn");
        usernameAndPasswords.put("esrabuyuk", "esra101");
        System.out.println("Lutfen kullanici adi ve sifrenizi giriniz");
        username = scan.nextLine();
        password = scan.nextLine();

        if (usernameAndPasswords.containsKey(username)) {
            if (usernameAndPasswords.get(username).equals(password)) {
                System.out.println("Basariyla giris yaptiniz");

            }
        } else {
            System.out.println("Kaydiniz bulunmamaktadir.Lutfen kayit olunuz");
            kullaniciAdiOlusturma();

        }

    }

    private static void kullaniciAdiOlusturma() {
        System.out.println("Lutfen bir kullanici adi olusturunuz");
        username = scan.nextLine();
        System.out.println("Lutfen bir sifre olusturunuz");
        password = scan.nextLine();
        usernameAndPasswords.put(username, password);
        System.out.println("Kaydiniz basariyla olusturulmustur");
    }


    public static void ogrenciKaydi() {
        Map<Integer, String> ogrenciBilgileriKayitsiz = new HashMap<>();

        System.out.println("Lutfen ogrenci no giriniz");
        no = scan.nextInt();
        scan.nextLine();
        System.out.println("Lutfen isim soyisim not ort. giriniz");
        String isimSoyisimNot = scan.nextLine();


        ogrenciBilgileriKayitsiz.put(no, isimSoyisimNot);

        System.out.println("Ogrenci no , isim soyisim , not ort : " + ogrenciBilgileriKayitsiz);

        System.out.println("------>>>>Kaydiniz basariyla olusturulmustur.<<<<------");
        ogrenciBilgileri.put(no, isimSoyisimNot);
    }

    public static void ogrenciBilgileriGoruntuleme() {

        System.out.println("Lutfen ogrenci no giriniz");
        no = scan.nextInt();
        if (ogrenciBilgileri.containsKey(no)) {
            System.out.println("Sistemimize kayitlisiniz.Bilgileriniz asagidaki gibidir : \n" + ogrenciBilgileri.get(no));
        } else {
            System.out.println("Girilen numarada bir kayit bulunmamaktadir.\nLutfen ust menuden kayit islemlerinizi yapiniz");
        }

    }

    public static void ogrenciSilme() {
        System.out.println("Kaydini silmek istediginiz ogrencinin numarasini giriniz");
        no = scan.nextInt();
        ogrenciBilgileri.remove(no);
        System.out.println("Kaydiniz basariyla silinmistir");
    }


}
