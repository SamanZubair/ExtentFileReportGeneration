package Lib;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getCurrentDateTime()
    {
        DateFormat dateformat = new SimpleDateFormat("MM-dd-yyyy-HH-mm-ss");
        Date date = new Date();
        String currentDate = dateformat.format(date);
        return currentDate;
    }

}
