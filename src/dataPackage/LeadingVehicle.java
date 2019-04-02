package dataPackage;

public class LeadingVehicle {
	
	private boolean lv_present;
	private float lv_speed;
	private float lv_distance;
	
	public boolean isLv_present() {
		return lv_present;
	}
	public void setLv_present(boolean lv_present) {
		this.lv_present = lv_present;
	}
	
	public float getLv_speed() {
		return lv_speed;
	}
	public void setLv_speed(float lv_speed) {
		this.lv_speed = lv_speed;
	}
	public float getLv_distance() {
		return lv_distance;
	}
	public void setLv_distance(float lv_distance) {
		this.lv_distance = lv_distance;
	}
	public Boolean checkLv_speed(){
		if(this.lv_speed > 120 || this.lv_speed < 0)
			return false;
		return true;
	}
	public Boolean checkLv_distance(){
		if(this.lv_distance > 150 || this.lv_distance < 0)
			return false;
		return true;
	}
	

}
