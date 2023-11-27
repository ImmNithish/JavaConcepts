package RandomNumber;

import java.util.Random;
public class RandomNum {


		public static void main(String[] args) {
			for(int i=0;i<10;i++) {
				//randomClass();
				//System.out.println(getRandonIntNumber(10, 100));
				System.out.println(getRandonDoubleNumber(10, 100));
			}
		}
		
		public static void randomClass() {
			Random random = new Random();
			System.out.println("Random Integer value "+random.nextInt());
			System.out.println("Random Positive Integer value "+random.nextInt(1000));
			System.out.println("Double Random value : "+random.nextDouble());
			System.out.println("Boolean Random Value : "+random.nextBoolean());
		}
		
		public static int getRandonIntNumber(int min,int max) {
			Random random = new Random();
			int result = random.nextInt((max - min) + 1) + min;
			return result;
		}
		// 0.0 - 1.0
		public static double getRandonDoubleNumber(int min,int max) {
			Random random = new Random();
			double result = (random.nextDouble()* ((max - min )+1) + 1);
			return result;
		}

	}


