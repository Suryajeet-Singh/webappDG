public class OddReverse {
    public static void main(String[] args) {
        String str1 = "My name is Suryajeet";
        StringBuilder str2 = new StringBuilder();
//        StringBuilder str3 = new StringBuilder();

        String[] str4 = str1.split(" ");
        for (int i = 0; i < str4.length; i++) {
            if (i % 2 == 0) {
                char[] ch = str4[i].toCharArray();
                for (int j = ch.length - 1; j >= 0; j--) {
                    str2.append(ch[j]);
                }
            } else {
                str2.append(str4[i]);
            }
            str2.append(" ");
        }
        System.out.print(str2);
    }}
