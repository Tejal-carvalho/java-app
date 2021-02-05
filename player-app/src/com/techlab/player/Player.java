package com.techlab.player;

public class Player {
	private static int autoid=100;
	private String name;
	private int age;
	private int id;


	public Player(String name, int age) {
		this.name = name;
		this.age = age;
		id=autoid++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player whoIsElder(Player p_arr[]) {
		int temp = p_arr[0].getAge();
		Player p = p_arr[0];
		for (int i = 1; i < p_arr.length; i++) {
			if (p_arr[i].getAge() > temp) {
				temp = p_arr[i].getAge();
				p = p_arr[i];
			}
		}
		return p;

	}

}
