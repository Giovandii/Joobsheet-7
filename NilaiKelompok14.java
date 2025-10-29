import java.util.Scanner;

public class NilaiKelompok14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float rataTertinggi=0;
        int kelopmpoktertinggi =0;

        int i=1;
        while(i<=6){
            float totNilai=0;
            System.out.print("Kelompok ke-"+i);
            System.out.println("");
            for(int j=1; j<=5; j++){
                System.out.print("Masukan Nilai : ");
                int nilai =input.nextInt();
                totNilai += nilai;

            }
            float ratanilai = totNilai/5;
            System.out.print("Nilai Rata-rata Kelompok ke-"+i+ " = " +ratanilai);

            if(ratanilai>rataTertinggi){
                rataTertinggi = ratanilai;
                kelopmpoktertinggi =i;
            }
            i++;
            System.out.println("");
            System.out.println(" ");

            
        }
        System.out.println("Kelompok dengan rata-rata tertinggi:");
        System.out.println("Kelompok ke-" + kelopmpoktertinggi + " dengan rata-rata = " + rataTertinggi);
        input.close();
    }
}