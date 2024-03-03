package aj.questions;

public class Table {

    public static void main(String[] args) {
        int table = 5;
        int result = 0;

        for (int i = 1; i <= 10; i++) {
            result = 0;
            for (int j = 1; j <= i; j++) {
                result += table;
            }
            
            System.out.println(result);
        }
    }
}
