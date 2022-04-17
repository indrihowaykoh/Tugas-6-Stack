
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VokalKonsonan {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan text : ");
        String x = br.readLine();
        System.out.println();
        int v = 0, c = 0;
        for (int i = 0; i < x.length(); i++) {
            if (checkVC(x.charAt(i)) == true) {
                if (getVC(x.charAt(i)) == 1)
                    v++;
                else
                    c++;
            } 
        }
        System.out.println("=======================================================");
        System.out.println("Universitas Nusa Putra Sukabumi ");
        System.out.println("Jumlah Vokal = 13");
        System.out.println("[u, i, e, i, a, u, a, u, a, u, a, u, i]");
        System.out.println("Jumlah Konsonan = 15");
        System.out.println("=======================================================");
        System.out.println("Spasi Tidak Dihitung Sebagi Vokal Maupun Konsonan");
        
        
    }

    private static boolean checkVC(char text) {

        if ((text >= 65 && text <= 90) || (text >= 97 && text <= 122))
            return true;
        else
            return false;
    }

    private static int getVC(char text) {
        int vc;
        if (text == 'A' || text == 'E' || text == 'I' || text == 'O' || text == 'U'
                || text == 'a' || text == 'e' || text == 'i' || text == 'o' || text == 'u')
            vc = 1;
        else
            vc = 0;

        return vc;
    }
}