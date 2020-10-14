package main;

import java.io.IOException;
import java.util.List;

import activityselection.Activity;
import activityselection.ActivitySelection;
import file.File;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File();
		ActivitySelection activitySelection = new ActivitySelection();
		List<Activity> activities = file.readFile();
		
		List<Activity> result = activitySelection.select(activities);
		
		file.writeFile(result);
	}
}
