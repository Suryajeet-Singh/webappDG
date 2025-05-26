public class SpecialCharacter {
    public static void main(String[] args) {
        String name = "Surya@@##$6Singh@^#&*#*#3392Jeet";
        StringBuilder str = new StringBuilder();
        for (char ch : name.toCharArray()){
            if (Character.isDigit(ch)){
                str.append(ch);
            }
        }
        System.out.println(str);
    }
}
