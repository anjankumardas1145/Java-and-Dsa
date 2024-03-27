package OOPS_By_KG;
class computer {
    public void playMusic() {
        System.out.println("play music");
    }

    public String getMypen(int num) {
        if (num >= 10) {
            // System.out.println("you can buy this pen");
            return "you can buy";
        }
        return "pen";
    }
}
public class ex_2 {
    public static void main(String[] args) {
      computer cp=new computer();
      cp.playMusic();
     String str= cp.getMypen(56);
        System.out.println(str);
    }
}
