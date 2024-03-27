package JAVA_FUNDAMENTAL.OOPS;

public class Constructure {
    private int id;
    private String name;
    public Constructure(int idd,String namee){
       id=idd;
       name=namee;
    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setId(int id){
//        this.id=id;
//    }
//    public int getId(){
//        return id;
//    }


   public static void main(String[] args) {
        Constructure c1=new Constructure(21,"anjan");
       System.out.println(c1.name);
       System.out.println(c1.id);
//        c1.setId(34);
//        c1.setName("anjan");
//        System.out.println(c1.getId());
//        System.out.println(c1.getName());
    }
}
