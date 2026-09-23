package M2;

public class Overflow {
    public static void main(String[] args) {
        int largest = Integer.MAX_VALUE;

        System.out.println(largest);
        System.out.println(largest + 1);
        
        //Inverse Below

        int smallest = Integer.MIN_VALUE;
        System.out.println(smallest);
        System.out.println(smallest - 1);
        
        
    }
}
