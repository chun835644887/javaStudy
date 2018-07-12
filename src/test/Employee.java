package test;
import  java.time.*;
import java.util.Objects;
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }
    public void raiseSalary(double per){
        double raise = this.salary*per/100;
        this.salary += raise;
    }
    public boolean equals(Object otherObject){
        if(this == otherObject) return true;
        if(otherObject == null) return false;
        if(this.getClass() != otherObject.getClass()) return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(this.name,other.name)
                && this.salary == other.salary
                && Objects.equals(this.hireDay,other.hireDay);
    }
    public String toString(){
        return this.getClass().getName() + "[name=" + this.name
                + ";salary=" + this.salary
                + ";hireDay=" + this.hireDay + "]";
    }
}
