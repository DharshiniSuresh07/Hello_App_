public class Hello_App_UC6 {

    public static void main(String[] args) {

        StringBuilder nameBuilder = new StringBuilder();

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            String result = nameBuilder.substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}