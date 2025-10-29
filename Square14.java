import java.util.Scanner;
public class Square14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukan Nilai n = "); //input nilai n
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){            //Outer loop untuk memeriksa apakah nilai i<= n
            for (int j = 1; j<=n; j++){     //jika i<=n true maka masuk inner loop apakah j<= n
                System.out.print("*");    //Jika tru maka output bintang
            }
            System.out.println("");       //inner false maka baris baru dan kembali lagi ke outer loop
        }
        sc.close();
    }
}