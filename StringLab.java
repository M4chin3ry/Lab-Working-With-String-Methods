import java.util.Scanner;
public class StringLab{
    public static void main(String[] args) {
        //Task 1
        String message = "  Welcome to the Java String Lab!  ";
        System.out.println("Task 1:");
        System.out.println("Length: " + message.length());
        System.out.println("Character at index 7: " + message.charAt(7));
        System.out.println("Substring: " + message.substring(17 , 21));
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());
        System.out.println("Java Index: " + message.indexOf("Java"));
        System.out.println("Contains Lab? " + message.contains("Lab"));
        System.out.println("Replace: " + message.replace("Java","Java Programming"));
        String[] words = message.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + ": " + words[i]);
        }
        System.out.println("Trim: " + message.trim());
        String  str1 = "java string lab!";
        String str2 = message.trim();
        Boolean isEqual = str1.equals(str2);
        Boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Using isEqual(): " + isEqual);
        System.out.println("Using isEqualIgnoreCase(): " + isEqualIgnoreCase);

        // Task 2
        System.out.println("Task 2:");
        String lowerMessage = message.toLowerCase(); //Count Vowels
        int vowelCount = 0;
        for (int i = 0; i < lowerMessage.length(); i++) {
            char c = lowerMessage.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
    
        String word = "racecar"; //Check For Palindrome
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        Scanner scanner = new Scanner(System.in); //Input Validation
        String userInput;
        do {
            System.out.print("Enter a sentence that contains the word 'Java': ");
            userInput = scanner.nextLine();
        } while (!userInput.contains("Java"));
        System.out.println("Thank you!");

        //Task 3
        System.out.println("Task 3:");
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        sb.reverse();
        System.out.println("StringBuilder result: " + sb);

        //Task 4:
        System.out.println("Task 4:");
        StringBuffer sbf = new StringBuffer("Multithreading Lab");
        sbf.append(" - Learning Java");
        sbf.insert(sbf.indexOf("Lab") + 3, " is fun");
        start = sbf.indexOf("Learning");
        end = start + "Learning".length();
        sbf.delete(start, end);
        sbf.reverse();
        System.out.println("StringBuffer result: " + sbf);
        scanner.close();
    }
}