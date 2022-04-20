package course.qa.hello;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {//nqma nujda ot obekt za da se startira
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();//prochita imeto ot konzolata
        System.out.println("Hello " + name + " from java 11");
       
    }
}
