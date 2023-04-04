import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class exponential {
    public static void main(String[] args) {
        int a,b,total=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Base number :");
        a= input.nextInt();
        System.out.print("Enter the Exponential number :");
        b= input.nextInt();

        for (int i=1;i<=b;i++){
            total=total*a;
        }

        System.out.println("Answer:"+total);

    }
}
