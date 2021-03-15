package adapter;

public class CoffeeMachineApp {

	public static void main(String[] args) {
		OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
		CoffeeMachineInterface coffeeMachine = new CoffeeTouchscreenAdapter(oldCoffeeMachine);
		coffeeMachine.chooseFirstSelection();
		coffeeMachine.chooseSecondSelection();

	}

}
