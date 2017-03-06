package epam.svirydau.javatr.application.inputoutput;

import java.util.ArrayList;
import java.util.Scanner;
import epam.svirydau.javatr.application.inputoutput.ApplicationConst;

public class InputCmdCircle {

    public static ArrayList<String> inputCmdCircle(Scanner scanner)
    {
        ArrayList<String> inRadials = new ArrayList<String>();
        int inRadialCount = 0;
        String inRadialValue;

        System.out.println(ApplicationConst.MSG_INPUT_COUNT_RADIAL);

        do {
            if (scanner.hasNextInt()) {
                inRadialCount = scanner.nextInt();
                break;
            }
            else
            {
                System.out.println(ApplicationConst.MSG_WRONG_VALUE);
                scanner.next();
            }
        } while(true);

        scanner.nextLine();
        System.out.println(ApplicationConst.MSG_INPUT_RADIAL_LIST);

        for (int i = 0; i < inRadialCount; i++) {
            inRadialValue = scanner.nextLine();
            inRadials.add(inRadialValue);
        }

        return inRadials;
    }
}