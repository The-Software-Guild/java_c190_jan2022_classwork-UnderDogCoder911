/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softwareguild.foundations.demotwo;

import java.util.Scanner;

/**
 *
 * @author luca_
 */
public class HelloIDE {
    public static void main(String[] args) {
        int enterednumber = 0;
        System.out.println("Enter a number 1 to 5");
        Scanner myScan;
        myScan = new Scanner(System.in);
        
        enterednumber = myScan.nextInt();
        double price = 42, discount = 10, sale;
        sale = price - (price * (discount / 100));
        HelloIDE myHello = new HelloIDE();
        String message = "Hello World";
        message += "- From IDE";
        message += ("extra" + myHello.getNumber());
        myHello.getNumber();
        
        demonstrateOperators(enterednumber);
        System.out.println(message);
    }

    private static void demonstrateOperators(int num) {
        int firstOperand;
        int secondOperand;
        int result;
        firstOperand = 42;
        secondOperand = 1;
        //result as a result of summing
        result = 2 + 2;
        result = firstOperand + 2;
        result = firstOperand + secondOperand;
        result = 2 + 2 + 4 + 3 + 8;
        result += 42; // result = result + 42;
        System.out.println(++result);
        System.out.println(--result);
        // -, *, /, %
    }

    int getNumber() {
        return 42;
    }
}
