package OOPS;

public class Interfaces {
    public static void main(String[] args) {
Queen q1=new Queen();
q1.moves();
    }
}
interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
     public void moves(){
        System.out.println("up ,down,left,right,diagonal(in 4 direction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}