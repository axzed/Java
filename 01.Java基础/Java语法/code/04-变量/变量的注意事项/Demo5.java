public class Demo5 {
	
	/*
		5. 变量的作用域范围
		
				变量的作用域 : 只在它所在的大括号中有效
	*/
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);
		
		{
			int b = 20;
			// 当这个大括号中的代码执行完毕后, 内部所[定义]的变量就会丛内存中消失
		}
		
		System.out.println(b);
	}
}