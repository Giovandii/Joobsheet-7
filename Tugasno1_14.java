import java.util.Scanner;
public class Tugasno1_14 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Masukan Nilai n = ");   //input nilai n
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){    //perulangan luar
            int jumlah =0;

            for(int j=1; j<=i; j++){    //perulangan dalam
                int kuadrat = j*j;      //pencarian nilai kuadrat
                jumlah += kuadrat;      //penjumlahan antar nilai kuadrat

                System.out.print(kuadrat);  //output nilai kuadrat
                if(j<i){
                    System.out.print(" + ");    // printn +
                }
                
            }
            System.out.println(" = " +jumlah);  //output = dan hasil penjumlahan kuadrat setiap baris
        }
        sc.close();
    }
}