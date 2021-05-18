public class Demo6For {
	/*
		需求：在控制台输出所有的“水仙花数”，要求每行打印2个

		System.out.print (打印内容);	打印后不换行
		System.out.println(打印内容);	打印后换行

		分析:
			
			1. 定义变量count，用于保存“打印过”的数量，初始值为0
			2. 在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
			3. 在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行。

	*/
	public static void main(String[] args){
		// 1. 定义变量count，用于保存“打印过”的数量，初始值为0
		int count = 0;
		for(int i = 100; i <= 999; i++){
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 10 / 10 % 10;
			
			if(	(ge*ge*ge + shi*shi*shi + bai*bai*bai) == i){
				//  2. 在判定和打印水仙花数的过程中，拼接空格, 但不换行，并在打印后让count变量+1，记录打印过的数量
				System.out.print(i + " ");
				count++;
				// 3. 在每一次count变量+1后，判断是否到达了2的倍数，是的话，换行
				if(count % 2 == 0){
					System.out.println();
				}
			}
		}
	}
}