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

        for(int i=1; i<=Cabkafe; i++){
            System.out.println("---Cabang ke-"+i+"---");
            System.out.print("Masukan Jumlah Pelanggan : ");
            pelanggan =sc.nextInt();

            totItem =0;
            for (int j=1; j<=pelanggan; j++){
                System.out.print("- Pelanggan ke-"+j+" memesan berapa item? ");
                item =sc.nextInt();
                totItem += item;
                
                
            }
            System.out.println("");
            System.out.println("---Cabang ke-"+i+"---");
            System.out.println("- Jumlah Pelanggan Hari ini \t: "+pelanggan);
            System.out.println("- Item Terjual \t: "+totItem);
            System.out.println("");
            totitem +=totItem;

        }
        System.out.println("Total Seluruh Cabang : ");
        int totpelanggan =0;
        totpelanggan += pelanggan;
        System.out.println("- Jumlah Pelanggan\t: "+totpelanggan);
        System.out.println("- Jumlah item terjual\t: "+totitem);

        sc.close();
    }
}