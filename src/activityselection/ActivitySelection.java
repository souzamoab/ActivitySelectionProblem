package activityselection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ActivitySelection {

	public List<Activity> select(List<Activity> activities) {
		Collections.sort(activities, Comparator.comparingInt(Activity::getEnd));
		
		int k = 0;
		
		Set<Integer> result = new HashSet<>();
		
		result.add(0);
		
		for(int i = 1; i < activities.size(); i++) {
			if(activities.get(i).getStart() >= activities.get(k).getEnd()) {
				result.add(i);
				k = i;
			}
		}
		
		return result.stream().map(activities::get).collect(Collectors.toList());
	}
	
}
