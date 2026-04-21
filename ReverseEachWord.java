public class ReverseEachWord {
    public static void main(String args[]) {
        System.out.println(reverseword("hello java"));

    }

    public static String reverseword(String sentence) {
        String words[] = sentence.split(" ");
        StringBuilder result = new StringBuilder();

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

            result.append(new String(ch));
            if (i < words.length - 1)
                result.append(" ");

        }
        return result.toString();

    }

}
