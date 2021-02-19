package com.rj.bd.strings;

import cn.hutool.core.util.StrUtil;

/**
 * @desc 字符串使用
 * @author HYZ
 * @time  2021年2月9日
 */
public class StringSub {

	public static void main(String[] args) {
		/*//1.判断字符串是否为空*/
		String str = "";
		String str1 = "传承";
		boolean result = StrUtil.hasEmpty(str);//判断为空
		boolean result2 = StrUtil.hasBlank(str);//判断为空
		boolean result3 = StrUtil.hasEmpty(str1);//判断不为空
		boolean result4 = StrUtil.hasBlank(str1);//判断不为空
		System.out.println("hasEmpty结果: "+result+"\t"+result3);
		System.out.println("hasBlank结果: "+result2+"\t"+result4);
		System.out.println("===================");
		
		//hasEmpty与hasBlank的区别:
		//hasEmpty只判断是否为null或者空字符串（""）,hasBlank则会把不可见字符也算做空，isEmpty和isBlank同理。
		String str2 = " ";
		String str3 = " ";
		boolean result5 = StrUtil.hasEmpty(str2);//判断不为空
		boolean result6 = StrUtil.hasBlank(str3);//判断为空
		System.out.println("hasEmpty与hasBlank区别结果: "+result5+"\t"+result6);
		
		
		/*//2.sub字符串的截取: index支持负数，-1代表最后一个字符
		String str = "asdfghjkl";
		String str1 = StrUtil.sub(str, 1, 3); //strSub1 -> sd
		String str2 = StrUtil.sub(str, 2, -3); //strSub2 -> dfgh
		String str3 = StrUtil.sub(str, 3, 1); //strSub2 -> sd
		System.out.println(str1+"\t"+str2+"\t"+str3);*/
	}

}
