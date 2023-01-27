package practicePackage.OOPsFundamentals.inheritanceConcepts.inheritanceProductionLevelExample;

public abstract class Employee {
    private int empId;
    private String name;
    private int salary;
    
    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public abstract double getBonus();   
}
class Engineer extends Employee{

    private int performancePoints;

    public Engineer(int empId, String name, int salary,int performancePoints) {
        super(empId, name, salary);
        this.performancePoints=performancePoints;
    }
    @Override
    public double getBonus() {
        return getSalary()*performancePoints;
    }

}
class Manager extends Employee{
    private int bonusPercent;

    public Manager(int empId, String name, int salary,int bonusPercent) {
        super(empId, name, salary);
        this.bonusPercent=bonusPercent;
    }

    @Override
    public double getBonus() {
        
        return getSalary()*bonusPercent;
    }

}
