package com.bl.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder\\Demp/abc.txt");
        f.createNewFile();
        System.out.println(f.exists());

        FileWriter fw = new FileWriter("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder\\Demp/abc.txt");
        fw.write("Hello");
        char[] c = {'a','b','c','d'};
        fw.write("\n");
        fw.write(c);
        fw.write("c");
        fw.flush();

        FileReader fr = new FileReader("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder\\Demp/abc.txt");
        System.out.println((char) fr.read());
        int i = fr.read();
        while(i!=-1){
            System.out.println((char)i);
            i= fr.read();
        }

    }
}
