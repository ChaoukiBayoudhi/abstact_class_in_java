package program;


import shapes.*;

import java.util.Scanner;

public class Main {
    public static int menu(){
        System.out.println("Select a choice");
        System.out.println("1. Create Square");
        System.out.println("2. Create Rectangle");
        System.out.println("3. Create Disk");
        System.out.println("4. Exit");
        int choice;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("your choice : ");
            choice=scanner.nextInt();
        }while(choice<1||choice>4);
        return choice;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Shape s1=new Shape(); =>error bacause Shape is abstract, so cannot be instantiated
        int choice;
        Shape s1=new Square();
        do{
            choice=menu();

            switch (choice) {
                case 1:
                    s1=new Square();
                    System.out.println("square length :");
                    ((Square)s1).setLength(scanner.nextDouble());
                    break;
                case 2:
                    s1=new Rectangle();
                    System.out.println("rectangle length :");
                    ((Rectangle)s1).setLength(scanner.nextDouble());
                    System.out.println("rectangle width :");
                    ((Rectangle)s1).setWidth(scanner.nextDouble());
                    break;
                case 3:
                    s1=new Disk();
                    Point p= new Point();
                    System.out.println("disk center coordinates :");
                    System.out.println("x : ");
                    p.setX(scanner.nextDouble());
                    System.out.println("y : ");
                    p.setY(scanner.nextDouble());
                    ((Disk) s1).setCenter(p);
                    System.out.println("radius : ");
                    ((Disk) s1).setRadius(scanner.nextDouble());
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println(s1);
            System.out.println("The perimeter is: " + s1.perimeter());
            System.out.println("The surface is: " + s1.surface());
        }while(choice!=4);

    }
}