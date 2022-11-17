import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateMegaSenaNumbers {
    public static void main(String[] args) {
        Integer [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,
                    31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60};
        List<Integer> list = Arrays.asList(values);
        Collections.shuffle(list);

        List<Integer> values2 = new ArrayList<>();
        values2.add(list.get(0));
        values2.add(list.get(1));
        values2.add(list.get(2));
        values2.add(list.get(3));
        values2.add(list.get(4));
        values2.add(list.get(5));

        Collections.sort(values2);
        System.out.println(values2);
    }
}
