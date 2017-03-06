package epam.svirydau.javatr.application.inputoutput;

import epam.svirydau.javatr.application.inputoutput.ApplicationConst;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutputFileCircle {

    public static void outputFileCircle(ArrayList<String> strResults)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ApplicationConst.PATH_OUTPUT)))
        {
            for(String strCurrent : strResults)
            {
                bw.write(strCurrent);
            }
            System.out.println(ApplicationConst.MSG_OUTPUT_FILE_NOTIFICATION);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}