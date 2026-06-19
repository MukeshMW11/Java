import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Op {
    public static void main(String a[]) {
        List<String> ar = Arrays.asList("Kane", "Jane", "Lane", "Rko");
        // String name = ar.stream().filter(n ->
        // n.contains("ko")).findFirst().orElse("No name found");
        Optional<String> name = ar.stream().filter(n -> n.contains("aa")).findFirst();

        System.out.println(name.orElse("No name found"));

    }
}
