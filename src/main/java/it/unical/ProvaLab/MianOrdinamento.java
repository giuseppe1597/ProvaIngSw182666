package it.unical.ProvaLab;

import java.util.ArrayList;
import java.util.Arrays;

public class MianOrdinamento {
	
	public static void main(String[] args) {
		ArrayList<Integer> l= new ArrayList<>();
		int n=22;
		l.add(5);
		l.add(1);
		l.add(3);
		l.add(7);
		l.add(6);
		Ordinamento o = new Ordinamento();
		System.out.println(o.MyListUtil(l, n));
	}
}
