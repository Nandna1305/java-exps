import java.util.Scanner;
class kuttu {
    public static void main(String args[]) {
        Scanner pappu = new Scanner(System.in);
        int a = pappu.nextInt();
        int b = pappu.nextInt();
        int c = pappu.nextInt();
        int d = a*b*c;
        int e = a+b+c+d;
        System.out.println(d/e);
        
    }
}