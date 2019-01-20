import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main implements Comparator<problem> {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();   //n为问题数
		int tmax = 0 , tmp;		//tmax 为最长时间数,由于一分钟只能解决一个问题,ddl最大的应为能解决问题的个数
		
		List<problem> p = new ArrayList<>(); //问题list 其中problem里储存的是分数和时间(ddl)
		
		for (int i = 0; i < n; i++) {	   //初始化list中的时间 并且求出最长的ddl
			tmp = sc.nextInt();
			p.add(new problem(tmp));
			if(tmax<tmp) tmax = tmp;
		}
		
		for (problem problems : p) {	//初始化list中的分数
			problems.setA(sc.nextInt());
		}
		
		Main comparator = new Main();	//按照分数从大到小进行排序
		p.sort(comparator);
		
		
		int[] score = new int[tmax];	//score 数组为要解决问题的分数
		
		for (int i = 0; i < n; i++) {  //把每一个问题加入score中
			add(score , p.get(i).score , p.get(i).time-1);
		}
		
		int output = 0;
		for (int i : score) {	 //极速计算最终分数
			output = output + i; 
		}
		
		System.out.println(output);
	}
	
	
	//add为把问题按分数从大到小加入score中, 先按照时间ddl加 ,该处已经有问题就向前移动一个,直到空位置或者移动到顶端,到顶端就表示这个问题不能解决
	private static void add(int[] s, int score, int time) {  
		
		if(time == -1) return;
		if(s[time] == 0) s[time] = score;
		else add(s,score,time-1);
	}

	@Override
	public int compare(problem o1, problem o2) {  //重写比较器
		if (o1.score == o2.score)
			return 0;
		else if (o1.score < o2.score)
			return 1;
		else
			return -1;
	}

}

class problem {  //problem类
	int score;
	int time;

	public void setA(int a) {
		score = a;
	}

	public void setT(int t) {
		time = t;
	}
	
	public problem(int t) {
		time = t;
	}
	
}