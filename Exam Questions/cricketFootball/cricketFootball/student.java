class student<T, V>{
	T obj1;
	V obj2;

	student(T obj){
		obj1 = obj;
	}

	student(T obj1, V obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	public String toString(){
		if(obj2==null)
			System.out.println(obj1);
		else{
			System.out.println(obj1);
			System.out.println(obj2);
		}
		return("");
	}
}