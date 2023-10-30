import java.util.Scanner;

public class Even_Odds {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    for(int i=0;i<num;i++){
        if(i%2==0){
            System.out.println("even number is :"+i);
        }
        else{
            System.out.println("odd number is :"+i);
        }
    }
    sc.close();
}
}
