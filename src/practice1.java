import java.util.Scanner;

public class practice1 {

    public static void  main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.print("数字を入力してください。");
                int number = sc.nextInt();

                String result = checkEven(number);

                System.out.println(result);

        }

        public static String checkEven(int num){
            if (num % 2 == 0) {
             return "偶数です";
            } else {
             return "奇数です";
            }
    }
}

