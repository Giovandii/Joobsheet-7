import java.util.Scanner;
public class Tugasno3_14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Cabang Kafe : ");  //Masukan Jumlah Pelanggan
        int Cabkafe = sc.nextInt();
        int totItem =0, item =0;
        int totitem =0, pelanggan=0;

        System.out.println("===Input Penjualan Percabang===");
        System.out.println("");

        for(int i=1; i<=Cabkafe; i++){  //pengecekan nilai i<= Cabkafe jika true maka keluaran seperti berikut
            System.out.println("---Cabang ke-"+i+"---");
            System.out.print("Masukan Jumlah Pelanggan : ");
            pelanggan =sc.nextInt();    //masukan jumlah pelanggan

            totItem =0;
            for (int j=1; j<=pelanggan; j++){   //inner loop pengecekan nilai j<= pelanggan jika selagi true maka output seperti berikut
                System.out.print("- Pelanggan ke-"+j+" memesan berapa item? ");
                item =sc.nextInt();     //memasukan total belanjaan pelanggan ke-i
                totItem += item;        //menjumlah item yang dibeli keseluruhan pelanggan pada cabang tersebut
                
                
            }
            System.out.println("");
            System.out.println("---Cabang ke-"+i+"---");
            System.out.println("- Jumlah Pelanggan Hari ini \t: "+pelanggan);
            System.out.println("- Item Terjual \t: "+totItem);
            System.out.println("");
            totitem +=totItem;      //menjumlah item yang dibeli pelanggan dari keseluruhan cabang

        }
        System.out.println("Total Seluruh Cabang : ");
        int totpelanggan =0;
        totpelanggan += pelanggan;  //penjumlahan total pelanggan keseluruhan cabang pada hari tersebut
        System.out.println("- Jumlah Pelanggan\t: "+totpelanggan);
        System.out.println("- Jumlah item terjual\t: "+totitem);

        sc.close();
    }
}