C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet
from a-z)

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(c);
            }
        }
        
        return set.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         String sentence = scanner.nextLine().toLowerCase();
        boolean isPangram = checkIfPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
        
        scanner.close();
    }
    
   }
