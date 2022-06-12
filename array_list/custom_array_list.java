package array_list;
import java.util.ArrayList;
public class custom_array_list {
	
	private Object[] data;
	private int default_size = 10;
	private int size = 0;
	
	public custom_arraylist()
	{
		this.size =  new int[default_size];
	}
	
	public Object add(int num)
	{
		if(isFull())
		{
			resize();
		}
		data[size++] = num;
	}
	
	private Object resize()
	{
		int temp = new int(data.length + 2);
		
		// copy the current item in the new array
		for(int i=0;i<data.length;i++)
		{
			temp[i]= data[i];
		}
		data = temp;
		
	}
	
	private boolean isFULL()
	{
		return size = data.length;
	}
	
	public T remove()
	{
		T remove = data[size--];
		return remove;
		
	}
	
	public T get(int index)
	{
		return data[index];
	}
	
	public int size()
	{
		return size;
	}
	
	public void set(int index , int value)
	{
		data[index]= value;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList list = new ArrayList();
//		list.add(45); // element
//		list.remove(0); // index
//		list.get(0);    // index
//		list.set(1, 6789);// index , element
//		list.size();      // size of array
//		list.isEmpty();   // list is empty or not
		
//		custom_arraylist list = new custom_arraylist();
//		list.add(3);
//		list.add(5);
//		list.add(9);
//		
//		System.out.println(list);
//		
//		// arraylist generics
//		// we can add integer String float Double
//		
//		ArrayList list2 = new ArrayList();
//		list2.add("goyal");
		
		CustomGenArrayList<integer> list3 = new CustomGenArrayList();
		for(int i=0;i<14;i++)
		{
			list3.add(2*i);
		}
		
		System.out.println(list3);
		
		
		
		

	}

}
