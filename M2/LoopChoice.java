package M2;

public class LoopChoice {
    public static void main(String[] args){
        String[] players = {"Ada", "Observer", "Lin"};

        //INdexed for loop: count three rounds
        for(int round = 1; round <= 3; round++){
            //Enhanced for loop; visit every player
            for(String player : players){
                if(player.equals("Observer")){
                    //SKIPS, breaks out of the loop and doesn't continue
                    //the lines beneath this in the FOR loop
                    // when the IF condition is met
                    break;
                }
                System.out.println("Round " + round + ": " + player);
            }
        }
    }
}
