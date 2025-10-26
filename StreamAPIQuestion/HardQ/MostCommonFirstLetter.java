package StreamAPIQuestion.HardQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import StreamAPIQuestion.MediumQ.data.Employee;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee(101, "jack", 100000,"IT"),new Employee(102, "john", 45000,"IT"),
        new Employee(103, "rin", 55000,"HR"),
        new Employee(104, "sera", 80000,"FI"),
        new Employee(105, "mina", 70000,"HR"),
         new Employee(107, "eina", 75000,"HR"),
        new Employee(106, "grok", 50000,"FI"));



         Optional<Map.Entry<Character,Long>> map=list.stream().map(e->e.getName().charAt(0)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
         System.out.println(map.get());

         
    }
    
}
