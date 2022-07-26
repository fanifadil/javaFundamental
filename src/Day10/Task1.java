package Day10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class Task1 {
    Scanner variabel = new Scanner(System.in);
    public void kondisi(){
        System.out.print("Apakah anda ingin mengulang pilihan? [Y/N] ");
        String keputusan = variabel.next();
        if(Objects.equals(keputusan, "Y")){
            pilihan();
        }else if (Objects.equals(keputusan, "N")) {
            System.out.print("Terima kasih sudah menggunakan menu kami☺️");
            System.exit(0);
        }else {
            System.out.println("Pilihan tidak ada, pilih dengan benar!!!");
            kondisi();
        }
    }

    public void pilihan(){
        Scanner variabel = new Scanner(System.in);
        ArrayList listInput = BuatList2.kerangkaListInput();
        ArrayList listPrima = BuatList2.kerangkaListPrima();
        System.out.print("Masukkan pilihan Anda!!! ");
        int nomorPilihan = variabel.nextInt();
        //do
        //{
        switch ( nomorPilihan )
        {
            case 1:
                System.out.println("KPK =  " + TrialKPK.findKPK(listInput, listPrima));
                kondisi();
                break;
            case 2:
                System.out.println("FPB =  " + TrialFPB.findFPB(listInput, listPrima));
                kondisi();
                break;
            case 3:
                System.out.println("KPK =  " + TrialKPK.findKPK(listInput, listPrima));
                System.out.println("FPB =  " + TrialFPB.findFPB(listInput, listPrima));
                kondisi();
                break;
            case 4:
                System.out.print("Terima kasih sudah menggunakan menu kami☺️");
                System.exit(0);
                break;
            default:
                System.out.println ("Error!!! \n pilih menu 1-4");
                pilihan();
                break;
        }
        //}
        //while (nomorPilihan > 0 && nomorPilihan != 4 );
    }

    public static void main(String[] args) {
        Task1 hasil = new Task1();
        hasil.pilihan();
    }
}
