package com.fita.team2.collections.comparator;

import java.util.Comparator;

class GetNumber implements Comparator<FitaStudent>{
	
	
	@Override
	public int compare(FitaStudent o1, FitaStudent o2) {
		return o1.number-o2.number;
	}

}
