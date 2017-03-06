package epam.svirydau.javatr.number.calculator;

import epam.svirydau.javatr.number.Number;
import static java.lang.Math.abs;

public class Calculator {

    public static int calculator(Number number)
    {
        int cNumber = abs(number.getNumber());
        int result = 1;

        do
        {
            result *= cNumber%10;
            cNumber=cNumber/10;
        } while (cNumber>0);

        return result;
    }
}
