package Zodiac;

/**
 * Created by yuriyf on 11/1/2016
 */
public enum ZodiacSigns {

        ARIES("Ram", "21-3", "20-4", ZodiacElements.FIRE.getNameOfElement(), "Mars"),
        TAURUS("Bull", "21-4", "20-5", ZodiacElements.EARTH.getNameOfElement(), "Earth"),
        GEMINI("Twins", "21-5", "20-6", ZodiacElements.AIR.getNameOfElement(), "Mercury"),
        CANCER("Crab", "21-6", "20-7", ZodiacElements.WATER.getNameOfElement(), "Moon"),
        LEO("Lion", "21-7", "20-8", ZodiacElements.FIRE.getNameOfElement(), "Sun"),
        VIRGO("Maiden", "21-8", "20-9", ZodiacElements.EARTH.getNameOfElement(), "Mercury"),
        LIBRA("Scales", "21-9", "20-10", ZodiacElements.AIR.getNameOfElement(), "Venus"),
        SCOPRIO("Scorpion", "21-10", "20-11", ZodiacElements.WATER.getNameOfElement(), "Pluto"),
        SAGITTARIUS("Archer", "21-11", "20-12", ZodiacElements.FIRE.getNameOfElement(), "Jupiter"),
        CAPRICORN("Goat Horn", "21-12", "20-1", ZodiacElements.EARTH.getNameOfElement(), "Saturn"),
        AQUARIUS("Water Carrier", "21-1", "20-2", ZodiacElements.AIR.getNameOfElement(), "Uranus"),
        PISCES("Fish", "21-2", "20-3", ZodiacElements.WATER.getNameOfElement(), "Neptune");

        private final String translation;
        private final String dayStart;
        private final String dayEnd;
        private String element;
        private final String planet;

        ZodiacSigns(String translation, String dayStart, String dayEnd, String element ,String planet) {
            this.translation = translation;
            this.dayStart = dayStart;
            this.dayEnd = dayEnd;
            this.element = element;
            this.planet = planet;
        }

        public String getTranslation() {
            return translation;
        }

        public String getDayStart() {
            return dayStart;
        }

        public String getDayEnd() {
            return dayEnd;
        }

        public String getPlanet() {
            return planet;
        }

        @Override
        public String toString() {
            return "ZodiacSigns{" +
                    "translation = '" + translation + '\'' +
                    ", dayStart = " + dayStart +
                    ", dayEnd = " + dayEnd +
                    ", elements = " + element +
                    ", planet= '" + planet + '\'' +
                    '}';
        }
}
