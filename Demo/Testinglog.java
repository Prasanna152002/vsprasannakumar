package Demo;

import java.util.Scanner;

public class Testinglog {
	static Scanner sc=new Scanner(System.in)
;	public static void main(String[] args) throws InterruptedException {
		while(true)
		{
			System.out.print("Enter the Class name : ");
			Poly p;
			try {
				p = (Poly)Class.forName(sc.next()).newInstance();
				p.done();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				int n=3;
			}
			System.out.println("Done");
			Thread.sleep(3000);
		}
	}
}
abstract class Poly{
	abstract public void done();
}
class Volly extends Poly{

	@Override
	public void done() {
		System.out.println("This is Volly");
		
	}}
class Galli extends Poly{

	@Override
	public void done() {
		System.out.println("This is Galli");
		System.out.println("This is MikuSali");
		
	}}
class Dolly extends Poly{

	@Override
	public void done() {
		System.out.println("This is Dolly");
		//System.out.println("Wow its Working");
		
	}}
class Holly extends Poly{

	@Override
	public void done() {
		System.out.println("This is Holly");
		
	}
	
}
//class Close extends Poly{
//	@Override
//	public void done() {
//		//System.exit(0);
//		System.out.println("Hello");
//		System.out.println("Done");
//	}
//}
class Close extends Poly{
	@Override
	public void done() {
		//System.exit(0);
		System.out.println("Hello");
		System.out.println("Done");
	}
}