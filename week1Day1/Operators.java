package week1Day1;

public class Operators {

	public static void main(String[] args) {
		int a=5;
		int b=10;

		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a+=6);
		System.out.println(a>b);
		System.out.println((a<b)&&(b<a));
		System.out.println((b<a)||(a<b));
		System.out.println("before :"+ b++);
		System.out.println("before :"+ a--);
		System.out.println("after :"+a);
		System.out.println("after :"+b);
		System.out.println(++b);

	}

}
