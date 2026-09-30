package M2;

public class Decision{
    public static void main(String[] args){
        String action = "something";
        switch(action){
            case "attack":
                System.out.println("Attack");
                break;
            default:
                System.out.println("Unknown action");
        }
    }
}