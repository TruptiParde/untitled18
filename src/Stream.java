//finding strings without using Stream
/*import java.util.ArrayList;
import java.util.List;
public class Stream{
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("ashish");
        names.add("krushna");
        names.add("narendra");
        names.add("ravindra");
        int count = 0;
        for (String str : names) {
            if (str.length() < 8)
                count++;
        }
        System.out.println("There are "+count+" strings with length less than 6");
    }
}*/
//Stream map() function with operation of number * 5 on each element of stream.

/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
public class Stream {
    public static void main(String[] args) {
        System.out.println("the stream after applying " + "and function is:");
        List<Integer> list = Arrays.asList(2,8, 3, 6, 7, 1, 0);
        list.stream().map(number -> number * 5).forEach(System.out::println);
    }
}*/
//Stream map() function with operation of converting lowercase to uppercase.
/*import java.util.*;
import java.util.stream.Collectors;
class Stream{
    public static void main(String[] args){
        System.out.println("after conversion of uppercase:");
        List<String> list = Arrays.asList("abcde" ,"fghig" ,"klmnop");
        List<String> ans = list.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(ans);
    }
}*/
//Stream map() function with operation of mapping string length in place of string.
/*import java.util.*;

class Stream {
    public static void main(String[] args) {
        System.out.println("string length :");
        List<String> list = Arrays.asList("rachana", "sunidhi", "bhagyashri", "renuka");
        list.stream().map(str -> str.length()).forEach(System.out::println);
    }
}*/
//convert a list of String into a list of Integer and then filter all even numbers.
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Stream{
    public static void main(String[] args){
        List<String> no = Arrays.asList("1","2","3","4","5","6","7","8","9","0");
        System.out.println("list: " + no);
        List<Integer> even = no.stream().map(s -> Integer.valueOf(s)).filter(num ->num % 2 == 0).collect(Collectors.toList());
        System.out.println("even no." + even);
    }
}*/
//filter out from the list that are less than 5
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> lessThanThree = numbers.stream()
                .filter((Integer number) -> {
                    return number < 5;
                })
                .collect(Collectors.toList());

        System.out.println(lessThanThree);
    }
}*/
// map() method to collect squares of list
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = list.stream()

                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}*/
//two conditions in the filter method joined using and logical operator
/*import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Trupti","Bgyashriee","Sunidhi","Rachna","riya");
        List<String> longnames = names.stream().filter(str -> str.length() > 5 && str.length() < 7).collect(Collectors.toList());
        longnames.forEach(System.out::println);
    }
}*/
//to use filter() method to filter Map by Values
/*import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
public class Stream {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<>();
        hmap.put(150, "Apple");
        hmap.put(60, "Orange");
        hmap.put(250, "Kiwi");
        hmap.put(25, "Banana");

        Map<Integer, String> result = hmap.entrySet()
                .stream()
                .filter(map -> map.getKey().intValue() <= 100)
                .collect(Collectors.toMap(map -> map.getKey(), map -> map.getValue()));

        System.out.println("Result: " + result);
    }
}*/
//