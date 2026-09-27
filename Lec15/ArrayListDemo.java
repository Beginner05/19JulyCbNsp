package Lec15;
import java.util.ArrayList;
import java.util.HashMap;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<>();

HashMap<Integer,Integer>map=new HashMap();
map.put(1, 10);
map.put(2, 200);
map.put(3, 20);
HashMap<Integer,Integer>res=new HashMap();
res.put(1, 10);
res.put(2, 200);
res.put(3, 20);
System.out.println(map.equals(res));
	}

}
