# glimmer task2
### 分析单文件代码结构
**package com.ISEKAI**;   
 - package用于声明一个类所在的包，com 是顶级域名，ISEKAI 是该顶 级域名下的子域名  

     - 什么是包（pakage），包的作用是什么？？
        - 包机制像是管理者，它将类转变成小的、可管理的单元，有助于避免命名冲突，并提供了一种访问控制机制  

**import com.ISEKAI.tool.Print**;  
  - import 关键字用于导入包中的类，使得你可以在代码中使用这些类而不必每回都写出包的完整路径。
  - '.'是Java里的一种运算符，当需要让一个类或对象做事情的时候用它来做运算
  - "com.ISEKAI.tool.Print"中就表示这行代码表示导入了位于 com.ISEKAI 包中的 tool 子包里的 Print 类里面

**public class HelloWorld** {   

- 这句中"Helloworld"就是我们所取的文件名，严谨一点就是public class HelloWorld 定义了一个名为 HelloWorld 的公共类


**public static void main(String[] args)**{  

- public static void main(String[] args)是Java程序的标准主方法，它接收一个字符串数组作为参数，通常用于命令行参数。在建立项目的时候大多编译器会给出直接生成这段代码的选项。

**Test.test()**;  }}
- 这句代码调用了 Test 类的 test 静态方法。这里假设 Test 类和它的 test 方法是已经定义好的，并且 test 方法也是静态的。  

class Test{  
    public static void test(){  
        Print.print("Hello World");  } }
 
### 什么是main函数？ 
- 是Java应用程序的入口方法，所以说，在执行程序时第一个执行的方法就是main()，可以说，main是Java程序所必需的条件。
### 一个单文件java程序的基本结构
- 一个单文件Java可以包含以下几个结构：  
    1. **包声明** 你必须声明这个程序属于哪个包。如果程序属于某个包，则需要在文件的开头声明包名。例如package com.ISEKAI;
    2. **导入语句** 当程序需要使用Java标准库中其他包的类，需要使用import语句导入。例如当我们需要输入一个数时，我们必须先从Java标准库中导入Scanner："import java.util.Scanner;"
    为整个程序提供数据的输入口。
    3. **类定义** 每个Java程序至少包含一个类定义。类是程序的主要构建块。例如public class HelloWorld { }，就是在Helloworld这个类中构建程序的。
    4. **main方法** main函数是Java程序的入口，我们常见的形式有：public static void main(String[] args) { }  

        - *剩余的就是实际执行进行的代码了*


