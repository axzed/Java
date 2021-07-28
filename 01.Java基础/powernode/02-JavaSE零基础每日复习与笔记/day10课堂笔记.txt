day10课堂笔记

1、今天三件事
	第一：回顾之前所有的内容
	第二：讲解昨天的所有作业题
	第三：布置大量的练习题，坚决这个周末大家把之前所学习的所有内容全部掌握。

2、回顾
	2.1、windows操作系统中，文件扩展名的展示。
	2.2、安装EditPlus并且进行相关配置。
	2.3、windows的dos命令
		cls 清屏
		exit 退出
		ipconfig 查看IP地址
		ping 查看两台计算机之间是否可以正常通信
		d: 回车 切换盘符
		cd 命令切换目录：相对路径和绝对路径
			C:\Windows>cd System32 相对路径（相对于当前位置而言）
			C:\>cd c:\windows\system32 绝对路径（路径以盘符开始）
		cd .. 回到上级
		cd \ 回到根
		mkdir 创建目录
		del 删除文件
		dir 查看当前目录下有哪些子目录或者子文件
		
		注意：
			在DOS命令窗口中，可以使用tab键自动补全。
			在DOS命令窗口中，使用上下箭头可以翻出历史命令。
	2.4、快捷键：
		补充两个windows系统的组合键：
			win + r 打开运行窗口
			win + d 显示桌面
			win + l 锁屏（离开电脑的时候要锁屏）
			alt + tab 切换应用
	2.5、计算机语言的发展史
		第一代
		第二代
		第三代
	2.6、Java语言的发展史
		JDK：java开发工具包
		JavaSE JavaEE JavaME
		SUN公司开发的，带头人：james gosling java之父
	2.7、java语言的特点：
		简单性
		多线程
		面向对象
		可移植，跨平台：因为JVM的存在。（Java虚拟机屏蔽了操作系统之间的差异）
			windows上安装的JDK和Linux上安装的JDK的版本不同。
			JDK版本不同，最终JVM的版本也是不同的，每一个操作系统都有自己的JVM。
		健壮性：自动GC垃圾回收机制。
	2.8、java的加载与执行（java从开发到最终运行，经历了哪些过程）
		要求：自己能够从头描述到最后。（不参考任何资料的前提下）
		从编写到最终的运行，把过程描述出来。
			第一步：
			第二步：
			.....
	2.9、术语
		JDK JRE JVM
		JDK java开发工具包
		JRE java运行时环境
		JVM java虚拟机

		JavaSE JavaEE JavaME
	
	2.10、开始开发第一个java程序HelloWorld
		第一：要会下载对应版本的JDK（http://www.oracle.com）
		第二：要会安装JDK（双击，下一步）
		第三：配置环境变量path
			path=C:\Program Files\Java\jdk-13.0.2\bin
			这样javac和java命令就可以使用了。
		第四：编写HelloWorld.java程序。
		第五：javac进行编译：
			javac命令在使用的时候
			javac + java源文件的路径（注意：路径包括绝对和相对。）
		第六：java命令进行运行
			java 类名    (一定要注意：这里不是路径。是类名)
			这里涉及到另一个环境变量叫做：classpath
			classpath没有配置的情况下：从当前路径下找xxx.class文件
			classpath设置了具体路径之后，不再从当前路径下找了。
		
		重点掌握path和classpath两个环境变量。
	2.11、java语言中的注释：

		// 单行注释

		/*
			多行注释
		*/
		/**
		*	javadoc注释
		*/
	2.12、public class 和class的区别
		一个java文件中可以定义多个class
		一个class编译之后会生成1个class字节码文件，2个class编译之后会生成2个class文件
		任何一个class中都可以编写main方法，每一个main方法都是一个入口
		public的类可以没有
		public的类如果有的话，只能有1个，并且public的类名要求和文件名一致。
			class A{
				main(){}
			}
			java A

			class B{
				main(){}
			}
			java B
			....
	2.13、标识符
		标识符可以标识什么？
			类名、接口名
			变量名、方法名
			常量名
		标识符的命名规则？
			标识符只能由数字 字母(可以有中文) 下划线 美元符号组成，不能有其它符号。
			标识符不能以数字开始
			标识符严格区分大小写
			关键字不能做标识符
			理论上没有长度限制
		标识符的命名规范？
			见名知意
			驼峰命名方式，一高一低
			类名、接口名：首字母大写，后面每个单词首字母大写。
			变量名、方法名：首字母小写，后面每个单词首字母大写。
			常量名：全部大写，每个单词之间使用下划线衔接。

		标识符在editplus中是黑色字体。

	2.14、关键字
		关键字都是全部小写的，在editplus中以蓝色显示。
		不需要特意记忆，一边学习一边记忆。
		public 
		class
		static
		void
		byte 
		short
		int
		long
		float
		double
		boolean
		char
		true
		false
		if
		else
		switch
		for
		while
		break
		continue
		........
	
	2.15、变量

		什么是变量，怎么理解的？
			一个存储数据的盒子，
			一个存储数据的单元。
			int i = 100;
			System.out.println(i);

		什么是字面量，怎么理解的？
			1 2 3 4 -100 100 整数型字面量
			3.14   浮点型的字面量。
			true false 布尔型字面量
			'a' '中' 字符型字面量
			"abc" "a" 字符串型的字面量
			字面量其实本质上就是“数据”。

		变量怎么声明，怎么赋值？
			声明：
				数据类型 变量名;
				int i;
			赋值：用=赋值
				变量名 = 字面量;
				i = 100;
				重新赋值：i = 200;

			变量在同一个域当中不能重名。
				{
					int i = 2;
					double i = 2.0;
					//报错了，重名了。
				}
		变量的分类？
			在方法体当中声明的就是局部变量。
			在方法体外面声明的就是成员变量。

		变量的作用域？
			出了大括号就不认识了。
			每一个变量都有自己的有效范围。出了范围就不认识了，就不能用了。

	2.16、数据类型
		1. 什么是数据类型，有啥用？
			数据类型决定了变量分配空间的大小，类型不同，空间大小不同。
			（在内存中分配空间）
			计算机的主要部件：CPU 内存 硬盘 主板。
		2、数据类型分类？
			基本数据类型：
				byte short int long float double boolean char
			引用数据类型：
				String..........
		3、要求要理解二进制
		4、要求理解二进制和十进制之间的互相转换。
		5、8种基本数据类型，每个占用空间大小。
			类型		字节
			------------------
			byte		1
			short		2
			int		4
			long		8
			float		4
			double	8
			boolean	1
			char		2
		6、记忆byte short int char的取值范围：
			byte -128 ~ 127
			short -32768 ~ 32767
			int -2147483648 ~ 2147483647
			char 0~65535
		7、理解字符编码？
			什么时候会有乱码？编码和解码采用的不是同一套字符编码方式。
			怎么理解字符编码？字符编码是人为制定的，一个字典表，字典中描述了转换关系。
			常见的字符编码？
				ASCII：
					'a' 97
					'A' 65
					'0' 48
					...
				ISO-8859-1(latin-1)
				GBK
				GB2312
				GB18030
				Big5
				unicode : java中采用的统一了全球所有的文字。
		8、数据类型详细介绍
			char
				可以存储1个汉字
				用单引号括起来
				转义字符：
					\t
					\n
					\'
					\"
					\\
					\u
					....
				char c = 97;
				System.out.println(c); //输出'a'

			byte short int long
				int最常用
				任何一个数字，例如：1232 3 5 9，默认都是当做int处理，想当做long，必须加L或者l
				123L这就是long类型
				自动类型转换：小-->大
				强制类型转换：大-->小，需要加强制类型转换符。另外运行可能损失精度。

				当一个整数没有超出byte short char的取值范围，
				可以直接赋值给byte short char类型的变量。

				在java中整数型字面量表示的时候有四种方式：
					10 十进制
					010 八进制
					0x10 十六进制
					0b10 二进制

			float double
				浮点型的数字默认被当做double来处理，
				想以float形式存在，数字后面添加F/f
				float f = 1.0; //错误的
				float f = 1.0f;
				float f = (float)1.0;

				要知道浮点型数据在java语言中存储的都是近似值。
				还有一点：float和double的空间永远比整数型空间大，比long大。

			boolean
				boolean类型只有两个值：true false，没有其他值。
				布尔类型使用在逻辑运算，条件判断当中。

		9、基本数据类型转换的6条规则：
			第一条：只有boolean不能转换，其它都行。

			第二条：自动类型转换
				byte < short(char) < int < long < float < double
				char可以取到更大的正整数。

			第三条：强制类型转换需要加强制类型转换符。可能损失精度。

			第四条：当一个整数没有超出byte short char的取值范围时，可以直接赋值
			给byte short char类型的变量。

			第五条：byte short char混合运算的时候，各自先转换成int再做运算。

			第六条：多种数据类型混合运算的时候，先转换成容量最大的那一种再做运算。

	2.17、运算符
		算术运算符
			+ - * / % ++ --
			重点：++
				++无论出现在变量前还是后，只要++运算结束，一定会自加1.
				int i = 10;
				i++;
				System.out.println(i); // 11

				int k = 10;
				++k;
				System.out.println(k); // 11

				++出现在变量前：
					int i = 10;
					int k = ++i;
					System.out.println(k); // 11
					System.out.println(i); // 11
				
				++出现在变量后：
					int i = 10;
					int k = i++;
					System.out.println(k); // 10
					System.out.println(i); // 11
				
				int i = 10;
				System.out.println(i++); // 10
				解开以上题目的窍门是什么？拆代码
					int temp = i++;
					System.out.println(temp); // 10
					System.out.println(i); // 11
				
				int i = 10;
				System.out.println(++i);
				会拆代码:
					int temp = ++i;
					System.out.println(temp); // 11
					System.out.println(i); // 11

		关系运算符
			>
			>=
			<
			<=
			==
			!=
			结果都是布尔类型。true/false

		逻辑运算符
			&
			|
			!
			&&
			||

			逻辑运算符要求两边都是布尔类型，并且最终结果还是布尔类型。
				左边是布尔类型 & 右边还是布尔类型 -->最终结果还是布尔类型。
			& 两边都是true，结果才是true
			| 一边是true，结果就是true
			! 取反

			&&实际上和&运算结果完全相同，区别在于：&&有短路现象。
			左边的为false的时候：&& 短路了。

			左边为true的时候：|| 短路了。

		赋值运算符
			=
			+=
			-=
			*=
			/=
			%=
			重要规则：
				扩展赋值运算符在使用的时候要注意，不管怎么运算，最终的
				运算结果类型不会变。

				byte x = 100; // byte最大值127

				x += 1000; // 编译可以通过，x变量还是byte类型，只不过损失精度了。

				x += 1000; 等同于： x = (byte)(x + 1000);
				
				int i = 10;
				i += 10; // 等同于：i = i + 10; 累加。
			

		条件运算符
			?:
			三目
			布尔表达式 ? 表达式1:表达式2

			布尔表达式为true，选择表达式1作为结果。
			反之选择表达式2作为结果。

		字符串连接运算符
			+
			+ 两边都是数字，进行求和。
			+ 有一边是字符串，进行字符串的拼接。
			+ 有多个的话，遵循自左向右依次执行：1 + 2 + 3
			如果想让其中某个加号先执行，可以添加小括号：1 + (2 + 3)
			注意：字符串拼接完之后的结果还是一个字符串。

			技巧：怎么把一个变量塞到一个字符串当中。
				String name = "jackson";
				System.out.println("登录成功，欢迎"+name+"回来");

	2.18、控制语句

		选择语句
			if
			switch
		循环语句
			for
			while
			do..while
		转向语句
			break;
			continue;
			return;
		
		1、选择语句/分支语句 if
			四种写法。
			语法机制：
				if(布尔表达式){
				}
				
				if(布尔表达式){
				}else{
				}

				if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}

				if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}else if(布尔表达式){
				}else{
				}

				if语句嵌套：
					if(布尔表达式){ //前提条件
						if(布尔表达式){
							if(布尔表达式){
							
							}else{
							
							}
						}
					}else{
					
					}
				
			执行原理：
				对于一个if语句来说，只要有1个分支执行，整个if语句结束。
				当布尔表达式的结果为true时，分支才会执行。
				分支当中只有一条java语句，大括号可以省略。
				带有else的可以保证肯定会有一个分支执行。

		2、选择语句/分支语句 switch

			完整语法结构：
				switch(值){ //值允许是String、int，（byte,short,char可以自动转换int）
				case 值1: case 值x:
					java语句;
					break;
				case 值2:
					java语句;
					break;
				case 值3:
					java语句;
					break;
				default:
					java语句;
				}

		3、for循环

			for循环语法机制：
				for(初始化表达式;条件表达式;更新表达式){
					循环体;
				}

				for(int i = 0; i < 10; i++){
					System.out.println(i);
				}

			for循环执行原理：
				1、先执行初始化表达式，并且只执行1次。
				2、然后判断条件表达式
				3、如果为true，则执行循环体。
				4、循环体结束之后，执行更新表达式。
				5、继续判断条件，如果条件还是true，继续循环。
				6、直到条件为false，循环结束。

		4、while循环
			while(布尔表达式){
				循环体;
			}
			执行次数：0~N次。

		5、do..while循环
			do{
				循环体;
			}while(布尔表达式);

			执行次数：1~N次。

		6、break;
			默认情况下，终止离它最近的循环。
			当然，也可以通过标识符的方式，终止指定的循环。

			for(int i = 0; i < 10; i++){
				if(i == 5){
					break;
				}
				code1;
				code2;
				code3;
				code4;
				....
			}

		7、continue;
			终止当前“本次”循环，直接跳入下一次循环继续执行。
			for(int i = 0; i < 10; i++){
				if(i == 5){
					continue;
				}
				code1;
				code2;
				code3;
				code4;
				....
			}
		