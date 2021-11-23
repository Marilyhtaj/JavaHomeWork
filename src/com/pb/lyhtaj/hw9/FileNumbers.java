package com.pb.lyhtaj.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileNumbers {

    public static void createNumbersFile() throws Exception{
        try {Writer writer = new FileWriter("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt");
            int [][] array = new int[10][10];
             for(int i=0;i< array.length;i++, System.out.println()){
                 for(int j=0;j< array.length;j++){
                     array[i][j] = ((int) (Math.random()*99+1));
                     System.out.println(array[i][j] + " ");
                     writer.write(array[i][j] + " ");
                 }
             }writer.write("\n");
            writer.close();
        }catch (Exception ex){
            System.out.println("Ошибка: " + ex);
        }
    }

//    public void  createOddNumbersFile(){
//
//
//    }

    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt");
             createNumbersFile();

        try (Scanner scan = new Scanner(path)){
            while (true){
                String str = scan.nextLine();
                System.out.println(str);
            }
        }catch (NoSuchElementException ex){
            System.out.println("Строки для прочтения законились");
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
