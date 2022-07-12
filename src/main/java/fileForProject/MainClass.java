package fileForProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    static String[] b = {"qwe", "wqe", "qwee", "a", "ewq", "a"};

    public static void main(String[] args) {
        sortingStringInMassive(b);
    }

    public static void sortingStringInMassive(String[] array) {

        List<char[]> list = Arrays.stream(array).map(element -> {
            char[] chars = element.toCharArray();
            Arrays.sort(chars);
            return chars;
        }).collect(Collectors.toList());

        for (int i = 0; i < list.size() - 1; i++) {
            char[] left = list.get(i);
            List<Integer> index = new ArrayList<>();
            index.add(i);

            for (int j = i + 1; j < list.size(); j++) {
                char[] right = list.get(j);
                if (Arrays.equals(left, right)) {
                    index.add(j);
                }
            }
            if (index.size() > 1) {
                System.out.println(
                    array[i] + " - > " + index.stream().map(Object::toString).collect(Collectors.joining(",")));
            }
        }
    }
}


