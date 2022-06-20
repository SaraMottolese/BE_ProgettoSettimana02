package Class;

public class Tags {
	
	protected String [] tag= new String [30];
	
	/******************* COSTRUTTORE *************************/

	public Tags(String[] tag) {
		this.tag = tag;
	}

	
	/******************* GETTERS E SETTERS *************************/
	public String[] getTag() {
		return tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<tag.length; i++) {
			s += tag[i]+" ";
		}
		return s;
		
	}
	
	
	
	

}
