package day10Lambda;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
//produce value on demand
public class PinGenerator {
    public static void main(String[] args) {
        Supplier<Integer> randomNumberGenerator = () -> ThreadLocalRandom.current().nextInt(1000,9999);
        System.out.println("Random number generator is: "+randomNumberGenerator.get());
//        Supplier<Integer> randomNumberGenerator=()->{
//            int number=
//        }
    }
}
