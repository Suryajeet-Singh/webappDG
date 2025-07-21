public class EvenReverse {
    public static void main(String[] args) {
        String str="my name is gautam";
        String words[]=str.split(" ");

        StringBuilder result=new StringBuilder();


        for(int i=0; i<words.length; i++)
        {
            if(i==0 || i==2)
            {
                String reverse="";
                for(int j=words[i].length()-1; j>=0; j--)
                {
                    reverse=reverse+words[i].charAt(j);
                }
                result.append(reverse);
            }
            else {
                result.append(words[i]);
            }
            result.append(" ");
        }
        System.out.println("Reverse of even elemnets is: "+result);

    }
}
