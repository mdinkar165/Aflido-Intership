import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence or text: ");
        String input = scanner.nextLine();
        
        int wordCount = countWords(input);
        
        System.out.println("Number of words: " + wordCount);
        
        scanner.close();
    }
    
    public static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}
