day04 课堂笔记

1、开发第一个java程序：HelloWorld

	1.1、程序写完之后，一定要ctrl + s 进行保存
	第一个HelloWorld程序照抄就行了，不要问代码为什么这么写。
	另外，大家需要注意的是：java源代码只要修改，必须重新编译。
	重新编译生成新的class字节码文件。

	1.2、编译阶段
		怎么编译？使用什么命令？这个命令怎么用？
		需要使用的命令是：C:\Program Files\Java\jdk-13.0.2\bin\javac.exe
		这个命令需要先测试一下，打开DOS命令窗口，看看javac命令是否可用。

		C:\Users\Administrator>javac
		'javac' 不是内部或外部命令，也不是可运行的程序或批处理文件。
		这说明：windows操作系统没有发现“javac.exe”命令在哪里。
		windows操作系统没有找到javac.exe文件在哪。

		为什么ipconfig、ping等命令可以使用呢？为什么javac用不了？
		我们发现windows操作系统中有这样一个环境变量，名字叫做：path，
		并且发现path环境变量的值是：
			C:\Windows\system32;%SystemRoot%;%SystemRoot%\System32\Wbem;%SYSTEMROOT%\System32\WindowsPowerShell\v1.0\
		我们还发现了在：C:\Windows\System32 这个目录下存在：ipconfig.exe

		注意：修改完环境变量之后，DOS命令窗口必须关闭重新打开才会起作用。

		将path环境变量中的:C:\windows\system32; 删除之后
		再测试：
			C:\Users\Administrator>ipconfig
			'ipconfig' 不是内部或外部命令，也不是可运行的程序或批处理文件。
		
		配置环境变量path的步骤：
			桌面计算机上右键-->属性-->高级系统设置-->环境变量
			怎么修改path环境变量？
				找到path，鼠标双击！！！！
			path环境变量当中都是路径，路径和路径之间必须采用“半角的分号”分隔。
		
		让javac.exe能用，我们配置哪个路径到path中？
			将C:\Program Files\Java\jdk-13.0.2\bin配置到path当中。

		
		注意：环境变量包括“系统变量”和“用户变量”
			系统变量：范围比较大，系统变量会让计算机所有用户都起作用。
			用户变量：范围比较小，这个变量只是作用于当前用户。
		
		怎么查看编译器版本？
			C:\Users\Administrator>javac -version
			javac 13.0.2	
		
		怎么查看java虚拟机的版本？
			C:\Users\Administrator>java -version
			java version "13.0.2" 2020-01-14
			Java(TM) SE Runtime Environment (build 13.0.2+8)
			Java HotSpot(TM) 64-Bit Server VM (build 13.0.2+8, mixed mode, sharing)
		
		问题1：path环境变量的作用是什么？
			path环境变量的作用就是给windows操作系统指路的。
			告诉windows操作系统去哪里找这个命令文件。
			path环境变量中有很多很多的路径，路径和路径之间用半角分号分隔。
			path=A;B;C;D......
			path是环境变量的名字。
			A;B;C;D......是环境变量path的值。
		
		问题2：path环境变量是java中的机制，还是windows操作系统中的机制？
		path环境变量是隶属于java的吗？path环境变量和java有关系吗？
			path环境变量本质上是隶属于windows操作系统的，和java没有关系。
			java只不过用了一下path环境变量。
		
		要学会融会贯通，学一通百：
			以后在安装其他软件之后，希望在DOS命令窗口中使用该软件的某个命令
			的时候，如果出现“命令找不到错误了”，这个时候希望大家能够想起来
			配置环境变量path。
		
		path环境变量中的路径可以指定多个，没问题，多少个都行。

		------------------------------------------------------------------------------
		javac命令怎么用？
			语法格式先背会：
				javac java源文件的路径
			什么是java源文件？
				java源文件的名字以“.java”结尾，该文件中写了java源代码。
			java源文件的路径是什么意思？
				注意：路径永远包括绝对路径和相对路径。
			
			注意：神操作？？？？
				把java源文件直接拖进到DOS命令窗口，那么DOS命令窗口就有这个路径了。
			
			C:\Users\Administrator>javac D:\course\JavaProjects\02-JavaSE\chapter01\HelloWorld.java
			D:\>javac course\JavaProjects\02-JavaSE\chapter01\HelloWorld.java
			D:\course\JavaProjects>javac 02-JavaSE\chapter01\HelloWorld.java
			D:\course\JavaProjects\02-JavaSE\chapter01>javac HelloWorld.java
			以上的四种方式都行，第一种方式是绝对路径
			剩下三种方式都是相对路径。

			C:\Users\Administrator>javac course\JavaProjects\02-JavaSE\chapter01\HelloWorld.java
			错误: 找不到文件: course\JavaProjects\02-JavaSE\chapter01\HelloWorld.java
			用法: javac <选项> <源文件>
			使用 --help 可列出可能的选项
			以上报错的原因是：java源文件的路径写错了。

			C:\Users\Administrator>javac HelloWorld.java
			错误: 找不到文件: HelloWorld.java
			用法: javac <选项> <源文件>
			使用 --help 可列出可能的选项

			注意：神操作？？？？
				怎么在DOS命令窗口中快速定位到某个路径呢？
					打开计算机-->打开一些文件夹-->在地址栏上直接输入cmd回车，这样直接就过去了。
			
			编译报错的时候不会生成class字节码文件！
				D:\course\JavaProjects\02-JavaSE\chapter01>javac HelloWorld.java
				HelloWorld.java:3: 错误: 非法字符: '\uff1b'
									 System.out.println("Hello World")；
																				 ^
				1 个错误

	1.3、运行阶段
		运行的前提是：class文件（字节码）生成了。没有字节码文件程序是无法运行的。
		重点重点重点重点重点重点重点重点重点!!!!!!!
			假设该文件的名字叫做：HelloWorld.class
			那么HelloWorld被称为？？？？？？？？？？
				HelloWorld 就是一个类名。
			
			如果文件名是Test.class，那么：Test就是一个类名。
		
		怎么运行，使用哪个命令？
			使用JDK的bin目录下的：java.exe命令来运行。
		
		先在DOS命令窗口中测试java.exe这个命令是否可用！！！
			java -version
		
		"java.exe"这个命令怎么用，语法格式是什么？
			java 类名
		
		java HelloWorld.class 对不对？？？？？
			不对！！！！
		正确的写法是：
			java HelloWorld
		
		千万千万要注意：java这个命令，后面跟的是“类名”，而绝对不能跟“文件路径”，
		因为java命令后面跟的不是文件，是一个“类名”。

		对于这个字节：Test.class	，应该：java Test
		对于这个字节码：A.class ，应该 java A
		对于这个字节码：Hello.class，应该java Hello
		.....

		运行java程序需要哪些步骤呢？

			第一步（必须这样做，这是必须的，先记住）：
				先使用cd命令切换到Test.class文件所在的路径。

			第二步：执行java Test

			切记：
				java命令后面只要是跟路径，就一定不行。
				java命令后面只能跟类名。

