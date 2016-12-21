package december16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by yuriyf on 12/21/2016
 */
public class HomePractice {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Blue", "Red", "White", "Black", "Yellow", "Gray", "Green", "Pink", "Purple", "Brown");
        list.forEach(System.out::println);
        list.forEach((n) -> System.out.println(n + " >>>> another way!"));

        System.out.println("\nPrints only colors which start with the letter “G”");
        filter(list, (n) -> n.startsWith("G"));

        System.out.println("\nPrints only colors with 4 letters");
        filter(list, (n) -> n.length() == 4);

        System.out.println("\nPrints colors which ends with the letter “e”");
        filter(list, (n) -> n.endsWith("e"));

        System.out.println("\nPrints all colors");
        filter(list, (n) -> true);

        System.out.println("\nPrints nothing (no color)");
        filter(list, (n) -> false);

    }

    public static void filter(List<String> elements, Predicate<String> condition){
        for (String s : elements)
        {
            if (condition.test(s)){
                System.out.println(s);
            }
        }
    }

}
