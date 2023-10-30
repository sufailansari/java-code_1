import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the phy marks:");
        float phy=scan.nextFloat();
        System.out.println("enter the bio marks:"); 
        float bio=scan.nextFloat();       
        System.out.println("enter the chem marks:");
        float chem=scan.nextFloat();
        System.out.println("enter the math marks:");
        float math=scan.nextFloat();
        System.out.println("enter the eng marks:");
        float eng=scan.nextFloat();
        float total_marks=500;
        float obt=phy+chem+bio+math+eng;
        float aveg_marks=(obt)/5;
        System.out.println("total amrks is :" +obt);
        System.out.println("average marks of student is:" +aveg_marks);
        float per=(total_marks/obt)*100;
        System.out.println("percentage of student of is:" +per);
        scan.close();


    }
}
