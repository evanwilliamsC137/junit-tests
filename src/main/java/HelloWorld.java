public class HelloWorld {
    public static String hello() {
        return "Hello World!";
    }

    public static String hello(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name can't have a name...");
        }
        return "Hello, " + name + "!";
    }
}
