package course.qa.hello;

import course.qa.feature.HelloFormatter;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {//nqma nujda ot obekt za da se startira
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();//prochita imeto ot konzolata

        HelloFormatter hf = new HelloFormatter();
        System.out.println(hf.format(name));
        System.out.println("Hello " + name + " from java 11");
    }
}

