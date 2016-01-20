import java.util.*;
public class DeDup {
public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9
										,1,2,15,12,18,10,14,20,17,16,3,6,19,13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};
	public static void main(String [] args) {
		//method1 to remove duplicates 
		int[] withoutDup = removeDupMethod1(randomIntegers);
		System.out.println(Arrays.toString(withoutDup));

		//method2 to remove duplicates
		int[] withoutDup1 = removeDupMethod2(randomIntegers);
		System.out.println(Arrays.toString(withoutDup1));

		//method3 to remove duplicates
		int[] withoutDup2 = removeDupMethod3(randomIntegers);
		System.out.println(Arrays.toString(withoutDup2));
	}

	/*This method uses hashset to remove the duplicates*/
	public static int[] removeDupMethod1 (int [] args){
		int index = 0;
		Set<Integer> intArray = new HashSet<Integer>();
		for (int i: args)
		{
			intArray.add(i);
		}
		int[] finalarray = new int[intArray.size()];
		
		for( Integer i : intArray ) {
			finalarray[index++] = i; 
		}
		return finalarray;
	}

	/*This method uses arraylist to remove the duplicates*/
	public static int[] removeDupMethod2 (int [] args){
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList1 = new ArrayList<Integer>();
		for (int j: args )
		{
			intList.add(j);
		}
		Iterator iterator = intList.iterator();
		
        while (iterator.hasNext())
        {
            Integer intNum = (Integer) iterator.next();
            if(!intList1.contains(intNum)){
				intList1.add(intNum);
			}
        }

		int index = 0;
		int[] finalarray = new int[intList1.size()];
		
		for( Integer i : intList1 ) {
			finalarray[index++] = i; 
		}
		return finalarray;
	}

	/*This method remove the duplicates using Arrays*/
	public static int[] removeDupMethod3 (int [] args){
	int index = 0;
	Arrays.sort(args);
	int[] finalarray = new int[args.length];
	int previous = finalarray[0];  
    finalarray[0] = previous; 
	for(int i:randomIntegers){  
              if(previous != i){  
                  finalarray[index++] = i;  
              }  
              previous = i;  
          }  
	finalarray= Arrays.copyOf(finalarray, index);
	return finalarray;
	}
}