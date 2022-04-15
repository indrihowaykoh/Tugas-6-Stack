import java.util.Scanner;

public class UtsJumlahKata {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kalimat: ");
        String kalimat = sc.nextLine();
        int kata = 0;
        int vokal_a = 0, vokal_i = 0, vokal_u = 0, vokal_e = 0, vokal_o = 0;
        
        boolean adalebih  = false;
        for(int i = 0; i < kalimat.length(); i++){
            if(kalimat.charAt(i) == 'A' || kalimat.charAt(i) == 'a'){
                vokal_a++;
                if(vokal_a > 1){
                    adalebih = true;
                }
            }
            else if(kalimat.charAt(i) == 'I' || kalimat.charAt(i) == 'i'){
                vokal_i++;
                if(vokal_i > 1){
                    adalebih = true;
                }
            }
            else if(kalimat.charAt(i) == 'U' || kalimat.charAt(i) == 'u'){
                vokal_u++;
                if(vokal_u > 1){
                    adalebih = true;
                }
            }
            else if(kalimat.charAt(i) == 'E' || kalimat.charAt(i) == 'e'){
                vokal_e++;
                if(vokal_e > 1){
                    adalebih = true;
                }
            }
            else if(kalimat.charAt(i) == 'O' || kalimat.charAt(i) == 'o'){
                vokal_o++;
                if(vokal_o > 1){
                    adalebih = true;
                }
            }

            //ketika menemui spasi atau i pada index kalimat terakhir
            if(kalimat.charAt(i) == ' ' || i == kalimat.length() - 1){
                //jika vokalnya tidakk lebih maka kata ditambah satu
                if(adalebih == false){
                    kata++;
                }

                //meng nol kan smua nilai karena menemui spasi berarti kata baru
                vokal_a = 0;
                vokal_i = 0;
                vokal_u = 0;
                vokal_e = 0;
                vokal_o = 0;
                adalebih = false;
            }
        }
        System.out.println("===============Output Data=================");
        System.out.println("Jumlah Kata = "+ kata);
        sc.close();
    }
}
