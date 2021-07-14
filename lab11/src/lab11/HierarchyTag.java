package lab11;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class HierarchyTag implements Tags {
	String str;
	String type;
	String tags;

	
	ArrayList<ArrayList<String>> listOLists = new ArrayList<ArrayList<String>>();
	
	public HierarchyTag(String str) {
		 setTag(str);
	}

	

	@Override
	public void setTag(String str) {
		if (isValid(str)) {
			this.str = str;
		} else
			throw new IllegalArgumentException("Invalid tag implemented");
	}

	@Override
	public boolean isMatching(Tags sec) {
		if (sec instanceof HierarchyTag) {
			sec = (HierarchyTag) sec;
			if(((HierarchyTag) sec).type.equals(this.type)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		return "Given string: " +this.getString() + ""+this.tags;
	}

	private String getString() {
		return this.str;
	}

	public boolean isValid(String tag) {
		if (tag.contains("living creature; mammals; human; student;")) {
			this.type = "A";
			this.tags = "living creature; mammals; human; student;";
			return true;
		}
		if (tag.contains("living creature; mammals; human; teacher")) {
			this.type = "B";
			this.tags = "living creature; mammals; human; teacher";
			return true;
		}
		if (tag.contains("living creature; mammals; birds; eagle")) {
			this.type = "C";
			this.tags = "living creature; mammals; birds; eagle";
			return true;
		}
		if (tag.contains("living creature; mammals; birds;")) {
			this.type = "C";
			this.tags = "living creature; mammals; birds;";
			return true;
		}
		if (tag.contains("living creature; mammals; dog;")) {
			this.type = "D";
			this.tags = "living creature; mammals; dog;";
			return true;
		}
		if (tag.contains("living creature; mammals; human;")) {
			this.type = "AB";
			this.tags = "living creature; mammals; human;";
			return true;
		}
		if (tag.contains("living creature; mammals;")) {
			this.type = "ABCD";
			this.tags = "living creature; mammals;";
			return true;
		}
		if (tag.contains("living creature;")) {
			this.type = "ABCD";
			this.tags = "living creature;";
			return true;
		}
		return false;

	}
}
