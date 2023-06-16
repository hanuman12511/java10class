class Info1{
    int id;
    String name;
    Info1(int id,String name){
        this.id=id;
        this.name=name;

    }
    void showInfo(){
        System.out.println("Show user Info");
        System.out.println(id+"\n"+name);
    }
}


class Emp_f1 extends Info1{
float salary;
    Emp_f1(int id,String name,float salary){
        super(id,name);
        this.salary=salary;

}
    void showInfo(){
        super.showInfo();
        System.out.println(salary);
    }
}

/* class Emp_f2 extends Info1{

    void showInfo(){
        System.out.println(id+"\n"+name);
    }
} */
public class Inheri {
    public static void main(String...r) {
        Emp_f1 ef1 = new Emp_f1(1,"user",400);
        
       /*  ef1.id=9;
        ef1.name="user"; */
    ef1.showInfo();
      /*   Emp_f2 ef2 = new Emp_f2();
        
        ef2.id=9;
        ef2.name="user";
    ef2.showInfo(); */
    }
}
