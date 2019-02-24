package library;

public class BadLibraryItem {

	private String title;
	private int id;
	private String author;
	private int pageCount;
	private double runTime;
	private int volumeNumber;
	private String console;
	
	
	
	public BadLibraryItem(String title, 
			int id, 
			String author, 
			int pageCount, 
			double runTime, 
			int volumeNumber,
			String console) {
		super();
		this.title = title;
		this.id = id;
		this.author = author;
		this.pageCount = pageCount;
		this.runTime = runTime;
		this.volumeNumber = volumeNumber;
		this.console = console;
	}
	
	public String getTitle() {
		return title;
	}
	public int getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public int getPageCount() {
		return pageCount;
	}
	public double getRunTime() {
		return runTime;
	}
	public int getVolumeNumber() {
		return volumeNumber;
	}
	public String getConsole() {
		return console;
	}
	
	public String toString() {
		return id + " " + title + " " + pageCount + " " + console;
	}
	
	
	
	
	
}
