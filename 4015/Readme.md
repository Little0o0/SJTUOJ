4015. 怎么还是那个数列？！
=====
Description
-----------
你费劲口舌和很多小朋友不断交换位置,好不容易来到小X大牛家，并且询问了你最困惑的那个“斐波那契数列”问题和“树的存储结构和性质”问题,准备拜谢后离开，没想到小X大牛对你印象不错，认为你很有灵气，于是乎，他就顺便出了下面这个题目给你回家思考。

一个数列定义如下：f(1) = 1，f(2) = 1，

f(n) = (A * f(n - 1) + B * f(n - 2)) mod 7。

给定A,B和n的值，要求计算f(n)的值。

Input Format
---------
输入一行包含3个整数A，B和n，1 ≤ A, B ≤ 1000,1 ≤ n ≤ 100000000)。

Output Format
----------
输出一行一个整数，即f(n)的值。

Sample Input 1
----
	1 1 3
Sample Output 1
----
	2
Sample Input 2
-----
	1 2 10
Sample Output 2
------
	5
Limits
------
20%的数据，n ≤ 1000；

40%的数据，n ≤ 100000；

100%的数据，n ≤ 100000000。

Solution
--
简单打表