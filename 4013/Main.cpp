#include<iostream>
#include<string>
#include<queue>
#include<map>
using namespace std;

struct state
{
	string num;
	string move;
}now,e;
//

queue<state>q;
//bfs

map<string,bool>m;
// 

int main()
{
	now.num="12345678"; 
	now.move="";
	m[now.num]=true;
	q.push(now);
	//
	
	e.num=now.num;
	//
	
	int tmp;
	string target="";
	for(int i=0;i<8;i++)
	{
		cin>>tmp;
		target+=char(tmp+'0');
	}
	//
	
	while(!q.empty())	//
	{
		now=q.front();	//
		q.pop();		//
		
		if(now.num==target)	// 
		{
			cout<<now.move.length()<<endl;
			cout<<now.move<<endl;
			break;
		}
		
		e.num[0]=now.num[7];
		e.num[1]=now.num[6];
		e.num[2]=now.num[5];
		e.num[3]=now.num[4];
		e.num[4]=now.num[3];
		e.num[5]=now.num[2];
		e.num[6]=now.num[1];
		e.num[7]=now.num[0];	//nextA 
		if(!m[e.num])			//
		{
			m[e.num]=true;		// 
			e.move=now.move+"A";//add"A" 
			q.push(e);			//enq 
		}
		
		e.num[0]=now.num[3]; 
		e.num[1]=now.num[0];
		e.num[2]=now.num[1];
		e.num[3]=now.num[2];
		e.num[4]=now.num[5]; 
		e.num[5]=now.num[6];
		e.num[6]=now.num[7];
		e.num[7]=now.num[4];	//nextB
		if(!m[e.num])			//
		{
			m[e.num]=true;		// 
			e.move=now.move+"B";//add "B" 
			q.push(e);			//enq
		}
		
		e.num[0]=now.num[0];
		e.num[1]=now.num[6];
		e.num[2]=now.num[1];
		e.num[3]=now.num[3];
		e.num[4]=now.num[4];
		e.num[5]=now.num[2];
		e.num[6]=now.num[5];
		e.num[7]=now.num[7];	//nextC
		if(!m[e.num])			//if not 
		{
			m[e.num]=true;		//notify
			e.move=now.move+"C";//add "C"
			q.push(e);			//enq
		}
	}
	
	return 0;
}