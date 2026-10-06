package M2;
// copilot: disable

// @ts-nocheck

public class Scenario3 extends BaseClass {
    private static Integer[] array1 = { 42, -17, 89, -256, 1024, -4096, 50000, -123456 };
    private static Double[] array2 = { 3.14159265358979, -2.718281828459, 1.61803398875, -0.5772156649, 0.0000001,
            -1000000.0 };
    private static Float[] array3 = { 1.1f, -2.2f, 3.3f, -4.4f, 5.5f, -6.6f, 7.7f, -8.8f };
    private static String[] array4 = { "123", "-456", "789.01", "-234.56", "0.00001", "-99999999" };
    private static Object[] array5 = { -1, 1, 2.0f, -2.0d, "3", "-3.0" };

    private static void bePositive(Object[] arr, int arrayNumber) {
        // Only make edits between the designated "Start" and "End" comments
        printScenario3ArrayInfo(arr, arrayNumber);
        // This should be solved without Copilot auto-completion, to toggle it, click
        // the Copilot chat bubble at the top of the editor.
        // Configure inline suggestions to "Disabled Inline Suggestions" (or similar)
        // when writing code for this problem.

        // Challenge 1: Make each value positive
        // Challenge 2: Convert the values back to their original data type and assign
        // it to the proper slot in the `output` array
        // Step 1: sketch out plan using comments (include ucid and date)
        // Step 2: Add/commit your outline of comments (required for full credit)
        // Step 3: Add code to solve the problem (add/commit as needed)

        //Planning (kk753, October 5th, 2026)
        //Once again a for loop
        //If input is less than 0 then multiply by -1, regardless add to a new array
        //I might have to use double() to try and convert the types to all be the same
        //To revert the types back Ill have to experiment with swapping and manipulating the types
        //I could compare the original array to the new array, making a for loop in a for loop kinda deal
        //That may require me to make a third array if I'm thinking about it correctly
        //in total bunch of looping, converting, then more looping, with comparing in order to convert
        //I think.

        //Updated Plan / Note taking
        //From python I know int(thing) converts stuff, so I went ahead and found the java equivalent
        //Also learned that Math has an abs function, which gives the absolute value of the object
        //Finding a whole bunch of new String methods and such, cannot implement them for my life
        //So to implement the startsWith and substring, I had to completely affirm that what is being passed in is a String
        //to do that I had make a new String that will act as the check as opposed to the value at the index
        //but then I can just use arr[i] if the "item" is correct since it's technically the same thing just different data types
        
        Object[] output = new Object[arr.length];
        // Start Solution Edits
        for(int i = 0; i < arr.length; i++){
            //arr[i] = (int) arr[i] * -1; //valiant effort for part 1; nope it failed terribly
            if (arr[i] instanceof Integer) { //more familiar with this than switch/case
                output[i] = Math.abs((Integer)arr[i]);
            } else if (arr[i] instanceof Double) {
                output[i] = Math.abs((Double)arr[i]);
            } else if (arr[i] instanceof Float) {
                output[i] = Math.abs((Float)arr[i]);
            } else if (arr[i] instanceof String) {
                String item = (String) arr[i]; //type-cast on a whole new level, for me
                if(item.startsWith("-")){
                    output[i] = item.substring(1);
                }else{
                    output[i] = arr[i];
                }
            }
        }
        // End Solution Edits
        printOutputWithType(output, true);
    }

    public static void main(String[] args) {
        final String ucid = "kk753"; // <-- change to your UCID
        // no edits below this line
        printHeader(ucid, 3);
        bePositive(array1, 1);
        bePositive(array2, 2);
        bePositive(array3, 3);
        bePositive(array4, 4);
        bePositive(array5, 5);
        printFooter(ucid, 3);

    }
}