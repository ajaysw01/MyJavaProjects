
class Test01{
    public static void main(String args[]){
        // problem 1 : program can store only one value
        int x = 10;
        x=20;
        System.out.println("x:"+x);
        // Solution : Create multiple variables 
        int y = 12;
        int z = 13;

        //problem 2 : program becoemes static in nature
        int i1=11;
        int i2 = 12;
        int i3=13;
        int i4 =14;
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        //solution : create a method

        //m1();
        m1(2);
        //m1(5,6);

    }
    static void m1(int p){
        System.out.println(p);
    }
}