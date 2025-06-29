public class SortingInAlphabeticalOrder {
    public static void main(String[] args) {
        String str = "Suryajeet Singh";
        char[] ch = str.toCharArray();
        char temp;
        for(int i=0;i<ch.length-2;i++){
            for(int j=0;j<ch.length-1-i;j++) {
                if (ch[j] > ch[j + 1]) {
                    temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        System.out.println("Alphabetically Second_Largest_Tata_Elexis : ");
        for(char words : ch){
            System.out.print(words);
        }

    }
}
