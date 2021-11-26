package manager_employee_info;
/*Calisan, Yonetici ve OrtakOzellikler isimlerinde sınıflar oluşturun
Calisan ve Yonetici sınıfı OrtakOzellikler sınıfından extends ediniz
Kalıtım ile alınan özellikler dışında her sınıfın kendine has fields’ları olsun. Calisan sınıfının okul fields’ı, Yonetici sınıfının spor fields’ı ve projeBaslat metodu olusturun
Main.java içerisinde Calisan ve Yonetici nesnelerimizi oluşturun ve buralara parametre gönderin.
Calisan ve Yonetici sınıflarında constructor olusturun
Calisan ve Yonetici sınıflarında parent class daki fieldleri call eden  constructor create edin
super ile gelen parametrelerimizi OrtakOzellikler sınıfının içindeki constructor‘a gönderin
Kendine has olan fields’ı da this ile direkt olarak buradakine eşitliyoruz. Bir yere göndermiyoruz yani..
Main.java içerisinde tum variable cons ve method ları call edip yazdirin
Yonetici sınıfının fazladan bir de projeBaslat isminde metodu call edin */

class Yonetici extends OrtakOzellikler {
    String spor;

    @Override
    public double getSalary() {
        System.out.println("method override edildi");
        System.out.println(getSalary());
        return super.getSalary();

    }

    public static void main(String[] args) {
        OrtakOzellikler obj2 = new OrtakOzellikler();
        System.out.println(obj2.getSalary());
        obj2.setSalary(1500.5);
        System.out.println(obj2.getSalary());

    }

    public Yonetici() {
        super("female", "Iyi bir ogretmene denk gelmek nadide bir sanstir", 9500.0);
    }


    public void projeBaslat() {
        System.out.println("Fatih projesi baslatildi");
    }
}