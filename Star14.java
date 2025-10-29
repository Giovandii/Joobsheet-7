import java.util.Scanner;
public class Star14 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Masukan Nilai n = ");//input nilai n
        int n =sc.nextInt();

        for (int i =1; i<=n; i++){  //menentukan i<=n jika true dia akan memberi keluaran *
            System.out.print("*");
        }
        sc.close();
    }
}