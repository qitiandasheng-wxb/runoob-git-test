package aop.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    static String filePath="D:\\corefile\\whlhyh\\20201103\\20201103.txt";

    public static void main(String[] args) throws IOException {
        readerByBytes();
    }
    public static  void readerByBytes() throws IOException {
        FileInputStream fis=new FileInputStream(filePath);
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader reader=new BufferedReader(isr);
         java.io.FileReader fileReader=new java.io.FileReader(filePath);
        int i=0;
        while (((i=fis.read()) !=-1)){
            System.out.println(i+"-----"+(char)i);
        }
        fis.close();
    }
}
