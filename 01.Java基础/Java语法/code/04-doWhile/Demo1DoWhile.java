public class Demo1DoWhile {
	/*
		完整格式：
			初始化语句;
			do {
				循环体语句;
				条件控制语句;
			}while(条件判断语句);
			
		执行流程：
			1.执行初始化语句
			2.执行循环体语句
			3.执行条件控制语句
			4. 执行条件判断语句，看其结果是true还是false
				如果是false，循环结束
				如果是true，继续执行
			5. 回到②继续

		特点:
			do..while循环, 无论循环条件是否满足, 都至少会执行一次循环体.
			
			原因: do..while循环是从上到下依次执行.
			
	*/
	public static void main(String[] args){
		// 需求: 在控制台打印10次黑马程序员
		int i = 11;
		do {
			System.out.println("黑马程序员");
			i++;
		}while(i <= 10);
		
		System.out.println(i);
	}
}