package com.company;

public class Main {

    public static void main(String[] args) {
	int year =  0;
	if ((year < 0) || year > 3000){
	    System.out.println("введите год от 0 до 3000");
    } else if (year % 4 == 0){
	    if ((year % 100 != 0) || (year % 400 == 0)){
	        System.out.println("Год високосный");
        }else{
	        System.out.println("Год не високосный");
        }
    }else {
        System.out.println("Год не високосный");
    }

    }
}
