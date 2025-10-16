package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import StreamAPIQuestion.MediumQ.data.Employee;

public class AvgSalary {
    public static void main(String[] args) {
         List<Employee> list=Arrays.asList(new Employee(101, "jack", 100000),new Employee(102, "john", 45000),
        new Employee(103, "rin", 55000),
        new Employee(104, "sera", 80000),
        new Employee(105, "mina", 70000),
        new Employee(106, "grok", 50000));

            OptionalDouble listEmpIncreasing=list.stream().mapToDouble(Employee::getSalary).average();
            System.out.println(listEmpIncreasing.getAsDouble());

        
    }
    
}
