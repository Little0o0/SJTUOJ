Programming
====
Description
-----
dzm参加编程之美大赛，总共有n道题，每道题i有一个最晚完成时间ti，如果题目i在ti分钟内完成了，则可以得到ai的分数. 假设dzm很厉害，每道题都能在1分钟内完成，求解一个做题的安排方案，使得dzm得到的分数最高。

Input Format
----
第一行 一个整数n 第二行 n个整数t1~tn 保证ti<=n 第三行 n个整数a1~an n<=500

Output Format
----
一行一个整数，表示dzm能拿到的最高扥书

Sample Input
---
	7
	1 2 3 4 4 4 4
	1 2 3 4 4 4 4

Sample Output
----
	16

Link
----
<https://acm.sjtu.edu.cn/OnlineJudge/problem/4006>

Hint
----
创立一个数组，存储从1到tmax分钟的解题次序，把按照分数从高到低把题按照ddl为下标放入其中，如果冲突，则向前移动，到数组头则删除，直到放满为止。<br>
最后计算数组中分数和