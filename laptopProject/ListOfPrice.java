package laptopProject;

import java.util.ArrayList;

public class ListOfPrice {

    public int getFiyat(int laptopID) {
        Data data = new Data();
        ArrayList<String> arrayList = data.Bilgi(laptopID);
        int totalFiyat = Calculation.getColor(arrayList) + Calculation.getCPU(arrayList) + Calculation.getRam(arrayList) + Calculation.getSize(arrayList);
        return totalFiyat;
    }

    public int getIndirim(int miktar, int indirim) {
        return miktar -(miktar*indirim/100);
    }


}
