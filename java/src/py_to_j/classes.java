package py_to_j;

class Employee{
    int id;
    private int salary;
    String name;

    public void PersonalDetails(){
        System.out.println("My name is "+name);
    }

    public int getSalary(){
        return salary;
    }
    public void setSalary(int value){
        salary = value;
    }
}
public class classes {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Sid";

        employee.setSalary(200000);
        employee.PersonalDetails();
        int sal = employee.getSalary();
        System.out.println(sal);
    }
}
