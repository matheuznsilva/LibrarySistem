package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Books;
import entities.CD;
import entities.Materials;
import users.Student;
import users.Teacher;
import users.User;
import exceptions.domineException;
import exceptions.emailInvalidException;

public class App {

    static List<User> users = new ArrayList<>();
    static List<Materials> materials = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);    // inicia a variável que recebe informações do teclado 


    public static void main(String[] args){
        boolean execution = true;


        while(execution){
            System.out.println("============= MENU =============");
            System.out.println("| 1 - NEW USER                 |");
            System.out.println("| 2 - REGISTER MATERIAL        |");
            System.out.println("| 3 - RESERVE MATERIAL         |");
    	    System.out.println("| 4 - SHOW USER LIST           |");
    	    System.out.println("| 5 - SHOW MATERIAL LIST       |");
    	    System.out.println("|                              |");
    	    System.out.println("| 0 - EXIT                     |");
            System.out.println("================================");
            System.out.print("ENTER YOUR CHOICE: ");
            int option = sc.nextInt();
            sc.nextLine();


            switch (option) {
                case 1:{
                    newUser();
                    break;
                }
                case 2:{
                    materialMenu();
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    listUser();
                    break;
                }
                case 5:{
                    listMaterials();
                    break;
                }
                case 6:{
                    break;
                }
                case 0:{
                    execution = false;
                    break;
                }
                default:{
                    System.out.println("INVALID OPTION");
                }
            }
        }
        sc.close();
    }

    public static void newUser(){
        System.out.println("====== REGISTER A NEW USER ======");
        System.out.print("NAME: ");
        String name = sc.nextLine();        
        System.out.print("EMAIL: ");
        String email = sc.nextLine();
        boolean exec = true;

        while(exec){
            System.out.print("WHAT'S YOUR DEGREE? (1 - TEACHER | 2 - STUDENT): ");
            Integer degree = sc.nextInt();
            if(degree == 1){
                try{
                    Teacher teacher = new Teacher();
                    teacher.setName(name);
                    teacher.setEmail(email);
                    users.add(teacher);
                } catch(emailInvalidException | domineException e){
                    System.out.println("INVALID EMAIL");
                }
                exec = false;
            } else if (degree == 2){
                Boolean EX = true;
                while(EX){
                    System.out.print("WHAT'S YOUR EDUCATION LEVEL? (1 - GRADUATION | 2 - MASTER| 3 - PHD): ");
                    Integer level = sc.nextInt();
                    if(level < 1 | level > 3){
                        System.out.println("INVALID NUMBER - TRY AGAIN!");
                    } else{
                        try{
                            Student student = new Student();
                            student.setName(name);
                            student.setEmail(email);
                            student.setLevel(level);
                            System.out.print("REGISTRY: ");
                            Integer registry = sc.nextInt();
                            student.setRegistry(registry);
                            users.add(student);
                        } catch(emailInvalidException | domineException e){
                            System.out.println("INVALID EMAIL");
                        }
                        EX = false;
                    }
                }
                exec = false;
            }
        }
    }

    public static void listUser(){
        System.out.println("============= USERS ==============\n");
        for(User users : users){
            System.out.println(users.toString());
        }
        System.out.println("==================================\n");
    }

    public static void materialMenu(){
        boolean exec = true;
        while(exec){
            System.out.println("====== REGISTER MATERIAL =======");
            System.out.println("| 1 - REGISTER NEW BOOK        |");
            System.out.println("| 2 - REGISTER NEW CD          |");
    	    System.out.println("|                              |");
    	    System.out.println("| 0 - BACK                     |");
            System.out.println("================================");
            System.out.print("ENTER YOUR CHOICE: ");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:{
                    newBook();
                    break;
                }
                case 2:{
                    newCD();
                    break;
                }
                case 0:{
                    exec = false;
                    break;
                }
                default:{
                    System.out.println("INVALID OPTION");
                }
            }
        }
    }

    public static void newBook(){
        System.out.println("====== REGISTER NEW BOOK =======");
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        System.out.print("AUTHOR: ");
        String author = sc.nextLine();
        System.out.print("PUBLISHING COMPANY: ");
        String publisher = sc.nextLine();
        System.out.print("PUBLISH YEAR: ");
        Integer year = sc.nextInt();
        System.out.print("QUANTITIES: ");
        Integer quantities = sc.nextInt();

        Books book = new Books();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);
        book.setYear(year);
        book.setQuantities(quantities);

        materials.add(book);
    }
    
    public static void newCD(){
        System.out.println("======= REGISTER NEW CD ========");
        System.out.print("TITLE: ");
        String title = sc.nextLine();
        System.out.print("AUTHOR: ");
        String author = sc.nextLine();
        System.out.println("PUBLISH YEAR: ");
        Integer year = sc.nextInt();
        System.out.println("QUANTITIES: ");
        Integer quantities = sc.nextInt();

        CD cd = new CD();
        cd.setTitle(title);
        cd.setAuthor(author);
        cd.setYear(year);
        cd.setQuantities(quantities);

        materials.add(cd);
    }

    public static void listMaterials(){
        System.out.println("=========== MATERIALS ============\n");
        for(Materials materials : materials){
            System.out.println(materials.toString());
        }
        System.out.println("==================================\n");
    }

}

