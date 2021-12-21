package com.pb.lyhtaj.hw11_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.pb.lyhtaj.hw11_1.LocalDateDeserializer;
import com.pb.lyhtaj.hw11_1.LocalDateSerializer;
import sun.java2d.pipe.SpanShapeRenderer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class,new LocalDateSerializer());
        module.addDeserializer(LocalDate.class,new LocalDateDeserializer());
        mapper.registerModule(module);

        List<Person> persons = Arrays.asList(
                new Person("Иван",LocalDate.of(2005,10,6),"Киев, Леси Украинки 5","0952563565, 0966359878", LocalDateTime.now()),
                new Person("Марина",LocalDate.of(1995,11,15),"Днепр, Ивана Франка 5","0979732305", LocalDateTime.now())
        );
        while (true){
            System.out.println("Телефонная книга");
            System.out.println("Выберите действие: ");
            System.out.println("Добавление контакта - нажмите 1");
            System.out.println("Удаление контакта - нажмите 2");
            System.out.println("Поиск конаткта - нажмите 3");
            System.out.println("Вывод контактов с сортировкой - нажмите 4");
            System.out.println("Редактирование контакта - нажмите 5");
            System.out.println("Запись контактов в файл - нажмите 6");
            System.out.println("Загрузка контактов из файла - нажмите 7");

            String choice = scan.nextLine();

            switch (choice){
                case "1":
                    Addcontact();
                    break;
//                case "2":
//                    sffs;
//                    break;
//                case "3":
//                    sfesf;
//                    break;
//                case "4":
//                    sfesf;
//                    break;
//                case "5":
//                    sfesf;
//                    break;
//                case "6":
//                    sfesf;
//                    break;
//                case "7":
//                    sfesf;
//                    break;
                default:
                    System.out.println("Выбор не сделан!");
                    break;
            }
        }
    }

    private static void Addcontact(){

    }
}
