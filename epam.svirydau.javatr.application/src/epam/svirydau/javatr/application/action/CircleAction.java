package epam.svirydau.javatr.application.action;

import epam.svirydau.javatr.application.figure.Circle;
import static java.lang.Math.PI;

public class CircleAction {

    public static double calculatePerimeter(Circle c)
    {
        return (2 * PI * c.getRadial());
    }

    public static double calculateArea(Circle c)
    {
        return (PI * Math.pow(c.getRadial(), 2));
    }
}