import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateLotoEasyNumbers {
    public static void main(String[] args) {
        Integer[] myNumbers = {2, 3, 5, 6, 7, 8, 10, 14, 15, 16, 18, 19, 21, 23, 24};
        List<Integer> myNumbersList = Arrays.asList(myNumbers);

        Integer[] myNumbers2 = {1, 2, 3, 4, 6, 7, 8, 11, 12, 13, 17, 19, 22, 23, 24};
        List<Integer> myNumbersList2 = Arrays.asList(myNumbers2);

        int count;
        int count2;
        int totalGames = 0;

        do {
            totalGames++;

            List<Integer> list = generateRandomNumbers();

            List<Integer> values2 = list.subList(0, 15);
            Collections.sort(values2);

            count = countMatches(myNumbersList, values2);
            count2 = countMatches(myNumbersList2, values2);

            if (count > 12 || count2 > 12) {
                System.out.println("Sorteados: " + values2);
                System.out.println("Acertados: " + count);
                System.out.println("Acertados na lista 2: " + count2);
                System.out.println("Total de jogos até o acerto: " + totalGames);
            }

        } while (count < 15 && count2 < 15);
    }

    private static List<Integer> generateRandomNumbers() {
        Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        List<Integer> list = new ArrayList<>(Arrays.asList(values));
        Collections.shuffle(list);
        return list;
    }

    private static int countMatches(List<Integer> list1, List<Integer> list2) {
        int count = 0;
        for (Integer number : list1) {
            if (list2.contains(number)) {
                count++;
            }
        }
        return count;
    }
}
