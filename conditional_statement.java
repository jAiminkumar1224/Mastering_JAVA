package Mastering_JAVA;

import java.util.*;

class conditional_statement {
    public static void main(String[] args) {

        // Let us fill our today with gratitude
        
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
//if
        // if(age>18){
        // System.out.println("Person is Adult");}
        // else{
        // System.out.println("Person is not an Adult");}

        // int Digit = sc.nextInt();
        // int Mod = Digit%2;

        // if(Mod==0){
        // System.out.println("Digit is Even");}
        // else{
        // System.out.println("Digit is Odd");}
//else if 
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("Equal");
        // } else if (a > b) {
        //     System.out.println("A is greter");
        // } else {
        //     System.out.println("A is Lesser");
        // }

//switch
        int button =sc.nextInt();
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Jay Swaminarayan");
            break;
            case 3: System.out.println("Raji Rehso");
            break;
            default: System.out.println("Please Press given options only 1 | 2 | 3 ");

        }

    }

}