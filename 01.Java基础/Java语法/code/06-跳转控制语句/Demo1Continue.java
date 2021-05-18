public class Demo1Continue {
	/*
		continue : 跳过某次循环体内容的执行
		
		注意：使用是基于条件控制, 在循环内部使用.
		
		需求: 模拟电梯上行的过程 1-24层, 4层不停.
	*/
	public static void main(String[] args){
		for(int i = 1; i <= 24; i++){
			if(i == 4){
				continue;
			}
			System.out.println(i + "层到了~");
		}
	}
	
}