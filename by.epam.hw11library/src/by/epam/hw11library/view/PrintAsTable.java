package by.epam.hw11library.view;
import java.util.List;

import by.epam.hw11library.entity.PrintedEdition;
public class PrintAsTable implements Printable{

	@Override
	public void print(List<PrintedEdition> units) {
		// TODO Auto-generated method stub
		System.out.println("  Type   |   Price  ");
		for (PrintedEdition listedBook : units) {
			if (listedBook.getClass().getName().endsWith("Book")) {
				System.out.println("  Book   | " + listedBook.getPrice());
			} else {
				System.out.println("Magazine | " + listedBook.getPrice());

			}
		}
	}

	}