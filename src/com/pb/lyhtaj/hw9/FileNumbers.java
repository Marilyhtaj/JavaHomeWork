package com.pb.lyhtaj.hw9;

import java.io.*;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {

    public static void main(String[] args) throws Exception{
        createNumbersFile();
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


//    public static void  createOddNumbersFile() throws Exception{
//        System.out.println("Читаем файл \"" + Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt") + "\":");
//        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt"))){
//            String line;
//            while ((line = reader.readLine()) !=null){
//                Writer writer1 = new FileWriter("C:\\Users\\Мария\\Desktop\\Java\\odd-numbers.txt");
//                int [] mas = new int[100];
//                for(int i=0;i< mas.length;i++) {
//                    if(i%2 == 1) {
//                        mas[i] = 0;
//                        writer1.write(line);
//                    }
//                }
//                //writer1.write(line);
//                writer1.close();
//            }
//            System.out.println();
//
//    }catch (Exception ex){
//            System.out.println("Ошибка чтения файла: " + ex);
//        }
//        System.out.println("Создан и записан новый файл");
//        }

    public static void  createOddNumbersFile() throws Exception{
        System.out.println("Читаем файл \"" + Paths.get("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt") + "\":");
        try (Scanner reader = new Scanner (new File("C:\\Users\\Мария\\Desktop\\Java\\numbers.txt"));
        Writer writer1 = new FileWriter("C:\\Users\\Мария\\Desktop\\Java\\odd-numbers.txt");) {
            while (reader.hasNextLine()) {
                Scanner line = new Scanner(reader.nextLine());
                while (line.hasNextInt()) {
                    int dat = line.nextInt();
                    if (dat % 2 == 1) {
                        System.out.format("%d -> 0, " + dat);
                        dat = 0;
                    } else System.out.print(dat + ", ");
                    writer1.write(dat + ", ");
                }
                line.close();
                // writer1.();
            }
        }catch (Exception ex){
            System.out.println("Ошибка чтения файла: " + ex);
        }
        System.out.println("Создан и записан новый файл");
    }


    }
