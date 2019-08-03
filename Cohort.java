import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Cohort<C extends Creature> {
	
	private Map<String, C> citizens = new HashMap<>();
	
	public int size() {
		return citizens.size();
	}
	public C getCitizenAt(String address) {
		return citizens.get(address);
	}
	public boolean isEmpty() {
		return citizens.isEmpty();
	}
	public void addNewCitizen(String address, C creature) {
		citizens.put(address, creature);
	}
	public ArrayList<C> getAllCitizensToFight() {
		ArrayList<C> arr = new ArrayList<>(citizens.values());
		Collections.sort(arr);
		return arr;
	}
	@Override
	public String toString() {
		ArrayList<C> arrForToString = this.getAllCitizensToFight();
		String poz = "";
		for(C creature : arrForToString) {
			poz += creature + "\n";
		}
		return poz;
	}
}
