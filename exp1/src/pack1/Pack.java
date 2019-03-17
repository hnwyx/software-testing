package pack1;

public class Pack {
	static int size = 85;
	static int maxWeight = 83;
	static int[] pack = new int[size];
	static void initPack(int weight) {
		for(int i = maxWeight; i >= weight; i--)
		{
			if(pack[i-weight] == 1)
			{
				pack[i] = 1;
 			}
		}
	}
	public static void main() {
		
		for(int i = 0; i < size; i++)pack[i] = 0;
		pack[0] = 1;
		for(int i = 0; i < 3; i ++)
		{
			initPack(1);
		}
		initPack(50); 
		initPack(20);
		initPack(5);
		initPack(5);
		
	}
	boolean judge(int x) {
		main();
		if(x > 83) return false;
		if(pack[x] == 1){
			return true;
		}
		else{
			return false;
		}
	}
}
