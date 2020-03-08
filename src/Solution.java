import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s="";
        int a=0;
        while(sc.hasNextLine()){
            s=sc.nextLine();
            a=0;
            int sw=0;
            for(int i=2;i<s.length();i++){
                if(s.charAt(i)<='F'&&s.charAt(i)>='A'){
                    sw=(int)s.charAt(i)-55;
                }else{
                    if(s.charAt(i)<='9'&&s.charAt(i)>='0')
                        sw=Integer.parseInt(String.valueOf(s.charAt(i)));
                }
                int b=(int)Math.pow(16,s.length()-i-1);
                a=a+sw*(b);
            }
            System.out.println(a);
        }
    }
}
