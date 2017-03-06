package epam.svirydau.javatr.application.inputoutput;

import epam.svirydau.javatr.application.action.CircleAction;
import epam.svirydau.javatr.application.creator.CircleCreator;
import epam.svirydau.javatr.application.figure.Circle;

import java.util.ArrayList;
import java.util.Scanner;

public class Communication {

    private ArrayList<Circle> circles = new ArrayList<Circle>();

    private void addCircle(ArrayList<String> strArray)
    {
        double dblRadial;
        for(String strCurrent : strArray)
        {
            Circle circle;

            try
            {
                dblRadial = Double.parseDouble(strCurrent);
                circle = CircleCreator.createCircle(dblRadial);
                circles.add(circle);
            }
            catch (Exception e)
            {
                System.out.println("Warning: there are wrong radials.");
            }
        }
    }

    private ArrayList<String> resultCircleCalculation()
    {
        ArrayList<String> strResults = new ArrayList<String>();
        String strCurrentResult = "";
        for(Circle c : circles)
        {
            strCurrentResult=
                    "Radial: " + c.getRadial() +
                    ", Perimeter: " + CircleAction.calculatePerimeter(c) +
                    ", Area: " + CircleAction.calculateArea(c) + ".\n";

            strResults.add(strCurrentResult);
        }
        return strResults;
    }


    private void choiceInput()
    {
       
       Scanner scanner = new Scanner(System.in);
         int menuOption;
      
         ArrayList<String> inRadials;

        do {
            System.out.println(ApplicationConst.MSG_CHOICE_INPUT);

                if (scanner.hasNextInt()) {
                menuOption = scanner.nextInt();

                switch (menuOption)
                {
                    
                    case 1:
                        inRadials = InputCmdCircle.inputCmdCircle(scanner);
                        addCircle(inRadials);
                        choiceOutput(scanner);
                        return;
                    case 2:
                        inRadials = InputFileCircle.inputFileCircle();
                        addCircle(inRadials);
                        choiceOutput(scanner);
                        return;
                    default:
                        System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                }
            }
            else
            {
                System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                scanner.next();
            }
        } while(true);
    }

    private void choiceOutput(Scanner scanner)
    {
        int menuOption;

        do {
            System.out.println(ApplicationConst.MSG_CHOICE_OUTPUT);

            if (scanner.hasNextInt()) {
                menuOption = scanner.nextInt();

                switch (menuOption)
                {
                    case 1:
                        OutputCmdCircle.outputCmdCircle(resultCircleCalculation());
                        return;
                    case 2:
                        OutputFileCircle.outputFileCircle(resultCircleCalculation());
                        return;
                    case 3:
                        OutputCmdCircle.outputCmdCircle(resultCircleCalculation());
                        OutputFileCircle.outputFileCircle(resultCircleCalculation());
                        return;
                    default:
                        System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                }
            }
            else
            {
                System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                scanner.next();
            }
        } while(true);
    }

    private int choiceNextStep()
    {
        int menuOption;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(ApplicationConst.MSG_CHOICE_NEXT_STEP);

            if (scanner.hasNextInt()) {
                menuOption = scanner.nextInt();

                switch (menuOption)
                {
                    case 1:
                        return 1;
                    case 0:
                        return 0;
                    default:
                        System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                        scanner.next();
                }
            }
            else
            {
                System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                scanner.next();
            }
        } while(true);

    }


    public void printMainDialog()
    {
        do
        {
            choiceInput();
        } while (choiceNextStep() == 1);
    }
}