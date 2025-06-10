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
    }
}