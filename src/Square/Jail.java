package Square;


public class Jail extends SpecialSquare{
	
	public GoToJail gojail;
	public JailState state;
	
	public void landOnJail(){
		
		if (gojail.jail = true){
			state = JailState.InJail;
		} else {
			state = JailState.JustVisiting;
		}
	}

}
