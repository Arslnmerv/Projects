package studentAutomation;

import java.util.HashMap;
import java.util.Scanner;

public class IntoTheOneClass {

    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        selectOption(hm);
    }
    /*
    /*saveInfo methodu olusturun:
    kullanıcıdan bircok kimlik numarası(4 haneli), isim,adrs, ve telefon alın.
    kimlik numarasını key olarak diger bilgileri value olarak bir map a depolayın
    aynı kimlik numrası ile bilgi girilmesine engel olun
    Durana kadar surekli kimlik bilgisi alin*/

    public static void saveInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lutfen kimlik numarasi giriniz");
            System.out.println("Kimlik bilgisi almayi durdurmak icin 'Q' ya basiniz");
            String id = scan.next();

            if (id.equalsIgnoreCase("q")) {
                break;
            } else {
                while (hm.containsKey(id)) {
                    System.out.println(id + "girdiginiz id daha once kullanilmistir.Lutfen baska bir id giriniz");
                    id = scan.next();
                }
            }
            scan.nextLine();
            System.out.println("Lutfen isminizi giriniz");
            String isim = scan.nextLine();
            System.out.println("Lutfen telefon numaranizi giriniz");
            String tel = scan.nextLine();
            System.out.println("Lutfen adresinizi giriniz");
            String adres = scan.nextLine();


            String ogrenci = "\nisim:" + isim + "\nadres:" + adres + "\ntel:" + tel;
            hm.put(id, ogrenci);
        } while (true);
        System.out.println(hm);
    }

    /* getInfo methodunu olusturun
     kimlik numarasını girerek kullanıcının bilgilerine ulasın
     olmayan kimlik numarası girilirse kullanıcıya hata mesajı verin
     Durdurana kadar kullanici bilgisine ulasmak istesin */
    public static void getInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();

        do {
            System.out.println("Lutfen bilgisini gormek istediginiz ogrencinin kimlik numarasini  giriniz ");
            System.out.println("Bilgi almayi durdurmak icin 'Q' ya basiniz");
            id = scan.next();

            if (id.equalsIgnoreCase("q")) {
                break;
            } else if (!hm.containsKey(id)) {
                System.out.println(id + "Gecersiz id! Lutfen gecerli bir id giriniz");

            } else {
                String ogrenciBilgi = hm.get(id);
                System.out.println(id + "bu idye sahip ogrecinin bilgileri su sekildedir : \n" + ogrenciBilgi);
            }

        } while (true);
    }

    /*  removeInfo method olusturun
      kimlik numarasını girerek data silin
      girilen kimlik numarası yoksa kullanıcıya hata mesajı verin
      duruncaya kadar silmeye devam etsin
      collection bos ise kullanıcıya hata mesajı verin*/
    public static void removeInfo(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Lutfen bilgilerini silmek istediginiz ogrencinin kimlik numarasini giriniz");
            System.out.println("Silme islemini durdurmak icin 'Q' ya basiniz");
            String id = scan.next();

            if (id.equalsIgnoreCase("q")) {
                break;

            } else if (hm.isEmpty()) {
                System.out.println("herhangi bir data yok!");

            } else if (!hm.containsKey(id)) {
                System.out.println(id + "Gecersiz id! Lutfen gecerli bir id giriniz");

            } else {
                String silinenData = hm.remove(id);
                System.out.println(id + "bu idye ait ogrenci bilgisi silinmistir" + silinenData);
            }
        } while (true);
        System.out.println(hm);
    }

    /*  selectOption method olusturun.
      Yukaridakı 3 methodu programı sonlandırana kadar secme hakkı verin
   */
    public static void selectOption(HashMap<String, String> hm) {
        Scanner scan = new Scanner(System.in);
        String option = "";
        do {
            System.out.println("Hangi metodu calistirmak istiyorsunuz?(1,2,3)");
            System.out.println("1: ogrenci ekle\n2: ogrenci bilgisi alma\n3: ogrenci kaydi silme");
            System.out.println("Islemi durdurmak icin 'Q' ya basiniz");
            option = scan.next();

            if (option.equalsIgnoreCase("q")) {
                break;
            }
            switch (option) {
                case "1":
                    saveInfo(hm);
                    break;
                case "2":
                    getInfo(hm);
                    break;
                case "3":
                    removeInfo(hm);
                    break;
                default:
                    System.out.println("Gecerli bir numara giriniz");
            }
        } while (true);
    }
}

