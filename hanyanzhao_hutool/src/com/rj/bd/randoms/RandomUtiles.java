package com.rj.bd.randoms;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.RandomUtil;
/**
 * @desc  随机类使用
 * @author HYZ
 * @time  2021年2月15日
 */
public class RandomUtiles {   
	public static void main(String[] args) {
		/**使用
		 *  RandomUtil.randomInt 获得指定范围内的随机数
			RandomUtil.randomBytes 随机bytes
			RandomUtil.randomEle 随机获得列表中的元素
			RandomUtil.randomEleSet 随机获得列表中的一定量的不重复元素，返回Set
			RandomUtil.randomString 获得一个随机的字符串（只包含数字和字符）
			RandomUtil.randomNumbers 获得一个只包含数字的字符串
			RandomUtil.randomUUID 随机UUID
			RandomUtil.weightRandom 权重随机生成器，传入带权重的对象，然后根据权重随机获取对象
		 */
		//部分举例
		int  result= RandomUtil.randomInt(10);//随机产生指定范围内的数字
		System.out.println("随机产生指定范围数字为: "+result);
		String result1= RandomUtil.randomString(15);//随机产生一个字符串（只包含数字与小写字母）
		System.out.println("随机产生数字和小写字母字符串为: "+result1);
		DateTime result2 = RandomUtil.randomDay(1, 10);//以当天为准，随机产生一个日期
		System.out.println("随机产生以当日为准的日期为: "+result2);
		String result3 = RandomUtil.randomStringUpper(15);//随机产生一个字符串（只包含数字与大写字母）
		System.out.println("随机产生数字和大写字母字符创为: "+result3);
		String result4 = RandomUtil.randomNumbers(15);//随机产生一个只包含数字的字符串
		System.out.println("随机产生数字的字符串为: "+result4);
		String result5 = RandomUtil.randomUUID();//随机产生UUID（已过时）
		System.out.println("随机产生UUID为: "+result5);
		
	}
}
