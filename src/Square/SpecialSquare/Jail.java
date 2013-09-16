package Square.SpecialSquare;



public class Jail extends SpecialSquare{
	
	public JailState state;
	
	public void landOnJail(GoToJail gojail){
		occupied = true;
		if (!gojail.jail){
			state = JailState.JustVisiting;
		} else {
			state = JailState.InJail;
		}
	}

}
