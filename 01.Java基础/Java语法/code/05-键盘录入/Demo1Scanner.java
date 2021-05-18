import java.util.Scanner;

public class Demo1Scanner {
	
	/*
		步骤1: 导包, 需要写在class的上面
				import java.util.Scanner;
				
		步骤2: 创建对象
				Scanner sc = new Scanner(System.in);
				只有sc可以改变, 其他属于固定格式
				
		步骤3: 使用变量接受数据
				int i = sc.nextInt();
				 只有i变量可以改变, 其他属于固定格式
	*/
	public static void main(String[] args) {
		// 步骤2: 创建对象
		Scanner sc = new Scanner(System.in);
		
		// 步骤3: 使用变量接受数
		int a = sc.nextInt();
		
		System.out.println(a);
	}
}