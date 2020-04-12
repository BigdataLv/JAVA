/*
 1.方法重载又被称为Overload
 
 2.什么时候使用方法重载？
 	
 	-功能相似时，尽量让方法名相同
 	
 	-但是功能不想似/不同时，尽量让方法名不相同
 	
 3.什么条件满足后构成方法重载？
 
 	-在同一个类体中
 	
 	-方法名相同
 	
 	-参数列表不同
 		-数量不同
 		-类型不同
 		-顺序不同
 		
 4.方法重载和什么有关，和什么无关？
 	
 	-和方法名+参数列表有关
 	
 	-和返回值类型无关
 	
 	-和修饰符列表无关
 */
public class 方法重载01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x(1,2);
		x(1.0,2.0);
		x(1L,2L);
	}
	public static void x(int a,int b){
		int c=a+b;
	}
	
	public static void x(double a,double b){
		double c=a+b;
	}
	
	public static void x(long a,long b){
		long c=a+b;
	}
	/*
	 public static void x(int a,int b){}
	 
	 public static void x(int b，int a){}
	 
	 这两个方法不属于方法重载，编译会报错
	 */
}
