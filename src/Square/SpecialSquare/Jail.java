package Square.SpecialSquare;



public class Jail extends SpecialSquare{
	
	public GoToJail gojail;
	public JailState state;
	
	public void landOnJail(){
		gojail = new GoToJail();
		if (gojail.jail){
			state = JailState.InJail;
		} else {
			state = JailState.JustVisiting;
		}
	}

}
