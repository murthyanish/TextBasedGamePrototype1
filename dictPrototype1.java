//Successful dict v1

import java.util.*;
public class dictPrototype1
{
	public static void main(String args[])
	{
		System.out.println("The room has one red ball and one blue ball. Which ball would you like to pick up?");
		Scanner sc = new Scanner(System.in);
		dict d = new dict();
		String inp;
		inp=sc.nextLine();
		System.out.println("\n"+inp);
		d.read(inp);
	}
}
class dict
{
	Map actions;
	Map objects;
	public dict(){
		actions = new HashMap();
		actions.put("examine", 1);
		actions.put("pickup", 2);
		actions.put("use", 3);
		actions.put("hold", 4);
		actions.put("throw", 5);
		objects = new HashMap();
		objects.put("red", 1);
		objects.put("blue", 2);
		System.out.println(actions+""+objects);
	}
	public void read(String a)
	{
		String words[] = a.split(" ");
		int[] codes=new int[5];
		for(int i=0;i<words.length;i++){
			if(this.actions.containsKey(words[i]))
				codes[i]=(int)actions.get(words[i]);
			else if(this.objects.containsKey(words[i]))
				codes[i]=(int)objects.get(words[i]);
		}
		int[] ex=new int[5];
		ex[0]=1;
		ex[1]=1;
		System.out.println(codes[0]+" "+codes[1]);
		if(Arrays.equals(codes, ex))
			System.out.println("\nSuccess!!");
		else
			System.out.println("\nFaliure");
	}
}
