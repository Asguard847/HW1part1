package com.otto.HW1.task1;

import java.util.Scanner;


public class BinaryToInt {

    public static void main(String[] args) {
        System.out.println("Please, enter binary number");
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();

        String result = binaryToInt(binary);
        if(result!="wrong"){
            System.out.println("Decimal value is: " + result);
        }else{
            System.out.println("\n Thanks for interest in our program. \n"
                                +"We regret to inform you that your input was incorrect. \n"
                                +"Better luck next time!");
        }
        sc.close();
    }

    public static int power(int number, int power){
        int result = 1;
        for(int i =1; i<=power; i++){
            result *= number;
        }
        return result;
    }

    public static String binaryToInt(String inputBinary){
        char[] binaryChars = inputBinary.toCharArray();

        int result = 0;
        int power = 0;

        for(int i= binaryChars.length-1; i>=0; i--){
            if(binaryChars[i]!='1' && binaryChars[i]!='0'){
                return "wrong";
            }
            if(binaryChars[i]=='1'){
                result += power(2, power);
            }
            power++;
        }
        return Integer.toString(result);
    }
}
