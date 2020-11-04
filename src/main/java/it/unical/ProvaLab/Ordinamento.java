package it.unical.ProvaLab;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ordinamento {
	
	public ArrayList<Integer> MyListUtil(ArrayList<Integer> l, int n){
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		if(n<20) {
			Collections.sort(l);
		}
		else {
			Collections.sort(l);
			for(int i=l.size()-1;i>=0;i--) {
				System.out.println(l.get(i));
				l2.add(l.get(i));
			}
			l.clear();
			for(int i=0;i<l2.size();i++) {
				l.add(l2.get(i));
			}
		}
		
		return l;
	}
}
