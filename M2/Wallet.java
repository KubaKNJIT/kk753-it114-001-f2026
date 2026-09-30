package M2;

public class Wallet {
    public static void main(String[] args){
        int wallet = 10;

        if (wallet >= 1){
            System.out.println("You get something");
        } else if (wallet >= 15) {
            System.out.println("You receive the best item");
        } else {
            System.out.println("Not sure what happened");
        }
    }
}
