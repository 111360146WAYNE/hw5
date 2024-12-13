/*package HW5_p19_to_p55;

import java.io.*;

class p35 {
    public static void main(String[] args){
        try{
            FileWriter fw = new FileWriter("test1.txt");
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
            
            pw.println("Hello");
            pw.println("GoodBye");
            
            pw.close();
            
            System.out.println("資料已寫入檔案");
        }
        
        catch (IOException e){
            System.out.println("輸出入有誤");
        }
    }
}*/