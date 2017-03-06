package epam.svirydau.javatr.application.creator;

import epam.svirydau.javatr.application.figure.Circle;
import epam.svirydau.javatr.application.validator.Validator;

public class CircleCreator {

    public static Circle createCircle(double radial)
    {
        try
        {
            if (Validator.checkRadial(radial))
            {
                Circle circle = new Circle();
                circle.setRadial(radial);
                return circle;
            }
        }
        catch (RuntimeException e)
        {
            System.out.println("Circle wasn't created. Input radial: " + radial);
        }

        return null;
    };

}