import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class GenerateLotoEasyNumbers {
    public static void main(String[] args) {

            int count = 0;
            int count2 = 0;
            Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
            List<Integer> list = Arrays.asList(values);
            Collections.shuffle(list);

            Integer[] myNumbers = {2, 3, 5, 6, 7, 8, 10, 14, 15, 16, 18, 19, 21, 23, 24};
            List<Integer> mynumberslist = Arrays.asList(myNumbers);
            System.out.println("Meus números: " + mynumberslist);

            Integer[] myNumbers2 = {1, 2, 3, 4, 6, 7, 8, 11, 12, 13, 17, 19, 22, 23, 24};
            List<Integer> mynumberslist2 = Arrays.asList(myNumbers2);
            System.out.println("Meus números 2: " + mynumberslist2);

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

            if (mynumberslist.contains(1) && values2.contains(1)) {
                count += 1;
            }
            if (mynumberslist.contains(2) && values2.contains(2)) {
                count += 1;
            }
            if (mynumberslist.contains(3) && values2.contains(3)) {
                count += 1;
            }
            if (mynumberslist.contains(4) && values2.contains(4)) {
                count += 1;
            }
            if (mynumberslist.contains(5) && values2.contains(5)) {
                count += 1;
            }
            if (mynumberslist.contains(6) && values2.contains(6)) {
                count += 1;
            }
            if (mynumberslist.contains(7) && values2.contains(7)) {
                count += 1;
            }
            if (mynumberslist.contains(8) && values2.contains(8)) {
                count += 1;
            }
            if (mynumberslist.contains(9) && values2.contains(9)) {
                count += 1;
            }
            if (mynumberslist.contains(10) && values2.contains(10)) {
                count += 1;
            }
            if (mynumberslist.contains(11) && values2.contains(11)) {
                count += 1;
            }
            if (mynumberslist.contains(12) && values2.contains(12)) {
                count += 1;
            }
            if (mynumberslist.contains(13) && values2.contains(13)) {
                count += 1;
            }
            if (mynumberslist.contains(14) && values2.contains(14)) {
                count += 1;
            }
            if (mynumberslist.contains(15) && values2.contains(15)) {
                count += 1;
            }
            if (mynumberslist.contains(16) && values2.contains(16)) {
                count += 1;
            }
            if (mynumberslist.contains(17) && values2.contains(17)) {
                count += 1;
            }
            if (mynumberslist.contains(18) && values2.contains(18)) {
                count += 1;
            }
            if (mynumberslist.contains(19) && values2.contains(19)) {
                count += 1;
            }
            if (mynumberslist.contains(20) && values2.contains(20)) {
                count += 1;
            }
            if (mynumberslist.contains(21) && values2.contains(21)) {
                count += 1;
            }
            if (mynumberslist.contains(22) && values2.contains(22)) {
                count += 1;
            }
            if (mynumberslist.contains(23) && values2.contains(23)) {
                count += 1;
            }
            if (mynumberslist.contains(24) && values2.contains(24)) {
                count += 1;
            }
            if (mynumberslist.contains(25) && values2.contains(25)) {
                count += 1;
            }

            if (mynumberslist2.contains(1) && values2.contains(1)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(2) && values2.contains(2)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(3) && values2.contains(3)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(4) && values2.contains(4)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(5) && values2.contains(5)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(6) && values2.contains(6)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(7) && values2.contains(7)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(8) && values2.contains(8)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(9) && values2.contains(9)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(10) && values2.contains(10)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(11) && values2.contains(11)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(12) && values2.contains(12)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(13) && values2.contains(13)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(14) && values2.contains(14)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(15) && values2.contains(15)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(16) && values2.contains(16)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(17) && values2.contains(17)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(18) && values2.contains(18)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(19) && values2.contains(19)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(20) && values2.contains(20)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(21) && values2.contains(21)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(22) && values2.contains(22)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(23) && values2.contains(23)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(24) && values2.contains(24)) {
                count2 += 1;
            }
            if (mynumberslist2.contains(25) && values2.contains(25)) {
                count2 += 1;
            }

            Collections.sort(values2);



                System.out.println("sorteados:    "+values2);
                System.out.println("acertados: "+ count);
                System.out.println("acertados na lista 2: "+count2);




    }
}