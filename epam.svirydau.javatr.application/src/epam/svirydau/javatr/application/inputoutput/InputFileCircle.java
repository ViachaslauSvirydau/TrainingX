package epam.svirydau.javatr.application.inputoutput;

import epam.svirydau.javatr.application.inputoutput.ApplicationConst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFileCircle {

    public static ArrayList<String> inputFileCircle()
    {
        String currentLine;
        ArrayList<String> inRadials = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader(ApplicationConst.PATH_INPUT)))
        {
            while ((currentLine = br.readLine()) != null)
            {
                inRadials.add(currentLine);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return inRadials;
    }

}