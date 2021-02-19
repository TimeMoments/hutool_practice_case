package com.rj.bd.datas;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.BetweenFormatter.Level;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
/**
 * @desc 日期类的使用
 * @author HYZ
 * @time  2021年2月8日
 */
public class DateUtiles {
	public static void main(String[] args) {
		/*//1.Date、long、Calendar之间的转换
		//当前时间
		Date date = DateUtil.date();
		System.out.println("Date: "+date);
		//当前时间
		Date date2 = DateUtil.date(Calendar.getInstance());
		System.out.println("Calendar->Date: "+date2);
		//当前时间
		Date date3 = DateUtil.date(System.currentTimeMillis());
		System.out.println("long->Date: "+date3);
		//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String now = DateUtil.now();
		System.out.println("yyyy-MM-dd HH:mm:ss格式: "+now);
		//当前日期字符串，格式：yyyy-MM-dd
		String today= DateUtil.today();
		System.out.println("yyyy-MM-dd格式: "+today);*/
		
		/*//2.字符串转换日期
		//常用转换格式
		 //yyyy-MM-dd HH:mm:ss
		 //yyyy-MM-dd
		 //HH:mm:ss
		 //yyyy-MM-dd HH:mm
		 //yyyy-MM-dd HH:mm:ss.SSS 
		 
		String dateStr = "2021年2月7日";
		Date date = DateUtil.parse(dateStr);
		System.out.println("默认格式:"+date);
		String dateStr2 = "2021-02-07";
		Date date2 = DateUtil.parse(dateStr2,"yyyy-MM-dd");
		System.out.println("自定义日期格式:"+date2);*/
		
		/*3.日期格式化输出
		String dateStr = "2021-02-07";
		Date date = DateUtil.parse(dateStr);
		System.out.println(date);
		//结果 : 2021/02/07
		String format = DateUtil.format(date, "yyyy/MM/dd");
		System.out.println(format);
		//常用格式的格式化，结果 : 2021-02-07
		String formatDate = DateUtil.formatDate(date);
		System.out.println(formatDate);
		//结果 : 2021-02-07 00:00:00
		String formatDateTime = DateUtil.formatDateTime(date);
		System.out.println(formatDateTime);
		//结果 : 00:00:00
		String formatTime = DateUtil.formatTime(date);
		System.out.println(formatTime);*/
		
		/*//4.日期时间差
		String dateStr1 = "2021-02-01 08:33:23";
		Date date1 = DateUtil.parse(dateStr1);

		String dateStr2 = "2021-02-07 23:33:23";
		Date date2 = DateUtil.parse(dateStr2);

		//相差天数为:6
		long betweenDay = DateUtil.between(date1, date2, DateUnit.DAY);
		System.out.println("相差天数为: "+betweenDay);*/
		
		
		/*//5.格式化时间差*/
		Date date1 = DateUtil.parse("2021-02-01 08:33:23");//转换成日期格式
		Date date2 = DateUtil.parse("2021-02-07 14:27:24");
		long between = DateUtil.between(date1, date2, DateUnit.MS);//格式化日期差
		//Level.MINUTE表示精确到分
		String formatBetween = DateUtil.formatBetween(between, Level.MINUTE);//日期差精确到分钟
		//输出: 6天5小时54分
		System.out.println(formatBetween);

	}
}
