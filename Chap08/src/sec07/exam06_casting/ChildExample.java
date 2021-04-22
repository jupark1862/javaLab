package sec07.exam06_casting;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method1();
		parent.field2 = "data2";
		
		
		Child child = (Child)parent;
		child.field1 = "data1";
		child.method1();
		child.method2();
		child.field2 = "data3";
	}

}
