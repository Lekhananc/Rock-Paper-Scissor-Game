import java.util.Random;

public class RockPaperScissor {
    Random random = new Random();
    RockPaperScissorGUI rockPaperScissorGUI;
    public void playMoves(String playerMove){
        String[] moves = {"Rock","Paper","Scissor"};
        String computerMoves = moves[random.nextInt(moves.length)];
        rockPaperScissorGUI.computerChoice.setText(computerMoves);

        String result = "";
        if(playerMove.equalsIgnoreCase(computerMoves)){
            result += "It's a tie!";
        }
        else if(playerMove.equalsIgnoreCase("Rock")&&computerMoves.equalsIgnoreCase("Scissor")||
                playerMove.equalsIgnoreCase("Paper")&&computerMoves.equalsIgnoreCase("Rock")||
                playerMove.equalsIgnoreCase("Scissor")&&computerMoves.equalsIgnoreCase("Paper")){
            result += "you win!";
        }
        else{
            result += "You loose!";
        }
        rockPaperScissorGUI.showMessage(result);
    }
}
