package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        //countWords("I love Test Automation University");
        System.out.println("*****");
        //reverseString("Hello TAU!");
        System.out.println("----");
        addSpace("HeyWorld!It'sMeAngie");
    }
    /**
     * Splits a String into an array by tokenizing it.
     * Count words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("your text contains %d words:" , numberOfWords);
        for (int i=0; i<numberOfWords;i++){
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text){
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpace(String text){
        var modifiedText = new StringBuilder(text);
        for (int i=0; i<modifiedText.length(); i++){
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
