public class ReverseEachWord {
    public static void main(String args[]) {
        System.out.println(reverseword("hello java"));

    }

    public static String reverseword(String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder(); // StringBuilder is a mutable sequence of characters. It lets you
                                                    // efficiently build a string step by step without creating lots of
                                                    // temporary string objects.
                                                    // So here, result is a StringBuilder that will hold the final
                                                    // sentence after reversing each word.

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();

            int left = 0;
            int right = ch.length - 1;

            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }

            result.append(new String(ch)); // After reversing, ch is still a char array.new String(ch) converts it back
                                           // into a proper String
            if (i < words.length - 1)
                result.append(" ");

        }
        return result.toString();// StringBuilder is mutable, but we need to return a String..toString() converts
                                 // the built sequence into a proper String object

    }

}
