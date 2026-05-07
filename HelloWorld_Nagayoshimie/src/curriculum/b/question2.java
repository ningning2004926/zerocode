package curriculum.b;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Qyestion1
		int score=75;
		if (score >= 60);
		System.out.println("合格です。");
		
		//Question2
		int age=25;
		if(age>= 20 && age <= 30)
		{
		    System.out.println("適正年齢です");
		} else {
		    System.out.println("対象外です");
	}

		//Question3
		int age1=18;
		if(age1>=20) {
		System.out.println("成人です");
		}
		else  if (age1 >= 13 && age1 <= 19) {
		System.out.println("ティーンエイジャーです");
	}
		else{
		System.out.println("子どもです");
		}
		
		//Question4
		int x=30;
		int y=15;
		int z=50;
		int max = x;

		if (y > max) {
		    max = y;
		}
		if (z > max) {
		    max = z;
		}

		
		System.out.println("一番大きい数値は " + max + " です");
		
		//Question5
        Scanner sc = new Scanner(System.in);
        
        // 2. int型の変数 num を用意し、入力を代入
        System.out.print("数字を入力してください: ");
        int num = sc.nextInt();

        // 3. 条件分岐
        if (num > 0) {
            System.out.println("正の数です");
        } else if (num == 0) {
            System.out.println("0 です");
        } else {
        System.out.println("負の数です");
        sc.close();
            
            //Question6
            
            
        int value = sc.nextInt();

            
        if (value % 2 == 0) {
                System.out.println("偶数です");
        } else {
                System.out.println("奇数です");
            }
            
            sc.close();
            
            //Question7
            int score1= sc.nextInt();
            if(score1>=90) {
            	System.out.println("優");
            }
            else if(score1>=70) {
            	System.out.println("良");
            }
            else if (score>= 50) {
            	System.out.println("可");
            }
            else
            {System.out.println("不可");
            }
            //Question8
            String input = sc.nextLine();
            if(input == null || input.equals("")) {
                System.out.println("入力が無効です");
            }
            //Question9
            int day = 3; // 曜日を表す
            switch (day) {
            case 1:
            System.out.println("月曜日");
            break;
            case 2:
            System.out.println("火曜日");
            break;
            case 3:
            System.out.println("水曜日");
            break;
            case 4:
            System.out.println("木曜日");
            break;
            case 5:
            System.out.println("金曜日");
            break;
            case 6:
            System.out.println("土曜日");
            break;
            case 7:
            System.out.println("日曜日");
            break;
            default:
            System.out.println("無効な入力です");
          }
            
            //Question10
            int month=1;
            switch (month) {
            case 1:
            case 2:
            case 12:
            System.out.println("冬");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("春");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("夏");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("秋");
            }
            
            
        }}}
            
            
		

