# java-Experiment-3
# 计G201 2020322058    刘芸杉
## 阅读程序
+ 设计两个管理接口：学生管理接口和教师管理接口；
  学生接口包括缴纳学费、查学费的方法；
  教师接口包括发放薪水和查询薪水的方法。

+ 设计博士研究生类，实现上述的两个接口，该博士研究生具有姓名、性别、年龄、每学期学费、每月薪水等属性。    

+ 让子类中的学生类和老师类来继承Person类中的对象和方法。

+ 编写测试类，并实例化两名博士研究生，统计他们的年收入和学费。
  根据两者之差，算出每名博士研究生的年应纳税金额。

## 实验目的
+ 掌握Java中抽象类和抽象方法的定义； 
+ 掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法；
+ 了解异常的使用方法，并在程序中根据输入情况做异常处理；

## 实验过程
1. Colleagestudent类中定义了静态的抽象方法：payment和checkmoney
2. Teacher类中定义了静态抽象方法：paysalary和inquiresalary
3. Graduate类中定义了payment，taxamount等方法以及Colleagestudent和Teacher两个接口；使用了try-catch处理异常
4. Schoolfinance类中定义了set(),get()方法
5. Test类中实例化了Graduate类并调用其方法
   
 ## 3.核心方法
 + 捕捉异常的方法
 ```
 public static void inquiresalary() {  //获取的薪水
		try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("你发放的薪水为"+moneys);
		} catch (Exception e) {
			System.out.println("你输入的出现了异常");
		}
    ```
```

 + 通过Scanner进行输出姓名，性别
      ```
        Scanner sc=new Scanner(System.in);
			 System.out.println("请输入姓名");
		  name=sc.next();
			 System.out.println("请输入性别");
		  sex=sc.next();
       ```
  
  ## 4.实验结果
  1. 输出博士研究生的年应纳税额
  2. 当输入年龄为负时，显示输出为异常
  
  ## 5.实验感想
  1. 了解了实现接口的方法和定义
  2. 了解了处理异常的方法
  
