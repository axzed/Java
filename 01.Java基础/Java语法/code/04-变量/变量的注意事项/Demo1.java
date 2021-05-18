public class Demo1 {
	/*
		1. 变量名不允许重复定义
	*/
	public static void main(String[] args){
		int a = 10;
		// int a = 20;  错误代码
		a = 20;
		System.out.println(a);
	}
}