public class camparator_interface {
    public static void main(String[] args) {
        java.util.List<Integer> list = java.util.Arrays.asList(5, 3, 8, 1, 4);
        java.util.Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(list);
    }
}


