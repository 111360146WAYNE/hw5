package HW5_t2;

import java.util.*;

public class t2_3 {
    public static void main(String[] args) {
        // 創建 ArrayList 並加入元素
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // 顯示 ArrayList 中的元素
        System.out.println("ArrayList 元素:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 查詢 ArrayList 中的元素
        if (list.contains("Banana")) {
            System.out.println("ArrayList 包含 Banana");
        }

        // 移除元素
        list.remove("Apple");
        System.out.println("移除 Apple 後的 ArrayList 元素:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}

