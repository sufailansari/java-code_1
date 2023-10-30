import java.util.Scanner;

public class Feibo {
   public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number to sec");
    int num =scan.nextInt();
    int s1=0;
    int s2=0;
    int s3=1;
    for(int i=0;i<=num;i++){
        if(i==0||i==1){
            System.out.println(i);
        }
        else{
            s1=s2+s3;
            System.out.println(s1);
            s2=s3;
            s3=s1;

        }
    }
    scan.close();


   }
}
