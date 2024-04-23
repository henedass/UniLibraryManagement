
public class test {
	/*class X{
		public X(int i) {
			System.out.println(1);
		}
	}
	class Y extends X{
		public Y() { 
			System.out.println(2 );
		}
		
	}*/
	/*public void mystery () {}
	public void mystery (int a) {}
	public void mystery (String b,int a) {}
	public void mystery (int a, String b) {}
	private void mystery (String b,int a) {}
	public void mystery (Integer a) {}
	public String  mystery (int a) {return"";}*/
	
	class A {
		void f() {System.out.println("A.f()");} 
		void f(int n) {System.out.println("A.f(int)");} 
		void g() {System.out.println("A.g(int)");} 
	}
	class B extends A{
		void f() {System.out.println("B.f()");} 
		void h() {System.out.println("B.h()");} 
	}
	class C extends B{
		void g(int n) {System.out.println("C.g(int)");} 
		void g(String s) {System.out.println("C.g(String)");} 
		void h(int n) {System.out.println("C.h(int)");} 
	}
}
