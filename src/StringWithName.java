public class StringWithName {
        public static void main(String[] args) {
            String str = "name2 Surya4 is3 My1";
            String[] words = str.split(" ");
            String[] arr = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                for (char ch : word.toCharArray()) {
                    if (Character.isDigit(ch)) {
                        int index = Character.getNumericValue(ch) - 1;
                        arr[index] = word.replaceAll("[0-9]", "");
                    }
                }
            }

            for (String s : arr) {
                System.out.print(s + " ");
            }
        }

}
