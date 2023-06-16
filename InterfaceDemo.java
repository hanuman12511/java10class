/* abstract class DemoInfo{
    int id;
    String name;
    DemoInfo(int id,String name){
        this.id=id;
        this.name =name;

    }

    void getData(){
                System.out.println(id);
                System.out.println(name);
    }

    abstract void  showInfo();
}
 */
 interface DemoInfo{
    void showInfo();
    static void showInfo1(){

    }
    default void showInfo2(){
        
    }
 }
class Emp1 implements DemoInfo{

public     void showInfo(){
        System.out.println("shown info");
    }

    void display(){
        System.out.println("Emp11 class");
    }
}

class InterfaceDemo{
    public static void main(String []r) {

Emp1 e =new Emp1();
e.showInfo();
e.display();
DemoInfo din =new Emp1();
        din.showInfo();
    
        din.showInfo2();
      
    }
}