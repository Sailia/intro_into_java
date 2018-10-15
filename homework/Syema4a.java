import java.util.Scanner;

public class Syema4a
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a character: ");
      String word = input.nextLine();
      char character = word.charAt(0);
      
      checker(character);
   }
   
   public static void checker(char variable)
   {
      int[] numbers = {64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127};
      
      System.out.println(new String(list).indexOf("e"));
      
      char[] characters = {'@',
                           'A',
                           'B',
                           'C',
                           'D',
                           'E',
                           'F',
                           'G',
                           'H',
                           'I',
                           'J',
                           'K',
                           'L',
                           'M',
                           'N',
                           'O',
                           'P',
                           'Q',
                           'R',
                           'S',
                           'T',
                           'U',
                           'V',
                           'W',
                           'X',
                           'Y',
                           'Z',
                           '[',
                           '\'',
                           ']',
                           '^',
                           '_',
                           '`',
                           'a',
                           'b',
                           'c',
                           'd',
                           'e',
                           'f',
                           'g',
                           'h',
                           'i',
                           'j',
                           'k',
                           'l',
                           'm',
                           'n',
                           'o',
                           'p',
                           'q',
                           'r',
                           's',
                           't',
                           'u',
                           'v',
                           'w',
                           'x',
                           'y',
                           'z',
                           '{',
                           '|',
                           '}',
                           '~'};
      System.out.println(new String(characters).indexOf(variable));
   }

}