package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import StreamAPIQuestion.MediumQ.data.Employee;

public class SortEmployeeSalary {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee(101, "jack", 100000,"IT"),new Employee(102, "john", 45000,"IT"),
        new Employee(103, "rin", 55000,"HR"),
        new Employee(104, "sera", 80000,"FI"),
        new Employee(105, "mina", 70000,"HR"),
        new Employee(106, "grok", 50000,"FI"));

            List<Employee> listEmpIncreasing=list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
            System.out.println(listEmpIncreasing);

             List<Employee> listEmpdecreasing=list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
            System.out.println(listEmpdecreasing);
    }
    
}
