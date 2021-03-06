class DynamicArray
{
	private int arr[];
	private int tos;
	public DynamicArray()
        {
		arr = new int[10];
		tos=-1;
	}
	public void add(int x)
        {
		if(tos==arr.length-1)
                {
			int[] temp = new int[arr.length*2];
			int i;
                        for(i=0;i<=tos;i++)
				temp[i]=arr[i];
			arr=temp;
		}
		tos++;
                arr[tos]=x;
	}
	public void remove()
        {
	 if(tos==-1)
        {
		System.out.println("Array empty");
	}
	 else
        {
		System.out.println("Element removed is "+arr[tos--]);
		if(tos+1<=(arr.length+1)/2)
                {
			int[] temp = new int[(arr.length+1)/2];
			for(int i=0;i<=tos;i++)
				temp[i]=arr[i];
			arr=temp;
		}	
	}
	}
	public int size(){
		return tos+1;
	}
	public void print(){
		System.out.println("Elements of the array are:");
		for(int i=0;i<=tos;i++){
			System.out.println(arr[i]);
		}
	}

}
public class DynamicArrayTest
{
	public static void main(String[] args)
        {
		DynamicArray arr = new DynamicArray();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		System.out.println("Number of elements in the array is equal to " + arr.size());
		arr.print();
                arr.add(7);
                arr.add(8);
                arr.add(9);
                arr.add(10);
                arr.add(11);
                arr.add(12);
                System.out.println("Number of elements in the array is equal to " + arr.size());
		arr.remove();
		arr.remove();
                arr.remove();
                arr.remove();
                arr.remove();
                arr.remove();
                arr.remove();
		System.out.println("Number of elements in the array is equal to " + arr.size());
		arr.print();
	}
	
}
