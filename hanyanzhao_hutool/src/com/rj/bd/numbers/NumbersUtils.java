package com.rj.bd.numbers;

import java.math.BigDecimal;
import cn.hutool.core.util.NumberUtil;

/**
 * @desc   数字工具类(NumberUtil工具类)
 * 	数字工具针对数学运算做工具性封装
 * @author HYZ
 * @time  2021年2月17日
 */
public class NumbersUtils {

	public static void main(String[] args) {
		/**
		 * 	NumberUtil.add 针对double类型做加法
		 *	NumberUtil.sub 针对double类型做减法
		 *	NumberUtil.mul 针对double类型做乘法
		 *	NumberUtil.div 针对double类型做除法，并提供重载方法用于规定除不尽的情况下保留小数位数和舍弃方式。
		 *	以上四种运算都会将double转为BigDecimal后计算，
		 *	解决float和double类型无法进行精确计算的问题。这些方法常用于商业计算。
		 */
		//加法
		int a = 4;//被加数
		double b = 3.4;//加数
		double num = NumberUtil.add(a,b);//更加精确计算结果7.4
		System.out.println("加法计算结果为:"+num);
		//减法
		int c = 8;//被减数
		double d = 4.789;//减数
		double num2 = NumberUtil.sub(c,d);//更加精确计算结果3.211
		System.out.println("减法计算结果为:"+num2);
		//乘法
		double e = 5.234;//被乘数
		double f = 2.342;//乘数
		double num3 = NumberUtil.mul(e, f);//计算结果更加精确12.258028
		System.out.println("乘法计算结果为:"+num3);
		//除法
		float h = 9.232f;
		float j = 2.21f;
//		double h = 9.232;//被除数
//		double j = 2.21;//除数
		double num4 = NumberUtil.div(h, j);//提供相对精确的除法运算,当发生除不尽的情况的时候,精确到小数点后10位,后面的四舍五入
		System.out.println("除法计算结果为:"+num4);//精确到小数点后10位,即:0.0000000000  计算结果:4.1773755656
		
		/**
		 * 保留小数的方法主要有两种：
			NumberUtil.round 方法主要封装BigDecimal中的方法来保留小数，返回double，
			这个方法更加灵活，可以选择四舍五入或者全部舍弃等模式。
			
			NumberUtil.roundStr 方法主要封装String.format方法,舍弃方式采用四舍五入。
		 */
		//保留小数，且固定位数，原理依旧是四舍五入
		//round()
		double a1 = 3.2413456;
		double a2 = 4.23455357755;
		//value1代表要保留小数的数值，value2代表保留的小数位数
		BigDecimal a3 = NumberUtil.round(a1, 2);
		BigDecimal a4 = NumberUtil.round(a2, 6);
		System.out.println("保留两位小数:"+a3+"\n"+"保留六位小数:"+a4);//结果:3.24  4.234554
		//roundStr()
		double b1=123456.123456;
		double b2=123456.128456;
		//value1代表要保留小数的数值，value2代表保留的小数位数
		String b3 = NumberUtil.roundStr(b1,2);//结果:123456.12
		String b4 = NumberUtil.roundStr(b2,2);//结果:123456.13
		System.out.println("四舍五入的结果:"+b3+"\t"+b4);
		
		/**判断数字
		 *NumberUtil.isNumber 是否为数字
		 *NumberUtil.isInteger 是否为整数
		 *NumberUtil.isDouble 是否为浮点数
		 *NumberUtil.isPrimes 是否为质数
		 */
		String c1 = "中国文化";
		boolean bol1 = NumberUtil.isNumber(c1);//是否为数字
		System.out.println("判断是否为数字:"+bol1);
		String c2 = "4";
		boolean bol2 = NumberUtil.isInteger(c2);//是否为整数
		System.out.println("判断是否为整数:"+bol2);
		String c3 = "3.24f";
		Object bol3 = NumberUtil.isDouble(c3);//是否为浮点数
		System.out.println("判断是否为浮点数:"+bol3);
		int c4 =6;
		Object bol4 = NumberUtil.isPrimes(c4);//是否为质数
		System.out.println("判断是否为质数:"+bol4);
		
		/**其他方法
		 * NumberUtil.factorial 阶乘
		   NumberUtil.sqrt 平方根
           NumberUtil.divisor 最大公约数
           NumberUtil.multiple 最小公倍数
           NumberUtil.getBinaryStr 获得数字对应的二进制字符串
           NumberUtil.binaryToInt 二进制转int
           NumberUtil.binaryToLong 二进制转long
           NumberUtil.compare 比较两个值的大小
           NumberUtil.toStr 数字转字符串，自动并去除尾小数点儿后多余的0
		 */
		//较为常用方法
		//求n的阶乘，直接调用封装方法factorial(n)
		long num5 = NumberUtil.factorial(6);
		System.out.println("阶乘结果为:"+num5);
		//两个数比较(x,y)比较结果x大返回1，y大返回-1
		int num6 = NumberUtil.compare(9,6);//num6返回结果为1
		int num7 = NumberUtil.compare(3, 6);//num7返回结果为-1
		System.out.println("比较结果为:"+num6+"\t"+num7);
		//数字转换字符串
		double r1 = 3.420;
		String str = NumberUtil.toStr(r1);//转换成字符串结果为"3.42"，且小数点后多余的0一并删除  
		System.out.println("转换结果为:"+str);
	}


}
