package Zodiac;

/**
 * Created by yuriyf on 11/8/2016
 */
public enum ZodiacElements{
        FIRE("Fire"),
        EARTH("Earth"),
        AIR("Air"),
        WATER("Water");

        private final String nameOfElement;

        ZodiacElements(String nameOfElement) {
            this.nameOfElement = nameOfElement;
        }

        public String getNameOfElement() {
            return nameOfElement;
        }
    }

