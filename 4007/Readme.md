Brick
====
Description
-----
由于在编程之美上大展身手，dzm赢得了去ms实习的机会，但是实习生进去先要完成一样考验，那就是搬砖。 搬砖的规则很奇葩，dzm需要做的是将编号为1到n的砖从大拖车A搬到大拖车B，且一次只能搬一块砖，这个任务看似很简单，但还有特殊的要求：

__要求1：__初始状态下，A中的砖块是从上到下按顺序排成一列，最上面是砖块1，最下面是砖块n，而当一块砖块i要放到B中时， B中已有的最上面那块砖一定要是i+1（当i=n时B中应该没有砖块），也就是说砖块i只能放到砖块i+1的上面。

__要求2：__我们可以发现要求1只能在n=1时才可能满足，于是ms给了dzm一些辅助，那就是另外x个大拖车和y个小拖车，dzm可以将这些拖车作为砖块的一个中转位置 ，但同时，当砖块放到这x个大拖车时也要满足要求1，而小拖车的要求是每个小拖车里只能放一块砖。

__要求3：__假设除AB外的大推车为C，小推车为D，则砖快只能A->B (表示砖块可以从A直接到B）A->C A->D C->B C->D D->B D->C

现在我们要做的就是帮dzm算出他最多能搬多少块砖从A到B 由于可能搬砖数量会很大，最后输出的是总的砖块数对z取余

Input Format
----
一行三个正整数x,y,z 分别表示提供的中转大拖车、小拖车的数量，以及最后答案取余的对象 30%的数据 x=0 100%的数据 x<=1,000,000,000 100%的数据 y<=10000 30%的数据 z<=2 100%的数据 z<=10000

Output Format
------
一行一个整数，表示dzm最多搬砖数量对z取余的结果

Sample Input
---
	0 1 2
Sample Output
-------
	0
Sample Explain
-------
先将砖块1放到小拖车里，再将砖块2放到B，再将砖块1放到B 共2块砖 而2对2取余为0

Link
-----
<https://acm.sjtu.edu.cn/OnlineJudge/problem/4007>