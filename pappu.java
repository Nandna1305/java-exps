import java.util.Scanner;
class pappu {
    public static void main(String args[]) {
        Scanner kuttu = new Scanner(System.in);
        String name = kuttu.nextLine();
        int age = kuttu.nextInt();
        String address = kuttu.nextLine();
        System.out.println("my name is"+ name);
        System.out.println("my age is"+ age);
        System.out.println("address is"+ address);

    }
}
