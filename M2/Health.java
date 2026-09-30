package M2;

public class Health {
    public static void main(String[] args){
        int health = 70;
        if (health < 50){
            System.out.println("String Heal");
        } else if(health < 100){
            System.out.println("Heal");
        } else {
            System.out.println("Already Full");
        }
    }
}
