package libraries;

import org.testng.IExecutionListener;

public class Listeners2 implements IExecutionListener{

	@Override
	public void onExecutionFinish() {
		System.out.println("Finish Running Class Listeners Second");
		
	}

	@Override
	public void onExecutionStart() {
		System.out.println("Start Running Class Listeners Second");
		
	}

}
