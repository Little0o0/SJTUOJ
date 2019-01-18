/*
 * 加法
Description
这道题和大家熟知的A+B的唯一区别是在输入信息中加入了很多空格什么的。

Input Format
输入仅有一行，原有的信息保证A+B的格式:例如 12324+3532 但可能在中间加入了一些无用的空格，原数据的相对位置不变 保证A,B为正整数，并且输入数据不找过1Kb 保证60%的数据没有多余空格

Output Format
输出一行: 如果答案大于10^8输出"Large"（不包括引号）,否则直接输出答案

Sample Input
1 +   2

Sample Output
3
 * 
 * */
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = new String(sc.nextLine());
		string = string.replace(" ", "");  //去除空格
		
		BigInteger a = new BigInteger(string.substring(0, string.indexOf('+')));  //分离
		BigInteger b = new BigInteger(string.substring(string.indexOf('+')+1));
		
		if(a.add(b).compareTo(new BigInteger("100000000"))==1) System.out.println("Large"); //相加
		else System.out.println(a.add(b));
	}
}
