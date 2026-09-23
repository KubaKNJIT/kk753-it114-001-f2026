package M2;

public class Stringit {
    public static void main(String[] args){
        String action = new String("heal");

        System.out.println(action == "heal");
        System.out.println(action.equals("heal"));
    }

    /**
     * Adds a and b
     * @param a first number
     * @param b second number
     * @return sum of a and b
     * @author myself
     */
    
    public static int add(int a, int b){
        return a + b;
    }
}
