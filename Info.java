  
  interface DataInfo{
    void showdata();
    static void showdata1(){
System.out.println("show data1");
    }
    default void showdata2(){
System.out.println("show data2");
    }
  }
  abstract class Info implements DataInfo {
    private int id;
Info(int id ){
    this.id=id;
}
void show(){
    System.out.println("info class==="+id);
}

abstract void display();

}
class emp extends Info{
/* public void showdata(){
    System.out.println("show show interface");
} */
  
    private String name;
    emp(int id,String name){
        super(id);
        this.name=name;
    }
    
    
    void display(){
        System.out.println("display");
    }
    void data(){
        System.out.println("data");
    }
void show(){
    super.show();
    System.out.println("emp class==="+name);
}
}


