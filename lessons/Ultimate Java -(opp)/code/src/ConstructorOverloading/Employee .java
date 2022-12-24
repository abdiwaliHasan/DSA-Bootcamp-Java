package ConstructorOverloading;

public class Employee {
    private int baseSalary;
    private int hourlyRate;


    // Static members
    public static int numberOfEmployees;

    // Constructor Overloading
    public Employee(int baseSalary){
        this(baseSalary,0);
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        // increase by number of employee
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage (int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    public int calculateWage () {
        return calculateWage(0);
    }
    // Setters
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    // Getters
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}
