package sec07.exam04_other_constructor_call;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	
	int maxSpeed;
	
	//������ �����ε�
	//this():�ڽ��� �����ڸ� ȣ���Ѵ�.
	//this: �ڽ��� ��ü�� ��Ī�Ѵ�.
	//super(): �θ� ��ü�� �����߸� ȣ���Ѵ�.
	//super: �θ� ��ü�� ��Ī�Ѵ�.
	Car() {}
	
	Car(String model){
		//this.model = model;
		this(model, null, 0);
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed){
		//this.model = model;
		//this.color = color;
		//this.maxSpeed = maxSpeed;
		this(model, color, maxSpeed);
	}
}
