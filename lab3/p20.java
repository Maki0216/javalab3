package lab3;

public class p20 {
	public static void main(String[]args) {
		Carj car1;
		car1=new Carj();
		
		car1.num=1234;
		car1.gas=-10;
		car1.show();
	}
}
class Carj{
	int num;
	double gas;
	void show(){
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}