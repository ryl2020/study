package com.raoyalong.utils.ioutils;

import java.io.*;
import java.util.ArrayList;

/**
 * @author raoyalong
 * @create 2023 - 03 - 25 16:14
 */
public class VerticalFolder {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("D:\\kye\\bigdata-pms-operator-main\\src\\main\\script\\subitem\\opt_ads");
        File outputFile = new File("C:\\Users\\raoyalong\\Desktop\\output\\files.txt");
        getFiles(inputFile, outputFile);
    }

    //遍历文件夹
    public static void verticalDirectory(File file, ArrayList<File> arrayList) throws FileNotFoundException {

        //文件名加入到集合中
        if (file.isFile()) {
            arrayList.add(file);
        } else {

            //获取文件夹中文件
            File[] files = file.listFiles();

            //递归
            for (File value : files) {
                verticalDirectory(value, arrayList);
            }
        }
    }

    public static void getFiles(File input, File output) throws IOException {

        //创建集合存储文件名
        ArrayList<File> fileArrayList = new ArrayList<>();

        //遍历文件夹，得到文件集合
        verticalDirectory(input, fileArrayList);

        //创建IO流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

        //文件名写入到目标文件中
        for (File file : fileArrayList) {
            bufferedWriter.write(file.getName());
            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
