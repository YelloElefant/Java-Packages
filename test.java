import java.lang.Thread;

public class test {
    private static int lineCount = 0;

    public static void main(String[] args) {
        try {
            System.out.println("Hello");
            out("Hello");
            out("Hello");
            out("Hello");
            out("Hello");
            out("Hello");
            out("Hello");
            Thread.sleep(1000);
            clear();
            // System.out.print("nigger");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void out(String message) {
        System.out.println(message);
        lineCount++;
        System.out.flush();
    }

    private static void moveToTop() {
        System.out.print(String.format("\033[%dA", lineCount));
    }

    private static void clear() {
        for (int i = 0; i < lineCount; i++) {
            System.out.print(String.format("\033[%dA", 1));
            System.out.print("\033[2K"); // Erase line content
        }
        lineCount = 0;
    }
}
