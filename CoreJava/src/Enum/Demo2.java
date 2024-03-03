package Enum;

enum Status{
    Running, Failed, Pending, Success;
}
public class Demo2 {
    public static void main(String[] args) {
        Status[] s = Status.values();

        for(Status str : s){
            System.out.println(s + " : " + s.ordinal());
        }
    }
}
