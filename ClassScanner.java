
package Scanner;

import java.util.Stack;

public class ClassScanner {
    

    public static void main(String[] args) {
        Stack<Integer> s = new Stack <Integer>();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        
        System.out.println("Nilai Tumpukan DataPlaylist: " + s);
        System.out.println("========================================================");
        
        s.push(60);
        
        
        System.out.println("Stack Menambahkan Nilai Tumpukan DataPiaylist: " + s);
        System.out.println("=========================================================");
        
        int a = s.pop();
        s.push(20);
        int b = s.pop();
        s.push(30);
        int c = s.pop();
        s.push(40);
        int d = s.pop();
        s.push(50);
        int e = s.pop();
        s.push(60);
        int f = s.pop();
        
        
       System.out.println("Menghapus Tumpukan DataPlaylist: " + a);
       System.out.println("Menghapus Tumpukan DataPlaylist: " + b);
       System.out.println("Menghapus Tumpukan DataPlaylist: " + c);    
       System.out.println("Menghapus Tumpukan DataPlaylist: " + d);
       System.out.println("Menghapus Tumpukan DataPlaylist: " + e);
       
       System.out.println("==============================================================");
       
       s.push(60);
       
       System.out.println("Tambahkan DataPlaylist Diurutuan Tertentu");
       
       s.push(60);
       int h = s.pop();
       System.out.println("Menghapus  DataPlaylist Diururtan Tertentu " + h);
       
       ///Menghapus Semua Playlist
       
       int j = s.pop();
       int l = s.pop();
       int p = s.pop();
       int m = s.pop();
       int i = s.pop();
       int g = s.pop();
       
       
       System.out.println("Menghapus Playlist " + j);
       System.out.println("Menghapus Playlist " + l);
       System.out.println("Menghapus Playlist " + p);
       System.out.println("Menghapus Playlist " + m);
       System.out.println("Menghapus Playlist " + i);
       System.out.println("Menghapus Playlist " + g);
       
       
       
       
       
                }
    
}
   
       
    
    
