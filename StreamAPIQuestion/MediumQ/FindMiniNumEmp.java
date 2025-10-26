package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import StreamAPIQuestion.MediumQ.data.Employee;

public class FindMiniNumEmp {
    public static void main(String[] args) {
         List<Employee> list=Arrays.asList(new Employee(101, "jack", 100000,"IT"),new Employee(102, "john", 45000,"IT"),
        new Employee(103, "rin", 55000,"HR"),
        new Employee(104, "sera", 80000,"FI"),
        new Employee(105, "mina", 70000,"HR"),
         new Employee(107, "eina", 75000,"HR"),
        new Employee(106, "grok", 50000,"FI"));

        // Map<String,Long> numberEmp=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        // System.out.println(numberEmp);

        // List<Map.Entry<String,Long>> listfinal=numberEmp.entrySet().stream().filter(e->e.getValue()>2).toList();
        // System.out.println(listfinal);

        //or
        List<String> numberEmp=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).toList();
        System.out.println(numberEmp);
    }
    
}
