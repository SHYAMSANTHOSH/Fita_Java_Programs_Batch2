package com.fita.team2.collections.comparator;

import java.util.Comparator;

public class GetSubject implements Comparator<FitaStudent>{

	@Override
	public int compare(FitaStudent o1, FitaStudent o2) {
		return o1.subject.compareTo(o2.subject);
	}
}
