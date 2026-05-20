package curriculum.b;

public class Question5 {
    
	public static void main(String[] args) {
		//Question1
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("Hello, World!");
		//Question2
		int input = 10;
		int result = doubleValue(input);
		System.out.println(input+"を2倍すると"+result+"です。");
	
		//Question3
				int num1 = 7;
		        int num2 = 10;
		        if (isEven(num2)) {
		            System.out.println(num2 + " は偶数です。");
		        } else {
		            System.out.println(num2 + " は奇数です。");
		        }
		        if (isEven(num1)) {
		            System.out.println(num1 + " は偶数です。");
		        } else {
		            System.out.println(num1 + " は奇数です。");
		        }
		     // Question4
		        Greeting greeting = new Greeting();
		        greeting.sayHello();
		        //Queston5
		        Animal lion = new Animal();
		        
		        
		        lion.setName("ライオン");
		        lion.setLength(2.1);
		        lion.setSpeed(80);
		        
		        
		        System.out.println("動物名:" + lion.getName());
		        System.out.println("体長:" + lion.getLength() + "m");
		        System.out.println("速度:" + lion.getSpeed() + "km/h");
	}
	
		public static int doubleValue(int num) {
        return num * 2; 
    }
		public static boolean isEven(int num) {
	        return num % 2 == 0;
	    }

	}


