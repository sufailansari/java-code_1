import java.util.Scanner;

public class Count_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number is: ");
        int num=sc.nextInt();
        int count=0;
        while (num!=0){
            num=num/10;
            count+=1;

        }
        System.out.println("no of digite is given no is:"+count);
        sc.close();

    }
}
