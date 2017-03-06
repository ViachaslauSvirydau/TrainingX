/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.svirydau.javatr.number;

import epam.svirydau.javatr.number.calculator.Calculator;
import epam.svirydau.javatr.number.creater.NumberCreater;

import java.util.Scanner;

public class RunnerLogic {
    private Scanner scanner = new Scanner(System.in);

    public void printMainDialog()
    {
        int Number;

        do {
            System.out.println("Please, input 4 digit number.");

            //input of some digit
            if (this.scanner.hasNextInt()) {
                Number = scanner.nextInt();

                Number number;

                try
                {
                    number = NumberCreater.createNumber(Number);
                    Calculator.calculator(number);
                    System.out.println("Number: " + number.getNumber() + ", multiply result: " + Calculator.calculator(number) + ".\n");
                }
                catch (Exception e)
                {
                    System.out.println("Warning: there are wrong number. Should be range 1000-9999");
                }

            }
            else
            {
                System.out.println("Wrong number. Please, try again.");
                scanner.next();
            }
        } while(true);
    }

}