import java.util.Scanner;

class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this the program for fibonacci series ");
        System.out.println("enter the number of terms ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int c;
        for(int i=0;i<=n;i++){
            System.out.print( a+",");
            c=a+b;
            a=b;
            b=c;

        }
        }
}