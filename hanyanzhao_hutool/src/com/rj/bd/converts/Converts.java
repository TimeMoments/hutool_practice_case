package com.rj.bd.converts;

import java.util.Date;
import java.util.List;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.CharsetUtil;
/**
 * @desc 类型转换
 * 	Convert类可以说是一个工具方法类，里面封装了针对Java常见类型的转换，用于简化类型转换。
 * 	Convert类中大部分方法为toXXX，参数为Object，可以实现将任意可能的类型转换为指定类型。
 * 	同时支持第二个参数defaultValue用于在转换失败时返回一个默认值。
 * @author HYZ
 * @time  2021年2月7日
 */
public class Converts {

	public static void main(String[] args) {
		/*//1.转换为字符串
		int a = 1;
		//str的结果:"1"
		String str = Convert.toStr(a);
		System.out.println("int类型转换为字符串类型:"+str);
		
		long[] b = {1,2,3,4,5};
		//str2的结果:"[1,2,3,4,5]"
		String str2 = Convert.toStr(b);
		System.out.println("long[]类型转换为字符串类型:"+str2);
		
		String[] c= {"1","2","中国","文化","传承"};
		//str3的结果:"[1, 2, 中国, 文化, 传承]"
		String str3 = Convert.toStr(c);
		System.out.println("String[]类型转换为字符串类型"+str3);*/
		
		
		/*//2.转换为指定类型数组
		String[] bStr = { "1", "2", "3", "4" };
		//结果为Integer数组:[Ljava.lang.Integer;@67424e82
		Integer[] intArray = Convert.toIntArray(bStr);
		System.out.println(intArray);
		long[] cLong = {1,2,3,4,5};
		//结果为Integer数组[Ljava.lang.Integer;@42110406
		Integer[] intArray2 = Convert.toIntArray(cLong);
		System.out.println(intArray2);*/
		
		/*//3.转换为日期类型
		String data = "2021-02-07";
		Date val = Convert.toDate(data);
		System.out.println(val);
		
		String data2 = "2021年2月7日";
		Date val2 = Convert.toDate(data2);
		System.out.println(val2);*/
		
		/*//4.转换为集合
		Object[] obj = {"中国",3,"传承","文化",5,1};
		//4.1.11之前使用方式
		List<?> list = Convert.convert(List.class, obj);
		System.out.println(list);
		//4.1.11之后使用方式
		List<?> list2 = Convert.toList(obj);
		System.out.println(list2);*/
		
		/*//5.半角全角转换
		//半-->全
		String st = "123456";
		String sbc = Convert.toSBC(st);
		System.out.println("半-->全:"+sbc);
		//全-->半
		String st2 = sbc;
		String dbc = Convert.toDBC(st2);
		System.out.println("全-->半:"+dbc);*/
		
		/*//6.进制转换 */
		//16进制（Hex）字符串
		String string = "中国文化传承五千年";
		String hex = Convert.toHex(string,CharsetUtil.CHARSET_UTF_8);
		System.out.println("16进制字符串:"+hex);
		//16进制转换为普通字符串
		String string2 = hex;
		//4.1.11之前
		String raw = Convert.hexStrToStr(string2, CharsetUtil.CHARSET_UTF_8);
		System.out.println("4.1.11之前转换普通字符串:"+raw);
		//4.1.11之后
		String raw2 = Convert.hexToStr(string2, CharsetUtil.CHARSET_UTF_8);
		System.out.println("4.1.11之后转换普通字符串:"+raw2);
		
		//因为字符串牵涉到编码问题，因此必须传入编码对象，此处使用UTF-8编码。 
		//toHex方法同样支持传入byte[]，同样也可以使用hexToBytes方法将16进制转为byte[]
		byte[] bt = Convert.hexToBytes(hex);//转换为byte[]类型
		String raw3 = Convert.toHex(bt);//传入byte[]
		System.out.println("16进制byte[]类型:"+raw3); 
		
		
	}
	
}
