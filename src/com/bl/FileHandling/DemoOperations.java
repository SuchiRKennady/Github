package com.bl.FileHandling;

import java.io.File;

public class DemoOperations {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder");
        System.out.println(f.exists());
        f.createNewFile();
        System.out.println(f.exists());

        File folder = new File("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder/Demp");
        folder.mkdir();
        System.out.println(folder.exists());

        File newF = new File("C:\\Users\\pramo\\OneDrive\\Desktop\\Suchi folder","demo.txt");
        newF.createNewFile();


        newF.isFile();

    }
}
