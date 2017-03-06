
package epam.svirydau.javatr.number.creater;

import epam.svirydau.javatr.number.Number;
import epam.svirydau.javatr.number.validator.Validator;

public class NumberCreater {

    public static Number createNumber(int iNumber){

        try{
            
            if (Validator.checkNumber(iNumber)){
                
                Number number = new Number();
                number.setNumber(iNumber);
                return number;
            }
        }
        catch (NullPointerException e){
            
            System.out.println("Wrong number. Input : " + iNumber);
        }

        return null;

    };
}