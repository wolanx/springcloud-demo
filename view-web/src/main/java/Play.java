import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Play {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(123);
        arr.add(222);
        arr.add(333);

        System.out.println("arr = " + arr);

        arr.forEach(System.out::println);

    }

}
