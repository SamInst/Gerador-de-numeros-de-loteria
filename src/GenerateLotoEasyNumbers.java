import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class GenerateLotoEasyNumbers {
    public static void main(String[] args) {
        Integer [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        List<Integer> list = Arrays.asList(values);
        Collections.shuffle(list);

        List<Integer> values2 = new ArrayList<>();
        values2.add(list.get(0));
        values2.add(list.get(1));
        values2.add(list.get(2));
        values2.add(list.get(3));
        values2.add(list.get(4));
        values2.add(list.get(5));
        values2.add(list.get(6));
        values2.add(list.get(7));
        values2.add(list.get(8));
        values2.add(list.get(9));
        values2.add(list.get(10));
        values2.add(list.get(11));
        values2.add(list.get(12));
        values2.add(list.get(13));
        values2.add(list.get(14));

        Collections.sort(values2);
        System.out.println(values2);
    }
}