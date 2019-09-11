package com.otto.HW1.task2;

import java.util.Scanner;

public class ChangePolarity {
    public static void main(String[] args) {
        System.out.println("Please enter number");
        try( Scanner sc= new Scanner(System.in)){
            int inputInt = sc.nextInt();
            inputInt = ~inputInt + 1;
            System.out.println("Result: " +inputInt);
        }catch (Exception e){
            System.out.println("Incorrect input");
        }
    }
}
