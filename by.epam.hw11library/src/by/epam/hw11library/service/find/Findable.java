package by.epam.hw11library.service.find;

import java.util.List;

import by.epam.hw11library.entity.PrintedEdition;

public interface Findable {
	List<PrintedEdition> find(List<PrintedEdition> units);
}