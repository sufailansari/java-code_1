import java.util.Scanner;

public class Area_Para {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int l=sc.nextInt();
        System.out.println("enter the height");
        int h=sc.nextInt();
        int res=areaR(l,h);
        int pres=paraA(l,h);
        System.out.println("area of rectangle is:"+res);
        System.out.println("parameter of rectangle is:"+pres);
        sc.close();
    }
    static int areaR(int len,int hei){
        int A;
        A=(len*hei);
        return A;
    }
    static int paraA(int len,int hei){
        int B=2*(len+hei);
        return B;
    }
}
