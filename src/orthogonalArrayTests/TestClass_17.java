package orthogonalArrayTests;

import org.junit.Before;
import org.junit.Test;

import dataPackage.LeadingVehicle;
import dataPackage.UserInputs;
import dataPackage.VehicleData;
import servicePackage.SpeedController;

public class TestClass_17 {
	VehicleData vehicleData = new VehicleData();
	LeadingVehicle leadingVehicle = new LeadingVehicle();
	UserInputs userInputs = new UserInputs();
	SpeedController speedController = new SpeedController();
	
	@Before
	public void initialize(){
		System.out.println("**** Test case 17 started ****\n");
		
		userInputs.setSetSpeed(70);
		userInputs.setSetDistance(150);
		leadingVehicle.setLv_present(true);
		leadingVehicle.setLv_distance(60);
		leadingVehicle.setLv_speed(140);
		vehicleData.setCurrentSpeed(50);
	}
	
	@Test
	public void testFunction(){
		Boolean invalidData = false;
		if(!userInputs.checkSetSpeed()){
			System.out.println("Invalid inputs --> Set speed out of range");
			invalidData = true;
		}
		if(!vehicleData.checkCurrentSpeed()){
			System.out.println("Invalid inputs -->  vehicle's current speed out of range");
			invalidData = true;
		}
			
		if(leadingVehicle.isLv_present()){
			Boolean checkLVSpeed = leadingVehicle.checkLv_speed();
			Boolean checkLVDistance = leadingVehicle.checkLv_distance();
			if(!checkLVDistance){
				System.out.println("Invalid inputs --> Leading vehicle distance out of range");
				invalidData = true;
			}
				
			if(!checkLVSpeed) {
				System.out.println("Invalid inputs --> Leading vehicle speed out of range");
				invalidData = true;
			}
		}
		if(invalidData){
			System.out.println("\n**** Test case 17 ended ****\n\n");
			return ;
		}
		speedController.takeDecision(null, userInputs, leadingVehicle, vehicleData);
		//Assert.assertEquals("Accelrating", speedController.takeDecision(null, userInputs, leadingVehicle, vehicleData));
		System.out.println("\n**** Test case 17 ended ****\n\n");
	}
}
