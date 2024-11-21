package other.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String>tasks=new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Выберите действие:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Вывести список задач");
            System.out.println("4. Выход");

            int choice=scanner.nextInt();

            switch (choice){
                case 1->addTask(scanner);
                case 2->removeTask(scanner);
                case 3->printTask();
                case 4 -> {
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Неверный выбор.Выберите от 1 до 4.");
            }
        }
    }

    private static void addTask(Scanner scanner){
        System.out.print("Введите новую задачу: ");
        String task=scanner.next();
        tasks.add(task);
        System.out.println("Задача добавлена.");
    }
    private static void removeTask(Scanner scanner){
        if(tasks.isEmpty()){
            System.out.println("Список задач пуст.");
        }
        System.out.println("Выберите номер задачи для удаления:");
        for(int i=0;i<tasks.size();i++){
            System.out.println((i+1)+"."+tasks.get(i));
        }

        int taskNumber=scanner.nextInt();
        if(taskNumber>=1&&taskNumber<=tasks.size()){
            tasks.remove(taskNumber-1);
            System.out.println("Задача удалена");
        }
        else {
            System.out.println("Неверный номер задачи");
        }
    }
    private static void printTask(){
        if(tasks.isEmpty()){
            System.out.println("Список задач пуст.");
        }
        else{
            tasks.forEach(System.out::println);
        }
    }

}
