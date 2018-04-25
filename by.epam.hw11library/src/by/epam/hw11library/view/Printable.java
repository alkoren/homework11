package by.epam.hw11library.view;

import java.util.List;

import by.epam.hw11library.entity.PrintedEdition;

public interface Printable {
	void print(List<PrintedEdition> units);
}