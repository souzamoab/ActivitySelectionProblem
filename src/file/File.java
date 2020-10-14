package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import activityselection.Activity;

public class File {

	Path fileInPath = Paths.get("src/fileIn.txt");
	Path fileOutPath = Paths.get("src/fileOut.txt");

	public List<Activity> readFile() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileInPath.toString()));

		String line = bufferedReader.readLine();
		List<Activity> activities = new ArrayList<Activity>(Integer.parseInt(line));
		while ((line = bufferedReader.readLine()) != null) {

			String lines[] = line.split(" ");
			activities.add(new Activity(lines[0], Integer.parseInt(lines[1]), Integer.parseInt(lines[2])));

		}

		bufferedReader.close();

		return activities;
	}

	public void writeFile(List<Activity> activities) throws IOException {

		FileWriter file = new FileWriter(fileOutPath.toString(), false);

		PrintWriter printWriter = new PrintWriter(file);

		printWriter.println(activities.size());
		for(Activity activity : activities) {
			printWriter.println(activity.getLabel());
		}
		
		printWriter.close();

	}

}
