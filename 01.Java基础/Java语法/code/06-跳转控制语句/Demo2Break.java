public class Demo2Break {
	/*
		break : 终止循环体内容的执行
		注意：使用是基于条件控制的
				break语句只能在循环和switch中进行使用.
				
		需求: 模拟20岁工作到80岁, 60岁退休.
	*/
	public static void main(String[] args){
		for(int i = 20; i <= 80; i++){
			if(i == 60){
				break;		// 结束整个循环
			}
			System.out.println(i + "岁正在上班");
		}
	}
	
}