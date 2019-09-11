/*
    Copyright (C), 2015-2019, XXX有限公司
    FileName: VisitFolder
    Author:   cyd
    Date:     2019/9/11 16:48
    Description: 
     
 */


import java.io.File;

public class VisitFolder {
    static  void getCSVInFolder(String filePath){
        File folderName = new File(filePath);
        File flist [] = folderName.listFiles();
        if (flist ==null || flist.length ==0){
            return;
        }
        String fileName = null;
        for (File f:flist) {
            if (f.isDirectory()){
                getCSVInFolder(f.getAbsolutePath());
            }else {
                fileName = f.getName();
                if (fileName.substring(fileName.lastIndexOf(".")+1).equals("csv"))
                {
                    System.out.println(f.getAbsoluteFile());
                }
            }

        }
    }
    public static void main(String[] args) {
        getCSVInFolder("E:/JAVASpring/src");
    }
}

