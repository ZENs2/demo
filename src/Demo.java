import java.util.Scanner;

public class Demo {
    public  static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("名前を入力");
       String name = sc.nextLine();

       System.out.print("年齢を入力");
       int age = sc.nextInt();

       if (age >= 20){
           System.out.println(name + "さんは成人です");
       } else {
           System.out.println(name + "さんは未成年です");
       }

       sc.close();
    }
}
