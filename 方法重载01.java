/*
 1.���������ֱ���ΪOverload
 
 2.ʲôʱ��ʹ�÷������أ�
 	
 	-��������ʱ�������÷�������ͬ
 	
 	-���ǹ��ܲ�����/��ͬʱ�������÷���������ͬ
 	
 3.ʲô��������󹹳ɷ������أ�
 
 	-��ͬһ��������
 	
 	-��������ͬ
 	
 	-�����б�ͬ
 		-������ͬ
 		-���Ͳ�ͬ
 		-˳��ͬ
 		
 4.�������غ�ʲô�йأ���ʲô�޹أ�
 	
 	-�ͷ�����+�����б��й�
 	
 	-�ͷ���ֵ�����޹�
 	
 	-�����η��б��޹�
 */
public class ��������01 {

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
	 
	 public static void x(int b��int a){}
	 
	 ���������������ڷ������أ�����ᱨ��
	 */
}
