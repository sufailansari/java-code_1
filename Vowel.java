import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your alphabate is");
        String alph=sc.nextLine();
        if(alph=="a"||alph=="e"||alph=="i"||alph=="o"||alph=="u"||alph=="A"||alph=="E"||alph=="I"||alph=="O"||alph=="U"){
            System.out.println("this alphabate is vowel");
        }
        else{
            System.out.println("this alphabate is consonate");
        }
        sc.close();
    }
}
