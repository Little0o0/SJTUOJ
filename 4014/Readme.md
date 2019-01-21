4014. 奇怪的电梯2
=========
Description
----------
假设一栋高楼大厦有非常多的楼层，让每个楼中的电梯都能到达所有楼层将是一个极为不明智的设计。因此，设计师给出了一个特别的设计——大厦一共有m个电梯，每个电梯只有两个按钮，（针对第i个电梯）两个按钮分别可以使电梯向上ui层或向下di层。大厦很高，保证你永远到不了顶层，也就是说电梯没有上限，但是，电梯不可以钻入地下，也就是说是有下限的。我们将每层楼用整数标记，为了体现IT公司的特质，我们以0作为地面这一层的标记。

假设你现在在大厦的0层，仅可以选择m个电梯中的一个乘坐（不可以中途换电梯），请你计算，你按电梯中的按钮n次后（每次两个按钮选一个按），可以到达的最低楼层数。

Input Format
-----------
输入的第一行包括一个整数t（t ≤ 5），表示有t组测试数据。

对于每组测试数据，第一行包括两个整数n和m（1 ≤ n ≤ 1000000， 1 ≤ m ≤ 2000），表示按电梯按钮的次数和大厦中的电梯数量。

接下去的m行，每行包括2个由一个空格分隔的数字，分别表示了提供的m个电梯中的某一个的上行按钮上升一次的层数ui和下行按钮下降一次的层数di（1 ≤ ui, di ≤ 1000）。

Output Format
------------
对于每组测试数据，输出一个正整数，表示选用m个电梯中的一个后，在电梯里按电梯中的按钮n次后（每次两个按钮选一个按），可以到达的最低楼层数。

Sample Input
-----------
	1
	10 3
	15 4
	15 12
	7 12
Sample Output
-----------
	13
Hint
-----------
按钮上的移动楼层数无法改变，比方说从 8 层向下 9 层是不可行的。