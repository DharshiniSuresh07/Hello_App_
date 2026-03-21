public class Hello_app_UC4{
    public static void main(String[] args) {

        String result = "";

        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                result += args[i];

                if (i < args.length - 1) {
                    result += ", ";
                }
            }
        } else {
            result = "World";
        }

        System.out.println("Hello, " + result + "!");
    }
}