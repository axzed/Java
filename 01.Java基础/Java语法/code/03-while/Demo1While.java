public class Demo1While {
	/*
		完整格式：
		
			初始化语句;
			while(条件判断语句) {
				循环体语句;
				条件控制语句;
			}
	
		执行流程：
			1. 执行初始化语句
			2. 执行条件判断语句，看其结果是true还是false
				如果是false，循环结束
				如果是true，继续执行
			3. 执行循环体语句
			4. 执行条件控制语句
			5. 回到②继续
		
		需求: 在控制台打印1-100之间所有的数
		需求: 在控制台打印520次 I LOVE YOU
	*/
	public static void main(String[] args) {
		/*
			for(int i = 1; i <= 100; i++){
				System.out.println(i);
			}
		*/
		int i = 1;
		while(i <= 520){
			System.out.println("I LOVE YOU");
			i++;
		}
	}
}