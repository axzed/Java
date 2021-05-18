public class Demo1Switch {
	/*
		格式：
			switch(表达式) {
				case 值1：
					语句体1;
					break;
				case 值2：
					语句体2;
					break;
					…
				default：	
					语句体n+1;
					[break;]
			}

		1. 首先计算表达式的值。
		2. 依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句
			在执行的过程中，遇到break就会结束。
		3. 如果所有的case后面的值和表达式的值都不匹配
			就会执行default里面的语句体，然后程序结束掉。

		需求: 根据week变量记录的数值, 程序输入对应的星期
		例如: int week = 1;		星期一
	*/
	public static void main(String[] args){
		int week = 100;
		
		switch(week){
			case 1 :
				System.out.println("星期一");
				break;
			case 2 :
				System.out.println("星期二");
				break;
			case 3 :
				System.out.println("星期三");
				break;
			case 4 :
				System.out.println("星期四");
				break;
			case 5 :
				System.out.println("星期五");
				break;
			case 6 :
				System.out.println("星期六");
				break;
			case 7 :
				System.out.println("星期日");
				break;
			default:
				System.out.println("您的数据有误");
				break;
		}
	}
}