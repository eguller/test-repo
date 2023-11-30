public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static String method1() {
        return "method1";
    }

    public static String method1_1() {
        var methodName = "method1_1";
        return methodName;
    }

    public static String method2() {
        var methodName = "method2";
        var result = methodName + " - result";
        System.out.println(result);
        return methodName;
    }

    public static String method3() {
        return "method3";
    }
}