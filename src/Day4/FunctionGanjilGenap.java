package Day4;

import java.util.Scanner;

public class FunctionGanjilGenap {
    public int n;
    public int pilihan;
    public Scanner scan = new Scanner(System.in);

    public void initApp(){
//        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nilai N : ");
        this.n = scan.nextInt();

        System.out.println(" Pilihan 1 : Ganjil");
        System.out.println(" Pilihan 2 : Genap");

        System.out.println("Masukkan Pilihan : ");
        this.pilihan = scan.nextInt();

    }



    public void cetakGanjil(int n){
        for (int i = 0; i < n; i++){
            System.out.print(i * 2 + 1);
        }
    }

    public void cetakGenap(int n){
        for (int i = 0; i < n; i++){
            System.out.print(i * 2);
        }
    }

    public void pilihan(){
        switch (this.pilihan){
            case 1 :
                cetakGanjil(this.n);
                break;
            case 2 :
                cetakGenap(this.n);
                break;
        }

    }

    public void cetakPilihan(){
        initApp();
//        pilihan(this.pilihan, this.n);
        pilihan();
    }


}
