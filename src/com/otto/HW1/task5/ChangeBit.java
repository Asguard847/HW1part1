package com.otto.HW1.task5;

import java.util.Scanner;

public class ChangeBit {
    public static void main(String[] args) {
        System.out.println("Enter number to be changed, than position of a bit");
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            int pos = sc.nextInt();

            //Here we find out if byte to be changed is set or not
            int requiredByte = number >> pos & 1;

            int result;
            if(requiredByte==1){
                result = number & ~(1 << pos);
            }else{
                result = number | (1 << pos);
            }
            System.out.println("Resulting value is: " + result);

        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }

        //Another convenient method if we just need to switch a bit
        public static int changeBit(int number, int pos){
            return number^(1<<pos);

    }


}
