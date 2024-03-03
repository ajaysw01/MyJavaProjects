package OOPS;

class Person{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // here we have binded the bean properties with the methods ie.e we can't access the variable dierctly but only thorugh the methods 
    // this is data bindign and encapsulation
    


}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(10);
        p.setName("ajay");

        System.out.println(p.getName()+" : "+p.getAge());
        
    }
    
}
