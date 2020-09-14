package com.pcschool.ocp.d17_io.case4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
//抓取網路圖片
public class ReadWebImage2 {
    public static void main(String[] args) throws Exception{
        File file = new File("src\\main\\java\\com\\pcschool\\ocp\\d17_io\\car2.jpg");
        String path ="https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278_960_720.jpg";
        URL ur1 = new URL(path);
        URLConnection conn = ur1.openConnection();
        conn.setRequestProperty("USER-AGENT", "我是遊覽器");
        try (InputStream is = conn.getInputStream();// 取得網路串流
             FileOutputStream fos = new FileOutputStream(file);){
             byte[] b = new byte[1];
             while (is.read(b) != -1) {                
                fos.write(b);
            }
             System.out.println("寫入完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
