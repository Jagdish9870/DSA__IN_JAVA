package StreamAPIQuestion.MediumQ.data;

public class Employee {
    private int id;
    private String name;
    private Double salary;
    private String dept;


    public Employee(int id, String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

    }
    
    public Employee(int id, String name,double salary,String dept){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.dept=dept;

    }
    public int getId() {
        return id;
    }
  
    public String getName() {
        return name;
    }
   
    public Double getSalary() {
        return salary;
    }
    public String getDept(){
        return dept;

    }
   
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name +", dept=" + dept+ ", salary=" + salary + "]";
    }
    
    
}
