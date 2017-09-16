package cn.itcast_01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author thnx1
 *
 *"dfdfjfdgfgicogdlkgjsnbvbkj",获取字符串每一个字母出现的次数，要求结果：a(5)b(4)c(3)d(2)e(1)
 *           定义一个字符串
 *			B：定义一个treemap集合
 *				key:Character
 *				Value:Integer
 *			C:	把字符串转换为字符数组
 *			D：遍历字符数组，得到每一个字符
 *			E:拿到刚才得到的字符作为key 到map中去找
 *			是null :说明该key不存在，把刚字符作为key,1作为值存储
 *			不是null :说明该key存在，值加1，重写存储该建和值
 *			遍历集合，得到key 和value.
 */

public class SetDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String line = sc.nextLine();
	
		TreeMap<Character, Integer> tMap= new TreeMap<Character, Integer>();
		char[] chs = line.toCharArray();
		for(char ch :chs)
		{
			Integer i= tMap.get(ch);
			if(i == null)
			{
				tMap.put(ch, 1);
				
			}
			else
			{
				i++;
				tMap.put(ch, i);
			}
			
		}
		
		
		StringBuffer sb = new StringBuffer();
		
		Set<Character> set = tMap.keySet();
		for(Character key: set)
		{
			Integer value = tMap.get(key);
			sb.append(key).append("(").append(value).append(")");
			
		}
		
		//tMap.put(, value);
		
		
		
		
		
		
	
	
	
	}
		
}






