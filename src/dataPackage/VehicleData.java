package dataPackage;

import java.lang.annotation.Retention;

public class VehicleData {
	

	private float currentSpeed;
	private String currentState;
	
	public String getCurrentState() {
		return currentState;
	}
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	
	public float getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(float currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public Boolean checkCurrentSpeed(){
		if(this.currentSpeed > 120 || this.currentSpeed < 0 )
			return false;
	    return true;
	}

}
