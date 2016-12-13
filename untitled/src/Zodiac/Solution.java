package Zodiac;

import java.text.ParseException;
import java.time.LocalDate;

/**
 * Created by yuriyf on 12/12/2016
 */

public class Solution {

    public static void main(String[] args) throws ParseException {
        LocalDate date = LocalDate.now();
        System.out.println(sendZodiac(date));
    }

    public static Zodiac.ZodiacSigns sendZodiac(LocalDate date) throws ParseException {
        Zodiac.ZodiacSigns zodiacSigns = null;
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();

        // Zodiac.ZodiacSigns.SAGITTARIUS.getDayEnd() >= day && Zodiac.ZodiacSigns.SAGITTARIUS.getMonthEnd() <= month
        if (Zodiac.ZodiacSigns.ARIES.getDayStart() <= day && Zodiac.ZodiacSigns.ARIES.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.ARIES;
        }
        else if (Zodiac.ZodiacSigns.TAURUS.getDayStart() <= day && Zodiac.ZodiacSigns.TAURUS.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.TAURUS;
        }
        else if (Zodiac.ZodiacSigns.GEMINI.getDayStart() <= day && Zodiac.ZodiacSigns.GEMINI.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.GEMINI;
        }
        else if (Zodiac.ZodiacSigns.CANCER.getDayStart() <= day && Zodiac.ZodiacSigns.CANCER.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.CANCER;
        }
        else if (Zodiac.ZodiacSigns.LEO.getDayStart() <= day && Zodiac.ZodiacSigns.LEO.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.LEO;
        }
        else if (Zodiac.ZodiacSigns.VIRGO.getDayStart() <= day && Zodiac.ZodiacSigns.VIRGO.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.VIRGO;
        }
        else if (Zodiac.ZodiacSigns.LIBRA.getDayStart() <= day && Zodiac.ZodiacSigns.LIBRA.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.LIBRA;
        }
        else if (Zodiac.ZodiacSigns.SCOPRIO.getDayStart() <= day && Zodiac.ZodiacSigns.SCOPRIO.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.SCOPRIO;
        }
        else if (Zodiac.ZodiacSigns.SAGITTARIUS.getDayStart() <= day && Zodiac.ZodiacSigns.SAGITTARIUS.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.SAGITTARIUS;
        }
        else if (Zodiac.ZodiacSigns.CAPRICORN.getDayStart() <= day && Zodiac.ZodiacSigns.CAPRICORN.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.CAPRICORN;
        }
        else if (Zodiac.ZodiacSigns.AQUARIUS.getDayStart() <= day && Zodiac.ZodiacSigns.AQUARIUS.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.AQUARIUS;
        }
        else if (Zodiac.ZodiacSigns.PISCES.getDayStart() <= day && Zodiac.ZodiacSigns.PISCES.getMonthStart() >= month)
        {
            zodiacSigns = Zodiac.ZodiacSigns.PISCES;
        }
        return zodiacSigns;
    }
}
