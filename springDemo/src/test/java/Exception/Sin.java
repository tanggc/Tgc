package Exception;

public class Sin {
	private Sin(){
		
	}
	
	private static class sinHolder{
		private static Sin sin = new Sin();
	}
	
	public static Sin getSin(){
		return sinHolder.sin;
	}
}