2、到目前为止，大家告诉我，一共配置了哪些环境变量？

	到目前为止，我们只配置了一个环境变量path，并且这个环境变量path和java实际上
	没关系，是人家windows操作系统的机制。

	对于Java的JDK所属的环境变量，有一个叫做：JAVA_HOME
	这个JAVA_HOME目前我们不需要，不配置这个环境变量也不会影响当前java程序的运行。
	但是后期学习到JavaWEB的时候需要安装Tomcat服务器，那个时候JAVA_HOME就必须配置了。

	那么除了JAVA_HOME环境变量之外，JDK相关的环境变量还有其他的吗？
		答案：有的。

3、我们一起来研究一下：“java HelloWorld”的执行过程以及原理。

	D:\course\JavaProjects\02-JavaSE\chapter01>java HelloWorld
	敲完回车，都发生了什么？？？？？
		
		第一步：会先启动JVM（java虚拟机）

		第二步：JVM启动之后，JVM会去启动“类加载器classloader”
		类加载器的作用：加载类的。本质上类加载器负责去硬盘上找“类”对应的“字节码”文件。
		假设是“java HelloWorld”，那么类加载器会去硬盘上搜索：HelloWorld.class文件。
		假设是“java Test”，那么类加载器会去硬盘上搜索：Test.class文件。
		.......
	
		第三步：
			类加载器如果在硬盘上找不到对应的字节码文件，会报错，报什么错？
				错误: 找不到或无法加载主类
			类加载器如果在硬盘上找到了对应的字节码文件，类加载器会将该字节码
			文件装载到JVM当中，JVM启动“解释器”将字节码解释为“101010000...”这种
			二进制码，操作系统执行二进制码和硬件交互。
			
	问题？？？？？
		默认情况下，类加载器去硬盘上找“字节码”文件的时候，默认从哪找？？？？
			默认情况下类加载器（classloader）会从当前路径下找。
	
	此处应该有疑问，你可以提出哪些问题？？？？
		能不能给类加载器指定一个路径，让类加载器去指定的路径下加载字节码文件。
		答案：可以的。但是我们需要设置一个环境变量，叫做：classpath
	
	classpath是一个环境变量，是给谁指路的？
		答案：是给“类加载器”指路的。
	
	classpath环境变量不属于windows操作系统，classpath环境变量隶属于java。

	classpath环境变量是java特有的。
		classpath=A路径;B路径;C路径.....
		classpath是一个变量名
		A路径;B路径;C路径.....是变量值
	
	我们把classpath配置一下，这个环境变量在windows中没有，需要新建！！！！
		计算机-->右键-->属性-->高级系统设置-->环境变量-->新建...
	
	注意：变量名不能随意写：大小写无所谓，但必须叫做：classpath
		CLASSPATH
		ClassPath
		Classpath
		classpath
		都行。
	
	我目前是随意配置的：（重启CMD）
		classpath=D:\course
		非常重要的一个特点，必须记住：
			配置了classpath=D:\course之后，类加载器只会去D:\course目录下找“xxx.class”文件
			不再从当前路径下找了。
		
		结论是：
			到目前为止：classpath环境变量不需要配置。
			但你必须理解classpath环境变量是干什么的！！！！
	
	你一定要理解classpath环境变量的作用是什么？
		是给类加载器指路的。
		在没有配置环境变量classpath的时候，默认从当前路径下加载。
		如果配置了环境变量classpath的话，就只能从指定的路径下加载了。

	path java_home classpath，这3个环境变量path需要配置，后面两个暂时不配置。

4、???????【让人困惑了！！！】（了解即可，不需要掌握，现阶段也不需要这样写）
在高版本的JDK当中，有这样的一个新特性，可以直接这样一步到位：
	java x/y/z/xxx.java
	java后面直接加java源文件的路径。
	这个特性是为了简化开发而提出，但实际上底层的实现原理还是和以前一样的，
	以上命令在执行过程中，还是会先进行编译，然后再运行。并且以上的运行方式，
	编译生成的class文件在硬盘上不存在，看不到。

5、关于第一个java程序代码的解释说明！

	// 单行注释

	/*
		多行注释
	*/

	/**
	* javadoc注释：这里的注释信息可以自动被javadoc.exe命令解析提取并生成到帮助文档当中。
	*/
