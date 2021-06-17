// 3) part 2
public class GrandChildren_Data implements Comparable<GrandChildren_Data> {
	private String name;
	private String pulse;
	private int steps, bp_systolic, bp_diastolic, kms_cycled, minutes_cycled;

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) throws StepsCountException {
		if (steps < 100) {
			throw new StepsCountException("Number of Steps is less than 100");
		}
		this.steps = steps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPulse() {
		return pulse;
	}

	public void setPulse(String pulse) {
		this.pulse = pulse;
	}

	public int getBp_systolic() {
		return bp_systolic;
	}

	public void setBp_systolic(int bp_systolic) {
		this.bp_systolic = bp_systolic;
	}

	public int getBp_diastolic() {
		return bp_diastolic;
	}

	public void setBp_diastolic(int bp_diastolic) {
		this.bp_diastolic = bp_diastolic;
	}

	public int getKms_cycled() {
		return kms_cycled;
	}

	public void setKms_cycled(int kms_cycled) {
		this.kms_cycled = kms_cycled;
	}

	public int getMinutes_cycled() {
		return minutes_cycled;
	}

	public void setMinutes_cycled(int minutes_cycled) {
		this.minutes_cycled = minutes_cycled;
	}

	@Override
	public int compareTo(GrandChildren_Data o) {

		return this.steps - o.steps;
	}
}
