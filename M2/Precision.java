package M2;

public class Precision{
    public static void main(String[] args){
        //floats and doubles being stupid
        float total = 0.1f + 0.2f;
        System.out.println(total);
        System.out.println(total == 0.3f);

        double otherTotal = 0.2 + 0.2;
        System.out.println(otherTotal);
        System.out.println(otherTotal == 0.4);

        float a = 1;
        float b = 0;
        for(int i = 0; i < 10; i++){
            b += 0.1f;
        }
        System.out.println(b);
        System.out.println(a == b);

        double c = 1;
        double d = 0;
        for(int i = 0; i < 10; i++){
            d += 0.1;
        }
        System.out.println(d);
        System.out.println(c == d);

    }
}