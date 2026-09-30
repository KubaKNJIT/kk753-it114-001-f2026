package M2;

public class InfiniteLoop {
    public static void main(String[] args){
        int count = 1;
        while (count <=3) {
            //System.out.println(count);
            count --;
        }
        System.out.println(count);
        //not actually infinite
        //when you subtract from the minimum value of a data type
        //you go back to the largest number
        //making the WHILE statement incorrect

        //ctrl c : stops a program from running in the terminal
    }
}
