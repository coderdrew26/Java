public class ExampleString {
    public static void main(String[] args) {
        String message = "Hello World" + "!";

        System.out.println(message.endsWith("!"));
        System.out.println(message.startsWith("e"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.replace("!", ", Good Luck!"));
    }
}