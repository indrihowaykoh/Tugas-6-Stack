
import java.util.Scanner;

import java.util.InputMismatchException;

public class JavaQueue {

private static int[] queue = new int[5];
private static int counters = 0;

private static boolean queueStorage() {
    if(counters < queue.length) {
        return true;
    }
    else {
        return false;
    }
}

private static void createQueue() {
    int loopX = 0;
    int alpha = 0;
    while(loopX == 0) {
        System.out.print("Masukkan DataAntrian (Huruf): ");
        Scanner alphaX = new Scanner(System.in);
        try {
            alpha = alphaX.nextInt();
            loopX = 1;
        }
        catch(InputMismatchException e) {
            System.out.println("Masukan harus berupa huruf!");
            loopX = 0;
        }
    }
    queue[counters] = alpha;
    counters++;
}

private static void removeQueue() {
    counters--; 
    for(int i = 0; i < counters; i++) {
        queue[i] = queue[i + 1];
    }
    System.out.println("Data pertama dalam antriuan sudah dikeluarkan");
}

private static void displayDataQueue() {
    System.out.print("Data dalam antrian: ");
    for(int i = 0; i < counters; i++) {
        System.out.print(" ["+i+" => "+queue[i]+"]" );
    }
    System.out.println("");
}

private static void cleanQueue() {
    counters = 0;
}

private static void quitApp() {
    String quitss = "y";
    System.out.print("Keluar dari Antrian? (Y/T): ");
    quitss = new Scanner(System.in).nextLine();
    if(quitss.equalsIgnoreCase("y")) {
        System.exit(0);
    }
    else {
        menuProgram();
    }
}

private static void menuChooser(int choosenMenu) {
    switch(choosenMenu) {
        case 1:
            boolean check = queueStorage();
            if(check) {
                createQueue();
            }
            else {
System.out.println("Antrian Penuh!, kosongkan data satu terlebih dahulu!");
            }
            break;
        case 2:
            removeQueue();
            break;
        case 3:
            System.out.println("Status Storage: ");
            System.out.println("Kapasitas: " + queue.length);
            System.out.println("Terisi   : " + counters);
            break;
        case 4:
            displayDataQueue();
            break;
        case 5:
            cleanQueue();
            break;
        case 6:
            quitApp();
            break;
    }
    menuProgram();
}

private static void menuProgram() {
    int loopX = 0;
    int choosenMenu = 0;
    while(loopX == 0) {
        System.out.println("\nPROGRAM QUEUE JAVA");
        System.out.println("MENGHITUNG ANTREAN: ");
        System.out.println("A B C D E F G H I J ");
        System.out.println("========================================================");
        System.out.println("Tambah Antrian:");
        System.out.println("Z");
        System.out.println("========================================================");
        System.out.println("Hapus ElemenAntrean Pertama:");
        System.out.println("A");
        System.out.println("========================================================");
        System.out.println("Hapus Antrean Posisi Tertentu:");
        System.out.println("F");
        System.out.println("========================================================");
        System.out.println("Hapus Semua Elmen:-");
        System.out.println("========================================================");
        System.out.println("Tampilkan DatA");
        System.out.println("B C D E G H I J Z");
        System.out.println("========================================================");
        
        System.out.print("jALUR ANTREAN 2 BANK MANGKIRI  >>> ");
        Scanner menuOption = new Scanner(System.in);
        try {
            choosenMenu = menuOption.nextInt();
            loopX = 1;
        }catch(InputMismatchException e) {
            System.out.println("Masukan harus Huruf!");
        }
    }
    System.out.println("");
    menuChooser(choosenMenu);
}

public static void main(String[] args) {
    menuProgram();
}
}