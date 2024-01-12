import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenerateMegaSenaNumbers {
    public static void main(String[] args) {
        Integer[] myNumbers = {1, 3, 5, 14, 56, 60};
        List<Integer> myNumbersList = Arrays.asList(myNumbers);

        int count;
        int totalGames = 0;

        do {
            totalGames++;

            List<Integer> list = generateRandomNumbers(60);
            Collections.sort(list);

            count = countMatches(myNumbersList, list);

            if (count >= 4) {
                System.out.println("Sorteados: " + list);
                System.out.println("Acertados: " + count);
                System.out.println("Total de jogos até o acerto: " + totalGames);
                System.out.println();
            }

        } while (count < 6);
    }

    private static List<Integer> generateRandomNumbers(int range) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= range; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list.subList(0, 6);
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
