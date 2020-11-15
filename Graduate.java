import java.util.Scanner;

public class Graduate implements Colleagestudent,Teacher{
	int doctoral=7000;  //第一位博士的薪水
	int doctoral2=6000;  //第二位博士的薪水
	int amount=doctoral*12; 
	int amount1=doctoral2*12;
	double coin;
	final double tex=0.03;
	Schoolfinance sch=new Schoolfinance();
    double sh=sch.getMoney();
	public double getCoin() {
		return coin;
	}
	public void setCoin(double coin) {
		this.coin = coin;
	}
	public void information() {
		  String name;
		  String sex;
		  int age;
		  Scanner sc=new Scanner(System.in);
			 System.out.println("请输入姓名");
		  name=sc.next();
			 System.out.println("请输入性别");
		  sex=sc.next();
		  
		  /*
		   * 
		   * */
		  try {
			  System.out.println("请输入年龄");
			  age=sc.nextInt();
		      } catch (Exception e) {

            System.out.println("你出现了异常");
      
		}
		  System.exit(1);//出现异常强制退出
			
	}
	public static void payment() {   //接口中的方法都是静态的方法	 
		Graduate bc=new Graduate();
        bc.setCoin(4000);
        double moneysy=bc.getCoin();
        System.out.println("你要交的学费为"+moneysy);
	 }
	public static void inquiresalary() {  //获取的薪水
		try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("你发放的薪水为"+moneys);
		} catch (Exception e) {
			System.out.println("你输入的出现了异常");
		}
		
	  }
	public void taxamount() {
    	System.out.println("该学生的税额款为："+(amount-sh)*tex+"元");
    }
  
  
}
