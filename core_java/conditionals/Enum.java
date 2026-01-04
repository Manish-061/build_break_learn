package conditionals;

enum Status{
    Running, Pending, Failed, Success;  // Collection of constants.
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.Running;

        System.out.println(s.ordinal()); // ordinal(): a static method that will print index

        // values() can be used to return all enum constants as an Array
        Status[] conStatus = Status.values();

        for (Status status : conStatus) {
            System.out.print(status);
        }

        Status running = Status.valueOf("Running");
        System.out.println(running);
    }
}
