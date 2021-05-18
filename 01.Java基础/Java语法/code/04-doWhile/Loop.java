public class Loop {
	/*
		for和while的区别：
		
			条件控制语句所控制的自增变量
				因为归属for循环的语法结构中，在for循环结束后，就不能再次被访问到了
				
			条件控制语句所控制的自增变量
				对于while循环来说不归属其语法结构中，在while循环结束后，该变量还可以继续使用
		
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			// for循环内部[定义]的变量, 在循环结束后, 就会从内存中消失
			System.out.println(i);
		}
		// System.out.println(i);	//  错误: 找不到符号i
		
		System.out.println("--------------");
	
		for(int i = 1; i <= 10; i++){
			System.out.println(i);
		}
		
		System.out.println("--------------");
		
		// while循环
		
		int a = 1;
		while(a <= 5){
			System.out.println(a);
			a++;
		}
		System.out.println(a + "...");
		
	}
}