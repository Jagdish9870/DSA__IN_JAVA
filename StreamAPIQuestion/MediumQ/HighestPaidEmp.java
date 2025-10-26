package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import StreamAPIQuestion.MediumQ.data.Employee;

public class HighestPaidEmp {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee(101, "jack", 100000,"IT"),new Employee(102, "john", 45000,"IT"),
        new Employee(103, "rin", 55000,"HR"),
        new Employee(104, "sera", 80000,"FI"),
        new Employee(105, "mina", 70000,"HR"),
        new Employee(106, "grok", 50000,"FI"));

        Map<String,Optional<Employee>> highestPaidEmp=list.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(highestPaidEmp);
    }
    
}
