package Lec23;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child q=new Child();
q.enQueue(10);
q.enQueue(20);
q.enQueue(30);
q.enQueue(40);
q.enQueue(50);
//q.enQueue(60);
//q.enQueue(70);
q.deQueue();
q.deQueue();
//q.deQueue();
q.enQueue(80);
q.enQueue(90);
q.enQueue(100);
//q.enQueue(110);
q.display();

	}

}
