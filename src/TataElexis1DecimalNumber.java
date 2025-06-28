public class TataElexis1DecimalNumber {
    public static void main(String[] args) {
        String str = "12476581.3245";
        String[] str2  = str.split("\\.");
        StringBuilder str3 = new StringBuilder();
        StringBuilder str4 = new StringBuilder();
        for(int i = 0; i< str2.length-1;i++){
            char[] ch = str2[i].toCharArray();
            for(int j = 0 ; j< ch.length-1;j++){
                str3.append(ch[j]);
                j++;
            }
        }
        for(int k= 1; k< str2.length;k++){
            char[] ch = str2[k].toCharArray();
            for(int l = 0 ; l< ch.length-1;l++){
                str4.append(ch[l]);
                l++;
            }
        }
        System.out.print(str3+"."+str4);
    }

}