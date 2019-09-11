package com.otto.HW1.task3;

import java.util.Scanner;

public class BitCount {

    public static void main(String[] args) {
        System.out.println("Enter your number");

        try(Scanner sc = new Scanner(System.in)) {
            long input = sc.nextLong();
            System.out.println("Number of bits: " +byteCount(input));
        }catch (Exception e){
            System.out.println("Wrong input");
        }
    }

    public static int byteCount(long value){

        int count = 0;
        while(value>0){
            value = value >> 1;
            count++;
        }
        return count;
    }

}
