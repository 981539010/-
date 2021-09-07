import java.util.Scanner;

public class SwitchDemo {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个星期数（1-7)");
            int week = sc.nextInt();
            switch(week){
                case 1:
                    System.out.println("星期一");
                    break;
                case 2:
                    System.out.println("星期一");
                    break;
                case 3:
                    System.out.println("星期一");
                    break;
                case 4:
                    System.out.println("星期一");
                    break;
                case 5:
                    System.out.println("星期一");
                    break;
                case 6:
                    System.out.println("星期一");
                    break;
                case 7:
                    System.out.println("星期一");
                    break;
                default:
                    System.out.println("您输入的星期数有误" );
                    break;
            }

        }

    }


