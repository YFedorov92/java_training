package Zodiac;

/**
 * Created by yuriyf on 11/8/2016
 */
public class ZodiacElements {

    public enum Elements{
        FIRE("Fire"),
        EARTH("Earth"),
        AIR("Air"),
        WATER("Water");

        private final String nameOfElement;

        Elements(String nameOfElement) {
            this.nameOfElement = nameOfElement;
        }

        public String getNameOfElement() {
            return nameOfElement;
        }
    }
}
