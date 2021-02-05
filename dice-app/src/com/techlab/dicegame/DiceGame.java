package com.techlab.dicegame;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		int totalscore=0;
		int turnscore=0;
		int turn=1;
		String command;
		Random random=new Random();
		int dice;
		int max=6;
		int min=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("lets play PIG!!\nRules:\n* See how many turns it takes you to get to 20.");
		System.out.println("* Turn ends when you hold or roll a 1.");
		System.out.println("* If you roll a 1, you lose all points for the turn.");
		System.out.println("* If you hold, you save all points for the turn.");
		System.out.println("TURN: "+turn);
		while(totalscore<=20) {
			System.out.println("Roll/hold? (r/h):");
			command=sc.next();
			if(command.equalsIgnoreCase("r"))
			{
			     dice=(int) (Math.random()*(max+1-min)+min);
			     System.out.println(dice);
			     if(dice==1) {
			    	 System.out.println("Turn over. No score"); 
			    	 turnscore=0;
			    	 turn+=1;
			    	 System.out.println("TURN: "+turn);
			     }
			     else {
			    	 turnscore=turnscore+dice;
			     }
				
			}
			if(command.equalsIgnoreCase("h")) {
				totalscore=totalscore+turnscore;
				turn+=1;
				System.out.println("score for turn:"+turnscore);
				System.out.println("total score:"+totalscore);
				if(totalscore>20) {
					break;
				}
				System.out.println("\nTURN: "+turn);
				turnscore=0;
				
			}
		}
		if(totalscore>20) {
			System.out.println("you have finished in "+ turn + " turns");
		}

	}

}
