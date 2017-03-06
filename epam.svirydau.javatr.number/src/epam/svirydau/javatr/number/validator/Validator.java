/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epam.svirydau.javatr.number.validator;

public class Validator {

    public static boolean checkNumber(int dNumber)
    {
        return (Math.abs(dNumber)>=1000 && Math.abs(dNumber)<=9999);
    }
}