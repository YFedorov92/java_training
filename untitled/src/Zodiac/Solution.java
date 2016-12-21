package Zodiac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yuriyf on 12/12/2016
 */

public class Solution {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM");
        String dateS = simpleDateFormat.format(date);
        System.out.println(sendZodiac(dateS));
    }


    public static ZodiacSigns sendZodiac(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM");
        ZodiacSigns sign = null;
        Date dayToCheck = sdf.parse(date);
        for ( ZodiacSigns zodiacSigns : ZodiacSigns.values()) {
            if (sdf.parse(zodiacSigns.getDayStart()).before(dayToCheck) && sdf.parse(zodiacSigns.getDayEnd()).after(dayToCheck)
                    || sdf.parse(zodiacSigns.getDayEnd()).equals(dayToCheck)) {
                System.out.print(zodiacSigns.name() + " -->> ");
               sign = zodiacSigns ;
            }
        }
        return sign;

    }
}


