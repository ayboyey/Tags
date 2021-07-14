package lab11;

public class TermBagTag implements Tags {

	// Interesting;to-do;must read; June ;
	// B.to-do;Monday 12; June ;buy it ;
	// C.buy it; color blue; Susan ;June ;

	String[] arr = { "interesting; to-do; must read; june;", "to-do; monday 12; june; buy it ;",
			"buy it; color blue; susan; june ;" };

	String str;
	String type="";

	public TermBagTag(String str) {
			setTag(str);
	}

	private boolean isValid(String str) {
		str=str.toLowerCase();
		
		if (arr[0].contains(str)) {
			this.type += "A";
		}
		if (arr[1].contains(str)) {
			this.type += "B";
		}
		if (arr[2].contains(str)) {
			this.type += "C";
		}
		return this.type=="" ? false : true;
	}

	@Override
	public void setTag(String str) {
		if(isValid(str)) {
			this.str=str;
		}else
			throw new IllegalArgumentException("Invalid tag implemented");
	}

	@Override
	public boolean isMatching(Tags sec) {
		if (sec instanceof TermBagTag) {
			sec = (TermBagTag) sec;
			if(((TermBagTag) sec).type.equals(this.type)) {
				return false;
			}
		}
		return false;
	}
}
