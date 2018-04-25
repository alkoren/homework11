package by.epam.hw11library.service;


import java.util.List;

import by.epam.hw11library.entity.Library;
import by.epam.hw11library.entity.PrintedEdition;
import by.epam.hw11library.service.find.Findable;

public class LibraryService {
	
	public List<PrintedEdition> find(Library library, Findable findMatcher){
		List<PrintedEdition> units = library.getUnits();
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
}