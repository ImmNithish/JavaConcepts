package Final;

public  class Finalkeyword {
	//if we given final keyword to parent class we can't use child class
		
		final int i = 10;
		
		public void increment() {
			//since final keyword is given we canyt change the value //System.out.println(i++);
		}
		
		public final void add() {
			System.out.println("Addition");
		}
		
		public final void add(int a) {
			System.out.println("Addition");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Finalkeyword fi=new Finalkeyword();
			System.out.println(fi.i);

		}

	}

