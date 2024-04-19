import java.util.Scanner;
class jamsu{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
        int age = a.nextInt();
        a.nextLine();
        String department = a.nextLine();
        System.out.println("my name is"+ name);
        System.out.println("my age is"+ age/10 );
        System.out.println("my department is "+ department);
    }
}