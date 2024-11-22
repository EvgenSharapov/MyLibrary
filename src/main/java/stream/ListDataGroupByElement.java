package stream;

import lombok.Getter;
import lombok.Setter;
import java.util.*;
import java.util.stream.Collectors;

public class ListDataGroupByElement {
    public static class Person {
        @Setter
        @Getter
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Елена", 20);
        List<Person> people = Arrays.asList(
                new Person("Елена", 20),
                new Person("Наталья", 23),
                new Person("Михаил", 13),
                new Person("Иван", 30),
                new Person("Сергей", 30),
                new Person("Елена", 23)
        );
        System.out.println("Группировка по age: ");
        Map<?,List<Person>>peopleByAge= groupPeople(people,"age");
        printList(peopleByAge);
        System.out.println("Группировка по name: ");
        Map<?,List<Person>>peopleByName= groupPeople(people,"name");
        printList(peopleByName);
        System.out.println("Группировка по other: ");
        Map<?,List<Person>>peopleByOther= groupPeople(people,"other");

    }
    private static Map<?, List<Person>> groupPeople(List<Person> peopleBy,String field) {
        if (peopleBy.isEmpty()) {
            System.out.println("Список пуст");
            return null;}

        switch (field){
            case "name" -> {
                return peopleBy.stream()
                        .collect(Collectors.groupingBy(Person::getName));
            }
            case "age"-> {
                return peopleBy.stream()
                        .collect(Collectors.groupingBy(Person::getAge));
            }
            default -> {
                System.out.println("Неверно указан параметр списка");
                return null;
            }

        }
        }
        private static void printList(Map<?, List<Person>> peoples){
        if(peoples==null){return;}
        if(peoples.isEmpty()){
            System.out.println("Список пуст");return;
        }
        for(Object temp:peoples.keySet()){
            System.out.println("Группа "+temp+" :");
            for(Person person:peoples.get(temp)){
                System.out.print("Возраст: "+person.age+"\t");
                System.out.println("Имя: "+person.name);
            }
        }
        }
    }
