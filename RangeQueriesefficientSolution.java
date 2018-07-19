// Java program to find the numbers
// having atmost 3 set bits within
// a given range
import java.util.*;
import java.io.*;

public class RangeQueries {

	//Class to store the L and R range of a query
	static class Query {
		long L;
		long R;
	}

	//It returns index of first element which is grater than searched value
	//If searched element is bigger than any array element function
	// returns first index after last element.
	public static int upperBound(ArrayList<Long> validNumbers,
									Long value)
	{
		int low = 0;
		int high = validNumbers.size()-1;

		while(low < high){
			int mid = (low + high)/2;
			if(value >= validNumbers.get(mid)){
				low = mid+1;
			} else {
				high = mid;
			}
		}
		return low;
	}

	public static void answerQueries(ArrayList<Query> queries){
		// Set of Numbers having at most 3 set bits
		// arranged in non-descending order
		Set<Long> allNum = new HashSet<>();

		//0 Set bits
		allNum.add(0L);

		//Iterate over all possible combinations of i, j, k for
		// 60 bits. And add all the numbers with 0, 1 or 2 set bits into
		// the set allNum.
		for(int i=0; i<=60; i++){
			for(int j=0; j<=60; j++){
				for(int k=0; k<=60; k++){

					//For one set bit, check if i, j, k are equal
					//if yes, then set that bit and add it to the set
					if(i==j && j==k){
						allNum.add(1L << i);
					}

					//For two set bits, two of the three variable i,j,k
					//will be equal and the third will not be. Set both
					//the bits where two variabls are equal and the bit 
					//which is not equal, and add it to the set
					else if(i==j && j != k){
						long toAdd = (1L << i) + (1L << k);
						allNum.add(toAdd);
					}
					else if(i==k && k != j){
						long toAdd = (1L << i) + (1L << j);
						allNum.add(toAdd);
					}
					else if(j==k && k != i){
						long toAdd = (1L << j) + (1L << i);
						allNum.add(toAdd);
					}

					//Setting all the 3 bits
					else {
						long toAdd = (1L << i) + (1L << j) + (1L << k);
						allNum.add(toAdd);
					}

				}
			}
		}

		//Adding all the numbers to an array list so that it can be sorted
		ArrayList<Long> validNumbers = new ArrayList<>();
		for(Long num: allNum){
			validNumbers.add(num);
		}

		Collections.sort(validNumbers);

		//Answer queries by applying binary search
		for(int i=0; i<queries.size(); i++){
			long L = queries.get(i).L;
			long R = queries.get(i).R;

			//Swap L and R if R is smaller than L
			if(R < L){
				long temp = L;
				L = R;
				R = temp;
			}

			if(L == 0){
				int indxOfLastNum = upperBound(validNumbers, R);
				System.out.println(indxOfLastNum+1);
			}
			else {
				int indxOfFirstNum = upperBound(validNumbers, L);
				int indxOfLastNum = upperBound(validNumbers, R);
				System.out.println((indxOfLastNum - indxOfFirstNum +1));
			}

		}

	}

	public static void main(String[] args){
		int Q = 2;
		ArrayList<Query> queries = new ArrayList<>();

		Query q1 = new Query();
		q1.L = 3;
		q1.R = 7;

		Query q2 = new Query();
		q2.L = 10;
		q2.R = 16;

		queries.add(q1);
		queries.add(q2);

		answerQueries(queries);
	}

}