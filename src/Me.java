
public class Me {
	private final String Object="Olivia";
	public class You{
		 private String name;
         public You(String name) {
            this.name=name;
        }
         public String getName() {
            return name;
        }
	}
	Boolean search_you(String Y_name){
		if(Y_name.equals(Object))
			return true;
		else
			return false;
	}
}