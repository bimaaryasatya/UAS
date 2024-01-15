import java.util.ArrayList;
import java.util.Random;

public class PabrikPensil {
    public static void main(String[] args) {

        ArrayList<Integer> Biru = new ArrayList<>();
        ArrayList<Integer> Merah = new ArrayList<>();
        ArrayList<Integer> Hijau = new ArrayList<>();
        ArrayList<Integer> Oranye = new ArrayList<>();
        ArrayList<Integer> Hitam = new ArrayList<>();
        ArrayList<Integer> Ungu = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20000; i++) {
            int warnaRandom = random.nextInt(6);
            switch (warnaRandom) {
                case 0:
                    Biru.add(1);
                    break;
                case 1:
                    Merah.add(1);
                    break;
                case 2:
                    Hijau.add(1);
                    break;
                case 3:
                    Oranye.add(1);
                    break;
                case 4:
                    Hitam.add(1);
                    break;
                case 5:
                    Ungu.add(1);
                    break;
            }
        }

        int Jumlah_Biru = Biru.size();
        int Jumlah_Merah = Merah.size();
        int Jumlah_Hijau = Hijau.size();
        int Jumlah_Oranye = Oranye.size();
        int Jumlah_Hitam = Hitam.size();
        int Jumlah_Ungu = Ungu.size();

        int blueMax = 0;
        int blueMin = Integer.MAX_VALUE;
        int redMax = 0;
        int redMin = Integer.MAX_VALUE;
        int greenMax = 0;
        int greenMin = Integer.MAX_VALUE;
        int orangeMax = 0;
        int orangeMin = Integer.MAX_VALUE;
        int blackMax = 0;
        int blackMin = Integer.MAX_VALUE;
        int purpleMax = 0;
        int purpleMin = Integer.MAX_VALUE;

        for (int i = 0; i < Biru.size(); i++) {
            if (Biru.get(i) > blueMax) {
                blueMax = Biru.get(i);
            }
            if (Biru.get(i) < blueMin) {
                blueMin = Biru.get(i);
            }
        }

        for (int i = 0; i < Merah.size(); i++) {
            if (Merah.get(i) > redMax) {
                redMax = Merah.get(i);
            }
            if (Merah.get(i) < redMin) {
                redMin = Merah.get(i);
            }
        }
        System.out.println("Total Produksi Setiap Warna: ");
        System.out.println("Biru: " + Jumlah_Biru);
        System.out.println("Merah: " + Jumlah_Merah);
        System.out.println("Hijau: " + Jumlah_Hijau);
        System.out.println("Oranye: " + Jumlah_Oranye);
        System.out.println("Hitam: " + Jumlah_Hitam);
        System.out.println("Ungu: " + Jumlah_Ungu);

    }
}
