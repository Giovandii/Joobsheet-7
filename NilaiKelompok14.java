import java.util.Scanner;

public class NilaiKelompok14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float rataTertinggi=0;
        int kelopmpoktertinggi =0;

        int i=1;
        while(i<=6){    //cek kondisi apakah i<= 6 jika true maka masuk ke inner loop
            float totNilai=0;
            System.out.print("Kelompok ke-"+i); //nama kelompok dimulai dari i=1 dan mengikuti perulangan
            System.out.println("");

            for(int j=1; j<=5; j++){    //deklarasi j=1 dan pengecekan apakah j<=5
                System.out.print("Masukan Nilai : "); //keluaran terus menerus jika nilai j masih true
                int nilai =input.nextInt(); //input nilai
                totNilai += nilai;  //penjumlahan nilai

            }
            float ratanilai = totNilai/5;   //rata rata = nilai keseluruhan dibagi 5(berdasar banyaknya input nilai)
            System.out.print("Nilai Rata-rata Kelompok ke-"+i+ " = " +ratanilai);

            if(ratanilai>rataTertinggi){    //mengetahui rata rata tertinggi dari suatu kelompok
                rataTertinggi = ratanilai;  
                kelopmpoktertinggi =i;      //mengikuti siapa kelompok yang meiliki nilai tertinggi
            }
            i++;    //increment nilai i dan kembali lagi ke pengecekan i<= 6
            System.out.println("");
            System.out.println(" ");

            
        }
        System.out.println("Kelompok dengan rata-rata tertinggi:");
        System.out.println("Kelompok ke-" + kelopmpoktertinggi + " dengan rata-rata = " + rataTertinggi);
        input.close();
    }
}