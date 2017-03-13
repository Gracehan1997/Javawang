import java.util.Random;
import java.util.Scanner;
 class Fenshu{
	static int fenzi1;
	static int fenmu1;
	static int fenzi2;
	static int fenmu2;
	public static void fenshu()//分数随机产生
	{
	    Random random=new Random();
	     fenmu1=(random.nextInt(10)+1);
	     fenzi1=(random.nextInt(10)+1);
	     fenmu2=(random.nextInt(10)+1);
	     fenzi2=(random.nextInt(10)+1);
	    if(fenmu1<=fenzi1||fenmu2<=fenzi2)
	    {
	        fenshu();
	    }
	    //System.out.println(fenmu1);
	    //System.out.println(fenzi1);
	    //System.out.println(fenmu2);
	    //System.out.println(fenzi2);
	      
	}
	public static char fuhao()//符号随机产生
    {
	char a =0;
    Random random=new Random();
    int f=random.nextInt(4);
    if(f==0)
          a='+';
    if(f==1)
    	  a='-';;
    if(f==2)
    	  a='*';
    if(f==3)
    	  a='/';
    return a;
    }
public static int GYS(int m, int n)   // 循环实现
	  {
	    int k,y;
	    if(m<n)
	    {
	      k=m;
	      m=n;
	      n=k;
	    }
	    while(m%n!=0)
	    {
	     y=m%n;
	     m=n;
	     n=y; 
	    }
	    return n;
	  }
	public static void zhenoutput()//真分数输出
	{
		fenshu();
	    char a1=fuhao();
	    if(a1=='+')
	    {
	    	int jieguo1=fenmu1*fenmu2;
	    	int jieguo2=fenzi1*fenmu2+fenzi2*fenmu1;
	    	int a=GYS(jieguo1,jieguo2);
	    	System.out.println(fenzi1+"/"+fenmu1+"+"+fenzi2+"/"+fenmu2+"="+jieguo2/a+"/"+jieguo1/a);	
	    }
	    if(a1=='-')
	    {
	    	int jieguo1=fenmu1*fenmu2;
	    	int jieguo2=fenzi1*fenmu2-fenzi2*fenmu1;
	    	int a=GYS(jieguo1,jieguo2);
	    	System.out.println(fenzi1+"/"+fenmu1+"-"+fenzi2+"/"+fenmu2+"="+jieguo2/a+"/"+jieguo1/a);	
	    }
	    if(a1=='*')
	    {
	    	int jieguo1=fenmu1*fenmu2;
	    	int jieguo2=fenzi1*fenzi2;
	    	int a=GYS(jieguo1,jieguo2);
	    	System.out.println(fenzi1+"/"+fenmu1+"*"+fenzi2+"/"+fenmu2+"="+jieguo2/a+"/"+jieguo1/a);	
	    }
	    if(a1=='/')
	    {
	    	int jieguo1=fenmu1*fenzi2;
	    	int jieguo2=fenzi1*fenmu2;
	    	int a=GYS(jieguo1,jieguo2);
	    	System.out.println(fenzi1+"/"+fenmu1+"/"+fenzi2+"/"+fenmu2+"="+jieguo2/a+"/"+jieguo1/a);	
	    }
	}    
}
public class Size {
	 
	 static int n;
	 static int m;
public static void main(String args[])
{
	
	Fenshu a=new Fenshu();
    boolean p=true;
    while(p)
    {
    
    Scanner in=new Scanner(System.in);
    System.out.println("1.整式计算 2.真分数计算");
    int ch=in.nextInt();
    if(ch==1)
    {
    System.out.println("请输入你要取得数值的范围：");
    Scanner in1=new Scanner(System.in);
    n=in1.nextInt();
    m=in1.nextInt();
    System.out.print("请确认你要计算的题目中是否包括乘除法：1、包括2、不包括");
    int c=in.nextInt();
    if(c==1)
    {
    System.out.println("请输入要计算的题的数量：");
    int number=in.nextInt();
    int i=0;
    while(i<number)
    {
      output();      
      i++;
    }    
    }
    if(c==2)
    {
    	 System.out.println("请输入要计算的题的数量：");
    	    int number=in.nextInt();
    	    int i=0;
    	    while(i<number)
    	    {
    	      output1();      
    	      i++;
    	    }    	
    }
    }
    if(ch==2)
    {
    System.out.println("请输入要计算的题的数量：");
    int number=in.nextInt();
    int i=0;
    while(i<number)
    {
      Fenshu.zhenoutput();
      i++;
    }
    }
    }
}
public static int shuzi()//随机产生数字并且判断数值范围
    { 
	   
	    Random random=new Random();
	    int a=(int)(Math.random()*(m-n+1)+n);
        //System.out.print(a);
        return a;
       
    }
public static void fuhao()//符号随机产生
    {
    Random random=new Random();
    int f=random.nextInt(4);
    if(f==0)
        System.out.print('+');
    if(f==1)
        System.out.print('-');
    if(f==2)
        System.out.print('*');
    if(f==3)
        System.out.print('/');
    }

public static void output()//整数计算包括乘除法
{
	//Scanner in1=new Scanner(System.in);
	
	int a=shuzi();
	int b=shuzi();
    
    Random random=new Random();
    
    int f=random.nextInt(4);  
    if(f==0)
    {
        System.out.print(a);
        System.out.print('+');
        System.out.print(b);
        System.out.println("="+(a+b));
    }
        
    if(f==1)
    {    	
        System.out.print(a);
        System.out.print('-');
        System.out.print(b);
        System.out.println("="+(a-b));
        if(a-b<0)
        {       	
        	System.out.println("此次计算式式子结果为负数。");
        }
    }
    if(f==2)
    {
        System.out.print(a);
        System.out.print('*');
        System.out.print(b);
        System.out.println("="+(a*b));
    }
    if(f==3)
    {
        System.out.print(a);
        System.out.print('/');
        System.out.print(b);
        int c=a/b;
        System.out.println("="+c);
        int yushu=a-c*b;
        if(yushu!=0)
        {
        	System.out.println("该式子不能整除，余数为"+yushu);
        }
        if(yushu==0)
        {
        	System.out.println("该式子能整除");
        }
    } 
	
	
    }
public static void output1()//整数计算不包括乘除
{
	double a=shuzi();
	double b=shuzi();
    
      Random random=new Random();
      int f=random.nextInt(2); 
	    if(f==0)
	    {
	        System.out.print(a);
	        System.out.print('+');
	        System.out.print(b);
	        System.out.println("="+(a+b));
	    }
	    if(f==1)
	    {
	        System.out.print(a);
	        System.out.print('-');
	        System.out.print(b);
	        System.out.println("="+(a-b));
	        if(a-b<0)
	        {       	
	        	System.out.println("此次计算式式子结果为负数。");
	        }
	    } 
}

}
