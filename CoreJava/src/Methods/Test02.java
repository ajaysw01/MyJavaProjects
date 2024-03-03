package Methods;
//concrete method
class Bus{
    void breaks(){
        System.out.println("Bus has normal breaks");
    }
}
class Redbus extends Bus{

}
class Volvo extends Bus{
    void breaks(){ // method overriding
        System.out.println("Vovlo has powerful breaks");

    }
}
public class Test02 {
    public static void main(String[] args) {
        Redbus r1 =new Redbus();
        r1.breaks();

        Volvo v1 =new Volvo();
        r1.breaks();
    }
    
}
