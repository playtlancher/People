package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        int a = 0;
        String word = "";
        PeopleList people = new PeopleList();
        Scanner scan = new Scanner(System.in);
        while (true) {
            switch (a) {
                case 0:
                    System.out.println(" 1 - Add people");
                    System.out.println(" 2 - Watch devices");
                    System.out.println(" 3 - Sort by name and age");
                    System.out.println(" 4 - Sort by name");
                    System.out.println(" 5 - Watch solider list");
                    System.out.println(" 6 - medium man age");
                    System.out.println(" 7 - max age");
                    System.out.println(" 8 - min age");
                    System.out.println(" 9 - work person");
                    System.out.println(" 10 - man number");
                    System.out.println(" 11 - woman number");
                    System.out.println(" 12 - Women whose name begins with 'A'");
                    System.out.println(" 13 - remove people");
                    a = scan.nextInt();
                    break;
                case 1:
                    System.out.println("Enter age");
                    a = scan.nextInt();
                    people.age = a;
                    word = scan.nextLine();
                    System.out.println("Enter name");
                    word = scan.nextLine();
                    people.name = word;
                    System.out.println("Enter sex");
                    word = scan.nextLine();
                    people.sex = word;
                    people.addDevice();
                    a = 0;
                    break;
                case 2:
                    people.watchPeople();
                    a = 0;
                    break;
                case 3:
                    people.sortNameAndAge();
                    a = 0;
                    break;
                case 4:
                    people.sortName();
                    a = 0;
                    break;
                case 5:
                    people.soliderList();
                    a = 0;
                    break;
                case 6:
                    people.mediumAge();
                    a = 0;
                    break;
                case 7:
                    people.maxAge();
                    a = 0;
                    break;
                case 8:
                    people.minAge();
                    a = 0;
                    break;
                case 9:
                    people.workPerson();
                    a = 0;
                    break;
                case 10:
                    people.man();
                    a = 0;
                    break;
                case 11:
                    people.woman();
                    a = 0;
                    break;
                case 12:
                    System.out.println("Enter letter");
                    word = scan.nextLine();
                    word = scan.nextLine();
                    people.womanA(word);
                    a = 0;
                    break;
                case 13:
                    people.removePeople();
                    a = 0;
                    break;
            }
        }
    }
}