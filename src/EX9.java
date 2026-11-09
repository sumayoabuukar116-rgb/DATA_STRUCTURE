


public class EX9 {

    public static void main(String[] args) {

        try {

            throw new EmptyCollectionExceptionS("stack");

        } catch (EmptyCollectionExceptionS e) {

            System.out.println("Caught: " + e.getMessage());
        }
    }
}
