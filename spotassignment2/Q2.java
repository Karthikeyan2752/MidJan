package com.spotassignment2;

import java.util.PriorityQueue;

class Pair {
	Integer number;
	String word;

	Pair(Integer number, String word) {
		this.number = number;
		this.word = word;
	}

}
public class Q2 {

	public static void sortString() {

	}

	public static void input() {
		PriorityQueue<Pair> pq = new PriorityQueue<>((Pair p1, Pair p2) -> p1.number - p2.number);
		pq.add(new Pair(4, "that"));
		pq.add(new Pair(3, "be"));
		pq.add(new Pair(0, "to"));
		pq.add(new Pair(1, "be"));
		pq.add(new Pair(5, "question"));
		pq.add(new Pair(1, "or"));
		pq.add(new Pair(2, "not"));
		pq.add(new Pair(4, "is"));
		pq.add(new Pair(2, "to"));
		pq.add(new Pair(4, "the"));
		for (Pair p : pq) {
			System.out.print(p.word + " ");
		}
	}

	public static void main(String[] args) {
		input();

	}

}
