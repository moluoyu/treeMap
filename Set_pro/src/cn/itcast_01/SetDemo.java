package cn.itcast_01;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 
 * @author thnx1
 *
 *"dfdfjfdgfgicogdlkgjsnbvbkj",��ȡ�ַ���ÿһ����ĸ���ֵĴ�����Ҫ������a(5)b(4)c(3)d(2)e(1)
 *           ����һ���ַ���
 *			B������һ��treemap����
 *				key:Character
 *				Value:Integer
 *			C:	���ַ���ת��Ϊ�ַ�����
 *			D�������ַ����飬�õ�ÿһ���ַ�
 *			E:�õ��ղŵõ����ַ���Ϊkey ��map��ȥ��
 *			��null :˵����key�����ڣ��Ѹ��ַ���Ϊkey,1��Ϊֵ�洢
 *			����null :˵����key���ڣ�ֵ��1����д�洢�ý���ֵ
 *			�������ϣ��õ�key ��value.
 */

public class SetDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
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






