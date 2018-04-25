package by.epam.hw11library.view;

import java.util.List;

import by.epam.hw11library.entity.PrintedEdition;

public class ViewAction {
	public static void print(Printable printObj, List<PrintedEdition> lists) {
		printObj.print(lists);
	}
}