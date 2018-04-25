package by.epam.hw11library.main;

import java.util.List;

import by.epam.hw11library.entity.Book;
import by.epam.hw11library.entity.Library;
import by.epam.hw11library.entity.Magazine;
import by.epam.hw11library.entity.PrintedEdition;
import by.epam.hw11library.service.LibraryService;
import by.epam.hw11library.service.find.FindByPrice;
import by.epam.hw11library.service.find.Findable;
import by.epam.hw11library.view.PrintAsList;
import by.epam.hw11library.view.PrintAsTable;
import by.epam.hw11library.view.Printable;
import by.epam.hw11library.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Java", 300));
		myLibrary.add(new Book("C++", 250));
		myLibrary.add(new Magazine(40, 50));
		myLibrary.add(new Magazine(20, 300));

		Findable matcher = new FindByPrice(300);

		LibraryService libService = new LibraryService();

		List<PrintedEdition> lists = libService.find(myLibrary, matcher);

		System.out.println("Found " + lists.size() + " of PrintedEdition with price 300, here is list :");
		print(new PrintAsList(), lists);
		System.out.println("");
		System.out.println("Table of PrintedEdition with price 300 :");
		print(new PrintAsTable(), lists);
	}

	public static void print(Printable printObj, List<PrintedEdition> lists) {
		printObj.print(lists);
	}

}
