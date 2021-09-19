package laptopProject;

import java.util.ArrayList;

    public class Calculation {

        public static int getRam(ArrayList<String> arrayList) {
            int fiyat = 0;
            int ram = 0;
            switch (ram) {
                case 32:
                    fiyat += 300;
                    break;
                case 16:
                    fiyat += 200;
                    break;
                case 8:
                    fiyat += 100;
                    break;
                case 4:
                    fiyat += 50;
                    break;
                default:
            }
            return fiyat;
        }

        public static int getCPU(ArrayList<String> arrayList) {
            int fiyat = 0;

            for (int i = 0; i < arrayList.size(); i++) {


                if (arrayList.get(i).equals("i3")) {
                    fiyat += 200;
                } else if (arrayList.get(i).equals("i5")) {
                    fiyat += 300;
                } else if (arrayList.get(i).equals("i7")) {
                    fiyat += 500;
                }

            }
            return fiyat;
        }

        public static int getColor(ArrayList<String> arrayList) {
            int fiyat = 0;

            for (int i = 0; i < arrayList.size(); i++) {


                if (arrayList.get(i).equals("Red")) {
                    fiyat += 400;
                } else if (arrayList.get(i).equals("Orange")) {
                    fiyat += 300;
                } else if (arrayList.get(i).equals("Silver")) {
                    fiyat += 200;
                } else if (arrayList.get(i).equals("Black")) {
                    fiyat += 150;

                }
            }
            return fiyat;
        }

        public static int getSize(ArrayList<String> arrayList) {
            int fiyat = 0;

            for (int i = 0; i < arrayList.size(); i++) {


                if (arrayList.get(i).equals("Mini")) {
                    fiyat += 100;
                } else if (arrayList.get(i).equals("Middle")) {
                    fiyat += 200;
                } else if (arrayList.get(i).equals("Max")) {
                    fiyat += 300;
                }
            }
            return fiyat;
        }


    }


