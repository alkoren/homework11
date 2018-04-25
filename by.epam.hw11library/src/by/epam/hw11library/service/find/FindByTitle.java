package by.epam.hw11library.service.find;

import java.util.List;

import by.epam.hw11library.entity.PrintedEdition;

public class FindByTitle implements Findable{
	private String title;
	
	public FindByTitle(String title) {
		this.title = title;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {

		return null;
	}

}