public class Heure {
	
	private int heures ;
	private int minutes ;

	public Heure(int heures, int minutes) {
		if(heures < 0 || heures > 23){
			this.heures = 0 ;
		}
		else {
			this.heures = heures ;
		}
		if(minutes < 0 || minutes > 59){
			this.minutes = 0 ;
		}
		else {
			this.minutes = minutes ;
		}
	}
	
	public int getHeures() {
		return heures;
	}
	
	public void setHeures(int heures) {
		this.heures = heures;
	}
		
	public int getMinutes() {
		return minutes;
	}
	
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
