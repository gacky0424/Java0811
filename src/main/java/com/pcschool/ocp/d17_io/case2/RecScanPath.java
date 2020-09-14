package com.pcschool.ocp.d17_io.case2;

import java.io.File;
//讀取資料
public class RecScanPath {
    static int java_file_count = 0;
    
    public static void main(String[] args) {
        String s = "src\\main\\java\\com\\pcschool\\ocp";
        File path = new File(s);
        scan(path);
        System.out.printf("java_file_count: %d支\n",java_file_count );
    }

    public static void scan(File path) {
        for (String fname : path.list()) {
            // "/"是windows專屬,可換用成separator
            try {
                File f = new File(path.getPath() + File.separator + fname);
                System.out.printf("%s 是 %s\n", f.getPath(), f.isFile() ? "檔案" : "目錄");
                if (f.isDirectory()) {
                    scan(f);
                }else{
                    if(f.getName().contains(".java"))
                        ++java_file_count;
                    }
            } catch (Exception e) {
            }
        }
    }
}
