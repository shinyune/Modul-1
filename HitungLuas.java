import java.util.*;

public class HitungLuas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alas, tinggi;
        int pilihan;

        System.out.println("===== HITUNG LUAS SEGITIGA =====s");
        System.out.println("Mau menampilkan hasil luas dalam bentuk ? :");
        System.out.println("1. Hasil to Integer");
        System.out.println("2. Hasil to Double");
        System.out.println("Masukkan pilihan (1/2):");
        
        pilihan = in.nextInt();
        System.out.println("Masukkan nilai alas dan tinggi secara berurutan :");
        alas = in.nextInt();
        tinggi = in.nextInt();

        if(pilihan == 1){

            Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
            System.out.println("Luas segitiga dalam bentuk integer : ");
            System.out.println(luasTipeInt.getResultAsInt());
        } else {         
            Segitiga<Double> luasTipeDouble = new Segitiga<>((double)alas,(double) tinggi);
            System.out.println("Luas segitiga dalam bentuk integer : ");
            System.out.println(luasTipeDouble.getResultAsDouble());
        }
    }
}

class Segitiga<T> {

    final private T alas;
    final private T tinggi;

    public  Segitiga(T alas, T tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt(){
        return (int) alas * (int) tinggi / 2;
    }

    public double getResultAsDouble(){
        return (double) alas * (double) tinggi / 2;
    }
}