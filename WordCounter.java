import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get sentence input
        String sentence = getSentenceInput(scanner);

        // Count words
        int wordCount = countWords(sentence);

        // Display the word count
        System.out.println("Word count: " + wordCount);

        scanner.close();
    }

    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        return sentence.trim().split("\\s+").length;
    }
}
