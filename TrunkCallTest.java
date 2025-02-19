package exp5;
import java.util.Scanner;

// Abstract base class
abstract class TrunkCall {
    protected int duration;

    public TrunkCall(int duration) {
        this.duration = duration;
    }

    // Abstract method to compute charges
    public abstract double computeCharge();
}

// Ordinary trunk call
class OrdinaryCall extends TrunkCall {
    private static final double RATE = 1.5;

    public OrdinaryCall(int duration) {
        super(duration);
    }

    @Override
    public double computeCharge() {
        return duration * RATE;
    }
}

// Urgent trunk call
class UrgentCall extends TrunkCall {
    private static final double RATE = 2.5;

    public UrgentCall(int duration) {
        super(duration);
    }

    @Override
    public double computeCharge() {
        return duration * RATE;
    }
}

// Lightning trunk call
class LightningCall extends TrunkCall {
    private static final double RATE = 5.0;

    public LightningCall(int duration) {
        super(duration);
    }

    @Override
    public double computeCharge() {
        return duration * RATE;
    }
}

// Main class to test the implementation
public class TrunkCallTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter duration (in minutes): ");
        int duration = scanner.nextInt();
        
        System.out.println("Select call type: 1. Ordinary  2. Urgent  3. Lightning");
        int choice = scanner.nextInt();
        
        TrunkCall call;
        
        switch (choice) {
            case 1:
                call = new OrdinaryCall(duration);
                break;
            case 2:
                call = new UrgentCall(duration);
                break;
            case 3:
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }
        
        System.out.println("Total charge: $" + call.computeCharge());
        scanner.close();
    }
}
