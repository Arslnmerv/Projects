package laptopProject;

public class Runner {
    public static void main(String[] args) {
        ListOfPrice f1=new ListOfPrice();
        int num= f1.getFiyat(1100000);
        System.out.println("Reel fiyat "+num);
        System.out.println("Indirimli fiyat "+ f1.getIndirim(num, 20));
    }
}
