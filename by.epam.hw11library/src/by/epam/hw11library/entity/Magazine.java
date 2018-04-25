package by.epam.hw11library.entity;


public class Magazine extends PrintedEdition{
	private int pageCount;
	
	public Magazine(int pageCount, double price) {
		super(price);
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + pageCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Magazine other = (Magazine) obj;
		if (pageCount != other.pageCount)
			return false;
		return true;
	}
	
	

}

