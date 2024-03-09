package OOPS;

public class Car {
    String name;
   private int price=500000;
    private String colour="White";

    public int getPrice()
    {//getter
        return price;
    }
    public String getcolour(){//geter
        //System.out.println(getcolour());
        return colour;
    }
    public void setColour(String colur){//SETTER
       colour=colur;
       // System.out.println(colour);
    }
}
