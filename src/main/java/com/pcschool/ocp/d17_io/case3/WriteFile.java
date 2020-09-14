package com.pcschool.ocp.d17_io.case3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
//寫資料
public class WriteFile {
    public static void main(String[] args) {
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\report.txt");
                                                                                    //true代表要保留之前的資料,false清空原始檔案資料再新增
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8)){
            osw.write("\n洋蔥 x 2");
            osw.write("\n杏苞菇 x 5165465");
            osw.write("\n四季豆 x 13213");
        } catch (Exception e) {
        }
    }
    
    
}
