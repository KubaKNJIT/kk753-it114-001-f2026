package M2;

public class LoopBounds {
    public static void main(String[] args){
        for(int round = 0; round < 3; round++){
            System.out.println("Early: " + (round +1 ));
        }
        for(int round = 1; round <= 3; round++){
            System.out.println("Complete: " + round);
        }
    }
}
