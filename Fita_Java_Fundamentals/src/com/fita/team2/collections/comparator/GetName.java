package com.fita.team2.collections.comparator;

import java.util.Comparator;

class GetName implements Comparator<FitaStudent>{
	
	public int compare(FitaStudent o1, FitaStudent o2) {
		return o1.name.compareTo(o2.name);
	}

}
