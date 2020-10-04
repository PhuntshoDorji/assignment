import java.util.*;
public class Arraylist{
	//varaibles declared
	static int size;
	int count = 0;
	double f_1over4;
	double f_3over4;
	int array [];
	
	//constructor
	public Arraylist(int length){
		size = length;
		array =  new int [size];
		f_1over4 = 0.25;
		f_3over4 =  0.75;
	}
	//adding element in the array
	public void add(int ele)
	{
		array[count] = ele;
		count+=1;
	}
	//remove the last element in the array
	public void pop()
	{
		if (count > 0){
			array[count-1] = 0;
			count= count - 1;
		}
	}

	//resize the size of array
	public void resize()
	{
		if (count == f_1over4){
			
			int[] temp = new int [size/2];

			for (int i = 0;i<count;i++){
				temp[i]=array[i];
			}
			size = size/2;
			array = temp;
		}
		if (count == f_3over4){

			int [] temp = new int[size*2];

			for (int i=0;i<count;i++){
				temp[i] = array[i];
			}
			size = size*2;
			array = temp;
		}

	}
	//getting the array size
	public int size(){
		return size;
	}
	//converting array to string
	public String toString()
	{
		String p=Arrays.toString(array);
		return p;
	} 
	//main method
	public static void main(String[] args){
		int initial =10;
		//object 
		Arraylist x = new Arraylist(10);
		//adding elements/values
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		
	

		System.out.println("size of the array before resizing "+x.size);
		x.resize();

		System.out.println("Number of element in array bofore pop "+x.count);
		x.pop();
		System.out.println("Number of element in array after pop is "+x.count);

		System.out.println("Size of array: " +x.size());
		System.out.println("Array Converted to String: " +x.toString());
		System.out.println("All test are passed");

	}

}