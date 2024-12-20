import java.util.Scanner;
import java.util.Random;

public class rock_paper_scissors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] rps = {"r" , "p" , "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while(true){
                System.out.println("Enter your Move(r , p or s)");
                playerMove = scanner.nextLine();
                if(playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("p") || playerMove.equalsIgnoreCase("s")){
                    break;
                }
                System.out.println(playerMove + "is not a valid move.");
            }
            System.out.println("computerMove: " + computerMove);

            if(computerMove.equalsIgnoreCase(playerMove)){
                System.out.println("This game is a tie!");
            }
            else if(playerMove.equalsIgnoreCase("r")){
                if(computerMove.equals("p")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equalsIgnoreCase("s")){
                    System.out.println("You Win!");
                }
            }
            else if(playerMove.equalsIgnoreCase("p")){
                if(computerMove.equalsIgnoreCase("s")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equalsIgnoreCase("r")){
                    System.out.println("You Win!");
                }
            }
            else if(playerMove.equalsIgnoreCase("s")){
                if(computerMove.equalsIgnoreCase("r")){
                    System.out.println("You Loose!");
                }
                else if(computerMove.equalsIgnoreCase("p")){
                    System.out.println("You Win!");
                }
            }

            System.out.println("Play Again?(y/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equalsIgnoreCase("y")){
                break;
            }
        }
        scanner.close();
        System.out.println("THANKS FOR PLAYING!");
    }
}