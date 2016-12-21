package december16;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by yuriyf on 12/20/2016
 */
public class class20_12_16
{
    public static void main(String[] args){
        new Thread (
                () -> System.out.println("hello")
        ).start();

        Consumer<Integer> c = (Integer x) -> { System.out.println(x);};

        execute( () -> System.out.println("ez pzy"));

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.forEach(n -> System.out.println("using lambda exp --" + n));

        List<Integer> list2 = Arrays.asList(15, 16, 17);
        list2.forEach(System.out::println);

        System.out.println("Print odd numbers:");
        evaluate(list, (n) -> n%2!=0);
    }

    public static void execute(WorkerInterface workerInterface){
        workerInterface.doSomeWork();
    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
    }


}


