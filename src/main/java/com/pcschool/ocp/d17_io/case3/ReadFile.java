package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileReader;
//讀取檔案
public class ReadFile {
    public static void main(String[] args) {
        //要用這個方法讀取檔按內容需要將編碼從 UTF-8 改成 ANSI
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
        try(FileReader fis = new FileReader(file);) { // 預設抓取 ANSI 編碼的內容
            StringBuilder sb = new StringBuilder();
            char[] cbuf = new char[1];
            while (fis.read(cbuf) != -1) {                
                String s = new String(cbuf); //char[] 轉 String
                sb.append(s); // 將 s 累積到 sb
            }
            System.out.println(sb);
        } catch (Exception e) {
        }
        
    }
}