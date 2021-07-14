package lab11;

public class Item {
	private String content;
	private TermBagTag bTag;
	private HierarchyTag hTag;
	
	public Item (String cont, TermBagTag tb, HierarchyTag t2){
		this.content=cont;
		this.bTag=tb;
		this.hTag=t2;
	}
	
	public Item (String cont, String sb, String t2) {
		this.content=cont;
		bTag.setTag(sb);
		hTag.setTag(t2);
	}
	
	public String toString() {
		return content + "," + bTag.str + "," + hTag.str;
	}
	
	public boolean isMatching(Item sec) {
		if (this.bTag.str == null||this.hTag.str==null) {
			return true;
		}
		if (sec.bTag.str == null||sec.hTag.str==null) {
			return true;
		}
		
		if(this.bTag.type.equals(sec.bTag.type)&&this.hTag.type.equals(sec.hTag.type)) {
			return true;
		}
		return false;
	}
	
	
}
