//1) END
import java.util.Collections;
import java.util.List;

public class GrandChildren_Details {

	public void getNormalBPChildrens(List<GrandChildren_Data> data) {
		data.forEach(temp->{
			if(temp.getBp_systolic()>=115&&temp.getBp_systolic()<=125&&temp.getBp_diastolic()>=75&&temp.getBp_diastolic()<=85) {
				System.out.println("Name :"+temp.getName());
				System.out.println("Pulse :"+temp.getPulse());
				System.out.println("BP :"+temp.getBp_systolic()+"/"+temp.getBp_diastolic());
				System.out.println("Steps :"+temp.getSteps());
			}
		});
	}
	
	public void getMaxStepsWalked(List<GrandChildren_Data> data) {
		Collections.sort(data);
		
		
		System.out.println("Name :"+data.get(0).getName());
		System.out.println("Pulse :"+data.get(0).getPulse());
		System.out.println("BP :"+data.get(0).getBp_systolic()+"/"+data.get(0).getBp_diastolic());
		System.out.println("Steps :"+data.get(0).getSteps());
	}
}
