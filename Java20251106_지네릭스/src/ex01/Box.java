package ex01;

public class Box<T> {
	
	T item;
	
	void setItem(T item) {
		this.item = item;
	}
	
	T getItem() {
		return item;
	}
}


/*
	- 이 Box 상자에는 car만 넣을 수 있다.
	public class Box<Car> {
	
		Car item;
	
		void setItem(Car item) {
			this.item = item;
		}
	
		Car getItem() {
			return item;
		}
	}
	- 이 Box 상자에는 toy만 넣을 수 있다.
	public class Box<T> {

		Toy item;
	
		void setItem(Toy item) {
			this.item=item;
		}
	
		Toy getItem() {
			return item;
		}
	}

*/

