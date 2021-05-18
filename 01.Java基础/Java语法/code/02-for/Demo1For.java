public class Demo1For {
	
	/*
		格式：
		
			for (初始化语句;条件判断语句;条件控制语句) {
				循环体语句;
			}

		执行流程：
		
			执行初始化语句
			执行条件判断语句，看其结果是true还是false
						 如果是false，循环结束
						 如果是true，继续执行
			执行循环体语句
			执行条件控制语句
			回到②继续

		需求: 程序模拟折返跑3次的过程
	*/
	
	public static void main(String[] args){
		for(int i = 1; i <= 3; i++){
			System.out.println("折返跑");
		}
		
		
	}
}