package fundamentals;
public class Sample {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one name as a command line argument.");
            return;
        }
        System.out.println("Welcome " + args[0]);
    }
}

