package HW5_t2;
import java.io.*;
import java.net.*;

public class t2_2 {
    public static void main(String[] args) {
        String urlString = "https://www.example.com";

        try {
            // 創建 URL 物件
            URL url = new URL(urlString);

            // 開啟 HTTP 連線
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // 獲取回應碼
            int responseCode = connection.getResponseCode();
            System.out.println("HTTP 回應碼：" + responseCode);

            // 讀取並顯示伺服器回應內容
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    String line;
                    System.out.println("回應內容：");
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                }
            } else {
                System.out.println("伺服器回應錯誤：" + responseCode);
            }
        } catch (IOException e) {
            System.out.println("發送 HTTP 請求時發生錯誤：" + e.getMessage());
        }
    }
}

