package game;


    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


import java.util.*;
    public class rock_paper_seissor {
        public static void main(String[] args) {
            Random ran=new Random();
            Scanner sc=new Scanner(System.in);
            int turn=1;
            while( turn == 1){
                int user=0;
                int computer=0;
                int i=0;
                while(i<5){
                    int com=ran.nextInt(3);
                    System.out.println("'0' for rock, '1' for paper, '2' for scissor");
                    System.out.print("Enter your Choose: ");
                    int choose=sc.nextInt();
                    System.out.println("computer choose: "+com);
                    switch (choose){
                        case 0:
                            if(com==0)
                                System.out.println("Draw! user ="+user+", computer = "+computer);
                            if (com==2){
                                user++;
                                System.out.println("User Win! user ="+user+", computer = "+computer);
                            }
                            if (com==1){
                                computer++;
                                System.out.println("computer win! user ="+user+", computer = "+computer);
                            }
                            break;
                        case 1:
                            if(com==1)
                                System.out.println("Draw! user ="+user+", computer = "+computer);
                            if (com==0){
                                user++;
                                System.out.println("User Win! user ="+user+", computer = "+computer);
                            }
                            if (com==2){
                                computer++;
                                System.out.println("computer win! user ="+user+", computer = "+computer);
                            }
                            break;
                        case 2:
                            if(com==2)
                                System.out.println("Draw! user ="+user+", computer = "+computer);
                            if (com==1){
                                user++;
                                System.out.println("User Win! user ="+user+", computer = "+computer);
                            }
                            if (com==0){
                                computer++;
                                System.out.println("computer win! user ="+user+", computer = "+computer);
                            }
                            break;
                        default:
                            System.out.println("invalid choose");
                    }
                    i++;
                }
                if (user>computer)
                    System.out.println("User wins");
                else if (computer>user)
                    System.out.println("computer win");
                else
                    System.out.println("match draw");
                System.out.print("Enter '1' to try again: ");
                turn=sc.nextInt();
            }
            System.out.println("Thanks! for trying our game");
        }
    }

