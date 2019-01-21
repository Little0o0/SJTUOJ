4017. 数列操作
===
Description
---
给定一个长度为N的整数数列A(a1,a2,…,aN)，并且可以对这个数列进行一种操作：选择两个正整数l,r(1≤l≤r≤N)，将al,al+1,…,ar同时加上一或者同时减去一。 再给定一个长度为N的整数数列B(b1,b2,…,bN)，要求用最少的操作次数将数列A变成数列B。

Input Format
--
输入共三行。

第一行包含一个正整数N。

第二行包含N个整数，表示数列A。

第三行包含N个整数，表示数列B。

Output Format
---
输出共一行，包含一个正整数，表示最少需要的操作次数。

Sample Input 1
---
	3
	3 4 5
	6 7 8
Sample Output 1
-----
	3
Sample Input 2
-----
	4
	1 2 3 4
	3 1 1 0
Sample Output 2
---
	6
Sample Input 3
---
	4
	5 4 5 5
	1 5 0 1
Sample Output 3
---
	10
Limits
------
对于40%的数据满足，N≤100，0≤|ai|,|bi|≤100； 对于80%的数据满足，N≤1000； 对于100%的数据满足，N≤100000，0≤|ai|,|bi|≤1000000。