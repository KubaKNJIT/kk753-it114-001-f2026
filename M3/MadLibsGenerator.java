package M3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Challenge 3: Mad Libs Generator (Randomized Stories)
-----------------------------------------------------
- Load a **random** story from the "stories" folder
- Extract **each line** into a collection (i.e., ArrayList)
- Prompts user for each placeholder (i.e., <adjective>) 
    - Any word the user types is acceptable, no need to verify if it matches the placeholder type
    - Any placeholder with underscores should display with spaces instead
- Replace placeholders with user input (assign back to original slot in collection)
*/

//planning
//im going to read in story1.txt, naturally its the first one I see
//i have a separate .txt file in the M3 folder, I'm unsure if that's how this works but I'll try it
//from that point I'll have to use the scanner class to read through the txt file
//since im iterating there'll definitely be a for loop
//Ill have to identify the location of the placeholder
//receive user input, take that input, and wherever the placeholder is I'll have to potentially reiterate
//this all depends whether I'm able to figure out how to iterate and adjust at the same time
//this plan is absolutely subject to change as I work through the code

public class MadLibsGenerator extends BaseClass {
    private static final String STORIES_FOLDER = "M3/stories";
    private static String ucid = "kk753"; // <-- change to your ucid

    public static void main(String[] args) {
        printHeader(ucid, 3,
                "Objective: Implement a Mad Libs generator that replaces placeholders dynamically.");

        Scanner scanner = new Scanner(System.in);
        File folder = new File(STORIES_FOLDER);

        if (!folder.exists() || !folder.isDirectory() || folder.listFiles().length == 0) {
            System.out.println("Error: No stories found in the 'stories' folder.");
            printFooter(ucid, 3);
            scanner.close();
            return;
        }
        List<String> lines = new ArrayList<>();
        // Start edits

        // load a random story file
        File selectedStory = new File(folder, story1.txt); //this should be the file I have in the m3 folder

        // parse the story lines
        try {
            Scanner fileScanner = new Scanner(selectedStory);

            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println("Error reading story file.");
            printFooter(ucid, 3);
            scanner.close();
            return;
        }
        // iterate through the lines
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
        
        // prompt the user for each placeholder (note: there may be more than one
        // placeholder in a line)
        while (line.contains("<") && line.contains(">")) {
            int start = line.indexOf("<");
            int end = line.indexOf(">", start);

            if (end == -1) {
                break;
            }

            String placeholder = line.substring(start + 1, end);
            String prompt = placeholder.replace("_", " ");

            System.out.print("Enter " + prompt + ": ");
            String answer = scanner.nextLine();

            line = line.substring(0, start) + answer + line.substring(end + 1);
        }

        // apply the update to the same collection slot
        lines.set(i, line);
        }

        // End edits
        System.out.println("\nYour Completed Mad Libs Story:\n");
        StringBuilder finalStory = new StringBuilder();
        for (String line : lines) {
            finalStory.append(line).append("\n");
        }
        System.out.println(finalStory.toString());

        printFooter(ucid, 3);
        scanner.close();
    }
}