Description
=====
丁姐起床以后才想起来今天要去参加步步为赢比赛第二轮，她打开比赛题目一看发现一大坨英文密码alsdifnpqwoienfskdanfpad......

丁姐和学科部的某个小盆友关系不错，所以问他要到了答案和加密的方法，加密方式如下：

__第一步：__对长度为l的明文，取它的某个约数a，将明文划分成l/a段

__第二步：__将每一段的第i个字连在一起，得到a段密文

__第三步：__按顺序将a段密文拼接在一起，得到完整密文

例子：

明文：THISISAWATERQUESTION

取a=4，分割为：THIS ISAW ATER QUES TION

每段第i个字母相连，得到4段密文：TIAQT HSTUI IAEEO SWRSN

连接密文：TIAQTHSTUIIAEEOSWRSN

话说虽然丁姐已经有了答案，但是她不能确定小盆友给她的答案是不是对的，你能帮帮她吗？

Input Format
-----
第一行：一个字符串代表明文

第二行：一个字符串代表密文

字符串长度不超过100

Output Format
-----
如果存在某个a(2<=a<=l)使得密文能够解密为明文，输出a。如果有多个a满足条件，输出最小的那个。

如果不存在这样的a，输出"No Solution"(不计引号)

Sample Input
----
	THISISAWATERQUESTION
	TIAQTHSTUIIAEEOSWRSN
Sample Output
----
	4

Link
-----
<https://acm.sjtu.edu.cn/OnlineJudge/problem/4009>