package Zodiac;

// Create an Enum called "ZodiacSigns" which will contain all the signs by their name and in additions the following information.
// Make sure to declare relevant fields & methods, Use Enum for Element as well.
// Declare a program that will print the info of the sign represented by todays run date
// (the relevant sign will be chosen according to the sysdate)


/**
 * Created by yuriyf on 11/1/2016
 */
public class Zodiac {

    public enum ZodiacSigns {

        ARIES("Ram", 21, 3, 20, 4, ZodiacElements.Elements.FIRE.getNameOfElement(), "Mars"),
        TAURUS("Bull", 21, 4, 20, 5, ZodiacElements.Elements.EARTH.getNameOfElement(), "Earth"),
        GEMINI("Twins", 21, 5, 20, 6, ZodiacElements.Elements.AIR.getNameOfElement(), "Mercury"),
        CANCER("Crab", 21, 6, 20, 7, ZodiacElements.Elements.WATER.getNameOfElement(), "Moon"),
        LEO("Lion", 21, 7, 20, 8, ZodiacElements.Elements.FIRE.getNameOfElement(), "Sun"),
        VIRGO("Maiden", 21, 8, 20, 9, ZodiacElements.Elements.EARTH.getNameOfElement(), "Mercury"),
        LIBRA("Scales", 21, 9, 20, 10, ZodiacElements.Elements.AIR.getNameOfElement(), "Venus"),
        SCOPRIO("Scorpion", 21, 10, 20, 11, ZodiacElements.Elements.WATER.getNameOfElement(), "Pluto"),
        SAGITTARIUS("Archer", 21, 11, 20, 12, ZodiacElements.Elements.FIRE.getNameOfElement(), "Jupiter"),
        CAPRICORN("Goat Horn", 21, 12, 20, 1, ZodiacElements.Elements.EARTH.getNameOfElement(), "Saturn"),
        AQUARIUS("Water Carrier", 21, 1, 20, 2, ZodiacElements.Elements.AIR.getNameOfElement(), "Uranus"),
        PISCES("Fish", 21, 2, 20, 3, ZodiacElements.Elements.WATER.getNameOfElement(), "Neptune");

        private final String translation;
        private final int dayStart;
        private final int monthStart;
        private final int dayEnd;
        private final int monthEnd;
        private String element;
        private final String planet;

        ZodiacSigns(String translation, int dayStart, int monthStart, int dayEnd, int monthEnd, String element ,String planet) {
            this.translation = translation;
            this.dayStart = dayStart;
            this.monthStart = monthStart;
            this.dayEnd = dayEnd;
            this.monthEnd = monthEnd;
            this.element = element;
            this.planet = planet;
        }

        public String getTranslation() {
            return translation;
        }

        public int getDayStart() {
            return dayStart;
        }

        public int getMonthStart() {
            return monthStart;
        }

        public int getDayEnd() {
            return dayEnd;
        }

        public int getMonthEnd() {
            return monthEnd;
        }

        public String getPlanet() {
            return planet;
        }

        @Override
        public String toString() {
            return "ZodiacSigns{" +
                    "translation='" + translation + '\'' +
                    ", dayStart=" + dayStart +
                    ", monthStart=" + monthStart +
                    ", dayEnd=" + dayEnd +
                    ", monthEnd=" + monthEnd +
                    ", elements=" + element +
                    ", planet='" + planet + '\'' +
                    '}';
        }
    }
}