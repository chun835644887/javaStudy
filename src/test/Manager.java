package test;
import java.time.*;
import java.util.Objects;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        this.bonus = 0;
    }
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + this.bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + this.bonus + "]";
    }
    public int hashCode(){
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }
}
