package com.pb.lyhtaj.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt");

        createNumbersFile();
        try (Scanner scan = new Scanner(path)){
            System.out.println("Начинаем чтение файла...");
            while (true){
                String str = scan.nextLine();
                System.out.println(str);
            }
        }catch (NoSuchElementException ex){
            System.out.println("Строки для прочтения законились");
            System.out.println( "--------------------------------");
        } catch (IOException ex){
            ex.printStackTrace();
        }

        createOddNumbersFile();
    }

    public static void createNumbersFile() throws Exception{
        try {Writer writer = new FileWriter("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt");
            int size = 10;
            int [][] array = new int[size][size];
             for(int i=0;i< size;i++){
                 for(int j=0;j< size;j++){
                     array[i][j] = ((int) (Math.random() * 99) + 1);
                    System.out.print(array[i][j] + " ");
                     writer.write(array[i][j] + "\n");
                     }
                  System.out.println();
                 }
            writer.close();
        }catch (Exception ex){
            System.out.println("Ошибка: " + ex);
        }
        System.out.println("Файл создан и наполнен ");
        System.out.println( "---------------------------------");
    }


    public static void  createOddNumbersFile() throws Exception{
        System.out.println("Читаем файл \"" + Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt") + "\":");
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt"))){
            String line;
            while ((line = reader.readLine()) !=null){
                System.out.println(line);
            }
            System.out.println();
    }catch (Exception ex){
            System.out.println("Ошибка чтения файла: " + ex);
        }
        System.out.println("Чтение завершено");
    }


}
