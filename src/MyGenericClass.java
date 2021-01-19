
public class MyGenericClass <T>{
	T x;
	
	MyGenericClass(T x) {
		this.x = x;		
	}
	
	public T getVal() {
		return x;
	}
}
