import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the choice");
        int choice= sc.nextInt();
        switch(choice){
            case 12:
            case 1:
            case 2:{
                System.out.println("Winter");
            }
            case 3:
            case 4:
            case 5:{
                System.out.println("Summer");
                break;
            }
            case 6:
            case 7:
            case 8:{
                System.out.println("Raining");
                break;
            }
            case 9:
            case 10:
            case 11:{
                System.out.println("autumn");
                break;
            }
        }
        sc.close();

    }
}
