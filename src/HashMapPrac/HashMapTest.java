package HashMapPrac;

import CollectionPrac.Point;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HashMapTest {
//    HashMap<String, String> hashMap;
//
//    public void getHs() {
//        hashMap = new HashMap<>();
//        hashMap.put("USA", "Washington");
//        hashMap.put("USA", "Washington");
//        hashMap.put("USA", "Washington");
//    }
    public static void test1(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("USA","Washington");
        hashMap.put("France","Paris");
        hashMap.put("Japan","Tokyo");

        if (hashMap.containsKey("France")){
            System.out.println("Key Exist: "+ hashMap.get("France"));
        } else {
            System.out.println("Key Not Exist");
        }

        if (hashMap.containsValue("Tokyo")){
            System.out.println("Value Exist");
        }

        hashMap.remove("Japan");
        if (hashMap.containsValue("Tokyo")){
            System.out.println("Value Exist");
        } else {
            System.out.println("Not Exist");
        }


        for(String i: hashMap.keySet()){
            System.out.println("Country: "+i+ " Capital: "+hashMap.get(i));
        }
        System.out.println("#######################################");

        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            String key = entry.getKey();
            String value= entry.getValue();
            System.out.println("Country: " + key +" "+ "Capital: "+value);
        }

        System.out.println("Get USA: "+hashMap.getOrDefault("USA", "Not Exist"));
        System.out.println("Get BALLS: "+hashMap.getOrDefault("Balls", "Not Exist"));

        hashMap.putIfAbsent("VietNam","HaNoi");

        hashMap.computeIfPresent("France",(key,value) -> value + " New");
        System.out.println("Updated: "+ hashMap.get("France"));
    }
    public static void test2(){
        String cauTho = "Pho1 Pho2 Pho3 Pho1 Pho2 Pho1";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words = cauTho.split(" ");
        for (String i : words){
            int dem = hashMap.getOrDefault(i,0);
            hashMap.put(i,dem+1);
        }
        for(String i : hashMap.keySet()){
            System.out.println(i+ " " +hashMap.get(i));
        }
    }
    public static void test3(){
        String cauTho = "Pho1 Pho2 Pho3 Pho1 Pho2 Pho1";
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer tokenizer= new StringTokenizer(cauTho);
        while (tokenizer.hasMoreTokens()){
            String word = tokenizer.nextToken();
            hashMap.put(word,hashMap.getOrDefault(word,0)+1);
        }
        for(String i : hashMap.keySet()){
            System.out.println(i+ " " +hashMap.get(i));
        }
    }
    public static void test4(){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple","1");
        dictionary.put("banana","2");
        dictionary.put("cherry","3");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Tu Tra Cuu");
        String name = scanner.nextLine();
//        if (dictionary.containsKey(name)){
            System.out.println(dictionary.getOrDefault(name,"None"));
//        }
//        else {
//            System.out.println("TU tim kiem khong ton tai");
//        }

    }
    public static void test5(){
        Map<String, Integer> map =new HashMap<>();
        map.put("USA",3);
        map.put("France",4);
        map.put("Japan",7);
        map.put("VietNam",25);

        for (String i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }
//        for(Map.Entry<String, String> entry : hashMap.entrySet()){
//            String key = entry.getKey();
//            String value= entry.getValue();
//            System.out.println("Country: " + key +" "+ "Capital: "+value);
//        }

        System.out.println("#######################################");

        map.entrySet().stream()
                .forEach(i -> System.out.println(i.getKey()+" "+i.getValue()));

        int kq = map.entrySet().stream()
                .mapToInt(i-> i.getValue())
                .sum();

        System.out.println("Result: "+kq);

        Map<String, Integer> newmap = map.entrySet().stream()
                .filter(i->i.getValue()>5)
                .collect(Collectors.toMap(entry-> entry.getKey(), entry->entry.getValue()));

        System.out.println(newmap);
    }
    public static void test6_linkedhashmap(){
        Map<String, Integer> linkedHashMap =new LinkedHashMap<>();
        linkedHashMap.put("USA",3);
        linkedHashMap.put("France",4);
        linkedHashMap.put("Japan",7);
        linkedHashMap.put("VietNam",25);

        linkedHashMap.put("France",10);

        for(Map.Entry<String, Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }
    }
    public static void treeMAP(){
        Map<String, Integer> treemap = new TreeMap<>();
        treemap.put("John", 30);
        treemap.put("Jane", 25);
        treemap.put("Paul", 35);
        treemap.put("Anna", 28);
        for (Map.Entry<String, Integer> i : treemap.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue());
        }
        TreeMap<String, Integer> treemap_VER2 = new TreeMap<>();
        treemap_VER2.put("John", 30);
        treemap_VER2.put("Jane", 25);
        treemap_VER2.put("Paul", 35);
        treemap_VER2.put("Anna", 28);
        for (Map.Entry<String, Integer> i : treemap_VER2.entrySet()){
            System.out.println(i.getKey() + " " + i.getValue() );
        }
        System.out.println("FirsT?"+treemap_VER2.firstKey());
        System.out.println("Last? :"+treemap_VER2.lastKey() +" " + treemap_VER2.lastEntry() + " " + treemap_VER2.get("John") );

    }
    public static void test8_HashCode(){
        Point2 person1 = new Point2("John",30);
        Point2 person2 = new Point2("John",30);
        Point2 person3 = new Point2("Jane",25);
        Map<Point2, Integer> map = new HashMap<>();
        map.put(person1,1);
        map.put(person3,3);

        System.out.println("CO so 2 ko?" + map.containsKey(person2));
        System.out.println(map);
    }
    public static void test9_Optional(){
        Optional<String> optionvalue = Optional.of("whu?");
        Optional<String> emptyoption = Optional.empty();
        System.out.println("optional Value: "+optionvalue.isPresent());
        optionvalue.ifPresent(item-> System.out.println("Not Empty"));

        String value = optionvalue.orElse("Nothing");
        System.out.println("Value: "+ value);

        String generatedvalue = emptyoption.orElseGet(()->"Nothing gotten");
        System.out.println("Value: "+generatedvalue);

        try{
            String result = optionvalue.orElseThrow(()->new IllegalArgumentException("VALUE NOT REAL"));
            System.out.println("Result: "+ result);
        }
        catch (Exception e){
            System.out.println("Nothing here: "+e.getMessage());
        }

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.printf(element+"  ");

        }
        System.out.println("");
    }

    public static void generic1(){
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Test");
        System.out.println(stringBox.getContent());

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent());

        Integer[] integers = {1,2,3,4,5};
        String[] strings = {"A","B","C","D"};

        printArray(integers);
        printArray(strings);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        for (Integer i : integerList){
            System.out.print( i+"  ");
        }

    }

    public static void Pairing(){
        Pair<String,Integer> pair = new OrderedPair<>("An",123);
        System.out.println("\n" + pair.getkey() + "  "+ pair.getvalue());
    }
    public static void testing(){
        Vector<Integer> v = new Vector<>(3,10);
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        for (Integer i : v){
            System.out.println(i);
        }
        System.out.println("___________________________________________");
        System.out.println(v.size());
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
//        test4();
        test5();
        test6_linkedhashmap();
        treeMAP();
        test8_HashCode();
        test9_Optional();
        generic1();
        Pairing();
        testing();
    }

}
