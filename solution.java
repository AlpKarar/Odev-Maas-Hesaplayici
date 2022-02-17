public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public double tax() {
        if (1000 <= this.salary) {
            return this.salary * 0.003;
        } else {
            return 0;
        }
    }
    
    public int bonus() {
        if (40 < workHours) {
            return this.workHours * 30
        } else {
            return 0;
        }
    }
    
    public double raiseSalary() {
        int totalYear = this.hire - 2021;
        if (totalYear < 10) {
            return this.salary * 0.05;
        } else if (9 < totalYear && totalYear < 20) {
            return this.salary * 0.10;
        } else if (19 < totalYear) {
            return this.salary * 0.15;
        }
    }
    
    public void toString() {
        double tax = this.tax();
        int bonus = this.bonus();
        double increment = this.raiseSalary();
        
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hours: " + this.workHours);
        System.out.println("Hired Year: " + this.hireYear);
        System.out.println("Tax: " + tax);
        System.out.println("Bonus: " + bonus);
        System.out.println("Increment in salary: " + increment);
        double salTaxBon = this.salary - tax + bonus;
        System.out.println("Salary including tax and bonus: " + salTaxBon);
        double totalSalary = salTaxBon + increment;
        System.out.println("Total Salary: " + totalSalary);
        
    }
}
