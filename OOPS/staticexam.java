package OOPS;

public class staticexam {
    String gamename;
    int totalplayer;
    String Address;
   private static  int totalnoof_game;
    public staticexam(String gname,int tplayer,String add){
        gamename=gname;
        totalplayer=tplayer;
        Address=add;
        totalnoof_game++;//this is for the con
    }
   public int getTotalplayer(){
        return totalplayer;
    }
}
