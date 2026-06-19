import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Parl {
    public static void main(String args[]) {

        List<Integer> pl = new ArrayList<>();
        Random ra = new Random(100);
        for (int i = 0; i < 10_000; i++) {
            pl.add(ra.nextInt());
        }

        Stream<Integer> st = pl.stream();
        Stream<Integer> pt = pl.parallelStream();

        long sStartTime = System.currentTimeMillis();

        st.forEach(n -> {
            try {
                Thread.sleep(1);
                System.out.println(n);

            } catch (Exception e) {
            }

        });

        long sEndTime = System.currentTimeMillis();

        pt.forEach(n -> {

            try {
                Thread.sleep(null);
                System.out.println(n);

            } catch (Exception e) {
            }

        });

        long pEndTime = System.currentTimeMillis();

        System.out.println("The time taken by simple stream is : " + (sEndTime - sStartTime));
        System.out.println("THe time taken by parallel stream is : " + (pEndTime - sEndTime));

    }
}
