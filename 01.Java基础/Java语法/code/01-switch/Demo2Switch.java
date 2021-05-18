import java.util.Scanner;

public class Demo2Switch {
	/*
		需求: 键盘录入星期数，输出工作日、休息日
		(1-5)工作日，(6-7)休息日
		
		
		case穿透是如何产生的?
		
			如果switch语句中,case省略了break语句, 就会开始case穿透.
		
		现象：
			当开始case穿透，后续的case就不会具有匹配效果，内部的语句都会执行
			直到看见break，或者将整体switch语句执行完毕，才会结束。

	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数:");
		int week = sc.nextInt();
		
		switch(week){
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("工作日");
				break;
			case 6:
			case 7:
				System.out.println("休息日");
				break;
			default:
				System.out.println("您的输入有误");
				break;
		}
	}	
}