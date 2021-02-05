package com.techlab.player.test;

import com.techlab.player.Player;

public class PlayerTest {

	public static void main(String[] args) {
	    Player p1=new Player("abc",25);
	    Player p2=new Player("abc1",26);
	    Player p3=new Player("abc2",27);
	    Player p4=new Player("abc3",28);
	    Player p5=new Player("abc4",24);
		Player[] p_arr=new Player[5];
		p_arr[0]=p1;
		p_arr[1]=p2;
		p_arr[2]=p3;
		p_arr[3]=p4;
		p_arr[4]=p5;
		p1=p1.whoIsElder(p_arr);
		System.out.println("Elder player age is:"+p1.getAge()+"\nId:"+p1.getId()+"\nName:"+p1.getName());
		
	}

}
