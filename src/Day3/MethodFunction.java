package Day3;

import java.util.Scanner;

public class MethodFunction {
    // method
    // 1. kembalian nilai - function
    // 2. tidak nilai kembalian - sub-routine
    // re-use
    // mudah maintenance

    // access modifier - 4 -
    // void - return type (tidak ada)
    // cetakHello - method name
    public void cetakHello(){
        System.out.println("Hello World");
    }

    // parameter inputan
    public void cetakHello(String nama){
        System.out.println("Hello World : " + nama);
    }

    // function
    public int getNilaiN(){
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        int n = s.nextInt();
        s.close();
        return n;
    }

    public void hasilKaliDua(){
        int n = getNilaiN();
        System.out.println(n * 2);
    }

    public static void main(String[] args) {
        // instansiasi object -  proses pembentukan objeck
        MethodFunction objMethod = new MethodFunction();
//        objMethod.cetakHello();
        objMethod.cetakHello("fani");
//        int nilai = objMethod.getNilaiN();
//        System.out.println(nilai * 2);
//        objMethod.hasilKaliDua();
    }

}
