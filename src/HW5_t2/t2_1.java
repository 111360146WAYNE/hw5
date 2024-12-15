package HW5_t2;
import java.io.*;

public class t2_1 {
    public static void main(String[] args) {
        // 要寫入的檔案名稱
        String filename = "sample.txt";

        // 寫入檔案
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("這是一個測試檔案。\n");
            writer.write("Java 檔案處理範例。");
            System.out.println("檔案寫入完成！");
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
        }

        // 讀取檔案
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("檔案內容：");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }
}
