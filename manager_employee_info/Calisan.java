package manager_employee_info;

class Calisan extends OrtakOzellikler {
    String okul = "Yildiz koleji";

    public Calisan() {
        super("male", "Okul hayatin minyaturudur..Unutma!", 8500.0);
    }

    public static void main(String[] args) {
        OrtakOzellikler obj = new OrtakOzellikler();
        System.out.println(obj);
        OrtakOzellikler ort = new OrtakOzellikler("male", "Ilk okul evdir", 1000.5);
        System.out.println(ort);
        Calisan cls = new Calisan();
        System.out.println(cls);
        Yonetici ynt = new Yonetici();
        System.out.println(ynt);
        ynt.projeBaslat();
        cls.method();
    }

    @Override
    public void method() {
        System.out.println("hi! from child class");
    }
}
