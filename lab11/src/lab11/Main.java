package lab11;

public class Main {
	
	public static void main(String[] args) {
		HierarchyTag tag = new HierarchyTag("living creature; mammals; human;");
		TermBagTag tag2 = new TermBagTag("to-do; must read; june;");
		
		System.out.println(tag.type);
		System.out.println(tag2.type);
		
		Item i1 = new Item ("First item", tag2, tag);
		Item i2 = new Item ("First item", tag2, tag);
		SmallStock sm1 = new SmallStock(2);
		
		sm1.addItem(i1);
		sm1.addItem(i1);
		
		System.out.print(tag.toString());
		
		System.out.println(sm1.getItemCount());
		System.out.println(sm1.getItem(1));
		
		System.out.println(i1.isMatching(i2));
		System.out.println(tag.isMatching(tag));
		System.out.println(tag.isMatching(tag2));
	}

}
