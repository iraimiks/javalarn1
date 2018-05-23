package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();

        char initial = name.charAt(0);

        if(initial >= 'A' && initial <= 'Z'){
            System.out.println("Its start with capital letter");
        }else{
            System.out.println("It start with soumthing other than capital letter");
        }
	// write your code here
    }
}
