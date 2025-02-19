package exp5;
// Abstract base class
abstract class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Abstract method to compute pay
    public abstract double computePay(int hours);
}

// DailyWorker class
class DailyWorker extends Worker {
    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day
        return daysWorked * salaryRate;
    }
}

// SalariedWorker class
class SalariedWorker extends Worker {
    public SalariedWorker(String name, double weeklyRate) {
        super(name, weeklyRate);
    }

    @Override
    public double computePay(int hours) {
        return salaryRate; // Fixed weekly salary regardless of hours worked
    }
}

// Main class to test the implementation
public class WorkerTest {
    public static void main(String[] args) {
        Worker dailyWorker = new DailyWorker("John Doe", 100); // Daily rate: $100
        Worker salariedWorker = new SalariedWorker("Jane Smith", 800); // Weekly salary: $800

        System.out.println(dailyWorker.name + " earned: $" + dailyWorker.computePay(40)); // Assuming 40 hours worked
        System.out.println(salariedWorker.name + " earned: $" + salariedWorker.computePay(40));
    }
}
