package activityselection;

public class Activity {

	private String label;
	private int start;
	private int end;
	
	public Activity(String label, int start, int end) {
		super();
		this.label = label;
		this.start = start;
		this.end = end;
	}
	
	public String getLabel() {
		return label;
	}
	public int getStart() {
		return start;
	}
	public int getEnd() {
		return end;
	}
	
}
