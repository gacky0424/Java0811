package com.pcschool.ocp.d18_nio.case3;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//網路取圖並新增到檔案裡
public class StreamCopy {
    public static void main(String[] args) throws Exception{
        String surl = "https://website-bamedag.netdna-ssl.com/fileadmin/media/_processed_/8/8/csm_7-9-months-introtext_fee7fcf815.jpg";
        URI uri = URI.create(surl);
        Path dest = Paths.get("src\\main\\java\\com\\pcschool\\ocp\\d18_nio\\baby.jpg");
        Files.copy(uri.toURL().openStream(), dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copy 成功!");
    }
}
