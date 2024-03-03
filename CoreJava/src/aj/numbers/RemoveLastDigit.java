package aj.numbers;

public class RemoveLastDigit {
    public static void main(String[] args) {
        int num = 1098;
        int y = num/10;
        System.out.println(y);
        int x = num%100;
        System.out.println(x);
        int z = num%10;
        System.out.println(z);
    }
}
