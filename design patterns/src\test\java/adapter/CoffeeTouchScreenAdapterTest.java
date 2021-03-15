package adapter;

import org.junit.Test;

public class CoffeeTouchScreenAdapterTest {
	

	@Test
	public void test1 () {
		OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
		CoffeeMachineInterface coffeeMachine = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
		coffeeMachine.chooseFirstSelection();
		coffeeMachine.chooseSecondSelection();
	}
	
}