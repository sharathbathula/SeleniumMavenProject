package libraries;

import org.testng.IExecutionListener;

public class Listeners implements IExecutionListener{

	@Override
	public void onExecutionFinish() {
		System.out.println("Finish Running Class Listeners");
		
	}

	@Override
	public void onExecutionStart() {
		System.out.println("Start Running Class Listeners");
		
	}

}
