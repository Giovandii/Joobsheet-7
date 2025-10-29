import java.util.Scanner;
public class Tugasno2_14 {

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nilai n = ");
        int n= input.nextInt(); //input nilai n

        for(int i=1; i<=n; i++){        //pengecekan apakah nilai i<= n jika true makan lanjut inner loop
            for (int j=1; j<=n; j++){   //pengecekan apakah nilai j<= n jika true maka masuk ke inner kedua 

                if(i==1 || i==n ||j==1 || j==n){    //fungsi i untuk baris nya dan j untuk kolomnya jika j memenuhi dia akan mengeluarkan inputan nilai n
                    System.out.print(n);
                }
                else{
                    System.out.print(" ");  //jika kondisi tidak terpenuhi maka keluaran kosong
                }
            }
            System.out.println(""); //baris baru
        }
        input.close();
    }
}