package laptopProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class Data {
        public ArrayList<String> Bilgi(int laptopID) {
            Map<Integer, ArrayList<String>> bilgi = new HashMap<>();
            ArrayList<String> l1=new ArrayList<>();
            l1.add("apple");
            l1.add("Mini");//+200
            l1.add("i5");//+300
            l1.add("4 ram");//50
            l1.add("Red");//+400
            bilgi.put(1100000,l1);

            return bilgi.get(laptopID);
        }
}
