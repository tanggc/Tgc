package Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		String[] fruit = {"apple","pear","bananer"};
		for(String item : fruit){
			if(item.equals("bananer")){
				throw new TgcException("its not a fruit");
			}else{
				System.out.println(item);
			}
		}
	}

}
