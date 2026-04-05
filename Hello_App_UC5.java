public class Hello_App_UC5 {

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        if (args.length == 0) {
            names.append("World");
        } else {
            boolean first = true;

            for (String name : args) {
                if (!first) {
                    names.append(", ");
                }
                names.append(name);
                first = false;
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}