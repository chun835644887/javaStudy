public class Pair<T>{
	private T field1;
	private T field2'

	public Pair(){
		this.field1 = null;
		this.field2 = null;
	}
	public Pair(T field1, T field2){
		this.field1 = field1;
		this.field2 = field2;
	}
	public void setField1(T v){
		this.field1 = v;
	}
	public void setField2(T v){
		this.field2 = v;
	}
	public T getField1(){
		return this.field1;
	}
	public T getField2(){
		return this.field2;
	}
}