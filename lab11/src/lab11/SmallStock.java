package lab11;

public class SmallStock extends Stock {

	Item[] arr;

	public SmallStock(int maxItemNo) {
		this.arr = new Item[maxItemNo];
	}

	private boolean hasEmptyIndex(Item[] arr) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == null) {
				return true;
			}
			i++;
		}
		return false;
	}

	private int emptyIndex(Item[] arr) {
		int emptyIndex = 0;
		if (hasEmptyIndex(arr)) {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (arr[i] == null) {
					emptyIndex = i;
				}
			}
		}
		return emptyIndex;
	}

	@Override
	public boolean addItem(Item it) {
		if (hasEmptyIndex(this.arr)) {
			this.arr[emptyIndex(this.arr)] = it;
			return true;
		} else {
			throw new ArrayIndexOutOfBoundsException("There is no empty index");
		}

	}

	@Override
	public int getItemCount() {
		int items = 0;
		if (!hasEmptyIndex(this.arr))
			return this.arr.length;
		if (this.arr == null)
			return 0;
		for (int i = 0; i < this.arr.length; i++) {
			if (this.arr[i] != null) {
				items++;
			}
		}
		return items;
	}

	@Override
	public Item getItem(int index) {
		if(index>0&&index<this.arr.length) {
		return this.arr[index];
		} else throw new ArrayIndexOutOfBoundsException("Invalid index");
	}

}
