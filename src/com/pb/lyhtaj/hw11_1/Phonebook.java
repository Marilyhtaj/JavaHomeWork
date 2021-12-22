package com.pb.lyhtaj.hw11_1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

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
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        List<Person> persons = Arrays.asList(
                new Person("Иван", LocalDate.of(1998,12,5),"Киев, Леси Украинки 5", "0952563565, 0966359878", LocalDateTime.now()),
                new Person("Марина", LocalDate.of(1998,12,5), "Днепр, Ивана Франка 5", "0979732305", LocalDateTime.now())
        );

        while (true) {
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

            switch (choice) {
                case "1":
                    addСontact();
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
            }
        }
    }

    private static void addСontact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя нового пользователя");
        String fio = scan.nextLine();
        System.out.println("Введите дату рождения в формате XXXX XX XX через пробел");
        LocalDate db = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
        System.out.println("Введите адрес");
        String adres = scan.nextLine();
        System.out.println("Введите номер телефона");
        String phone = scan.nextLine();
        List<Person> persons = Arrays.asList();
        try {
            persons.add(new Person(fio,db, adres, phone, LocalDateTime.now()));
            System.out.println("Контакт сохранен");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка" + e);
        }
        System.out.println();
    }
}
