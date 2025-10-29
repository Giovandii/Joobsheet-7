import java.util.Scanner;
public class Triangle14 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Masukan Nilai n = "); //input nilai n
        int n = sc.nextInt();

        int i=0;
        while(i<=n){       //outer apakah nilai i<= n jika true maka masuk ke inner loop
            int j=0;       //deklarasi interger j
            while(j<i){    //cek apakah j<i jika true maka keluaran *
                System.out.print("*");
                j++;       //increment nilai j+1 lalu kembali cek kondisi apakah j<i
            }
            i++;           //increment i setelan inner selesai i+1 lalu kembali ke outer lopp cek kondisi i<= n
            System.out.println(""); //memberi enter pada setiap perulangan
        }
        sc.close();
    }
}