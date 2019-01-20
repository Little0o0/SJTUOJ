RSA
===
Description
----
RSA算法可以算是目前最著名的公钥加密算法，其原理为求两个数的乘积(p * q = N)容易而对一个数分解质因数难（N = p * q)。其加密/解密过程如下： 假设我们需要传递的信息是x，我们通过选取合适的N和e得到加密的信息 y = x ^ e mod N。其中N和e的要求为： ①N=pq，p, q为两个质数； ②gcd(e, (p-1)(q-1))=1，即e与(p-1)(q-1)互质（最大公约数为1）。 而破解该信息的方法根据这样一个公式：x = y ^ d mod N = (x ^ e) ^ d mod N, 其中d满足 ed = 1 mod (p-1)(q-1)。 dzm同学学习了RSA算法之后若有所悟：原来想要破解信息y只需要求得所给e和N对应的d就可以了。他已经知道了如何从N求出p和q，但他不知道怎么通过e，p，q求出d。于是他来问lty，lty随手写了段伪代码给dzm,并且说：你用这段扩展欧几里得算法求得的(x, y, r) = extend-Euclid(e, （p-1)(q-1)) 中的x就是你需要的d了。

Code
-----
	function extended-Euclid(a, b)
	{
	//Input: Two positive integers a and b with a >= b >= 0
	//Output: Integers x, y, d such that d = gcd(a, b) and ax + by = r
    	if b = 0 then return (1, 0, a)
    	(x, y, r) = extended-Euclid(b, a mod b)
    	return (y, x - [a / b] * y, r); 
	}
其中[a/b]为向下取整。<br>

dzm听说最近czc给wkn发了段RSA加密信息（据说和期末考试题有关），想尝试破解出这段信息（说不定有考题哦）。不过他不太确定自己破解的是不是正确，所以希望你也帮他破解一下。<br>

Input Format
----
一行,用空格隔开的四个整数y n e flag

Output Format
--
一行，一个或两个整数x 或 x d 若flag=0，则只需输出破解出的x；若flag=1，则你需要给出x 和 d。

Sample Input 1
---
	52 55 3 1
Sample Output 1
------
	13 27
Sample Input 2
----------
	8 15 7 0
Sample Output 2
------------
	2

数据范围
--------
对于30%的数据，flag = 0 对于100%的数据，1 <= y, n, e <= 10^5

HINT
-------
__1__.zyx悄悄告诉你，如果想让一个函数返回多个值，可以使用结构体struct<br>
__2__.本题只是给出了RSA算法的相关结论和公式，有关其证明有兴趣的同学可以在网上查找相关资料或查阅《算法概论》第一章。<br>
__3__.扩展欧几里得算出的d可能为负数

Link
------
<https://acm.sjtu.edu.cn/OnlineJudge/problem/4005>