import java.util.Scanner;

public class Graduate implements Colleagestudent,Teacher{
	int doctoral=7000;  //��һλ��ʿ��нˮ
	int doctoral2=6000;  //�ڶ�λ��ʿ��нˮ
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
			 System.out.println("����������");
		  name=sc.next();
			 System.out.println("�������Ա�");
		  sex=sc.next();
		  
		  /*
		   * 
		   * */
		  try {
			  System.out.println("����������");
			  age=sc.nextInt();
		      } catch (Exception e) {

            System.out.println("��������쳣");
      
		}
		  System.exit(1);//�����쳣ǿ���˳�
			
	}
	public static void payment() {   //�ӿ��еķ������Ǿ�̬�ķ���	 
		Graduate bc=new Graduate();
        bc.setCoin(4000);
        double moneysy=bc.getCoin();
        System.out.println("��Ҫ����ѧ��Ϊ"+moneysy);
	 }
	public static void inquiresalary() {  //��ȡ��нˮ
		try {
			 Schoolfinance a=new  Schoolfinance();
			 a.setMoney(7000.0);
			 double moneys=a.getMoney();
			 System.out.println("�㷢�ŵ�нˮΪ"+moneys);
		} catch (Exception e) {
			System.out.println("������ĳ������쳣");
		}
		
	  }
	public void taxamount() {
    	System.out.println("��ѧ����˰���Ϊ��"+(amount-sh)*tex+"Ԫ");
    }
  
  
}
