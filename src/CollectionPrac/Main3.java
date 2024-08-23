package CollectionPrac;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("------Start------");
        List<String> arr = Arrays.asList("abc", "acb", "bca", "bbb");
        arr.stream()
                .filter(i -> i.startsWith("a"))
                .forEach(System.out::println);
        arr.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        arr.stream()
                .sorted()
                .forEach(System.out::println);
        arr.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        System.out.println("==============================");
        List<Integer> list = Arrays.asList(1, 2, 3,4, 5);
        list.stream()
                .filter(i -> i > 3)
                .forEach(System.out::println);
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        int max = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(0);
        System.out.println("Max?" + max);
        double trungbinh = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();
        System.out.println("Min?" + ((min.isPresent()? min.getAsInt():"Not Present")));// muc dich giong or else = 0
        int tich = list.stream()
                .reduce(1, (a,b)-> a*b);
        System.out.println("TOTAL:"+tich);
        int tong = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("SUm la: "+tong);
        int tong2 = list.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum2: "+tong2);

        Double tongphantu = list.stream()
                .mapToDouble(Integer::doubleValue)
                .reduce(0, (result,i)-> result+(1/i));
        System.out.println("Tong Phan Tu: "+tongphantu);
        List<List<String>> listList = Arrays.asList(
                Arrays.asList("a","b","c"),
                Arrays.asList("d","e","f"),
                Arrays.asList("g","h","i")
        );
//        List<String> CombinedList = List.stream()
//                .flatMap();
    }
}
