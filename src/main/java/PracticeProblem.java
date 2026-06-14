/*

	author - Salma Danane
	date created - june 1st 2026
	date last modified - june 14th 2026
	File name - ArrayLists
	
*/

import java.util.ArrayList;
public class PracticeProblem {


	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> list,int num1, int num2) {
		
		String temp1 = list.get(num1);
		String temp2 = list.get(num2);
		
		list.set(num1, temp2);
		list.set(num2, temp1);
		
	}

	public static ArrayList<Double> createArrayList(double[] arr) {
		
		ArrayList<Double> arrL = new ArrayList<Double>();
		
		for (int i=0; i < arr.length; i++) {
			
			arrL.add(arr[i]);
		}
		
		return arrL;
	}

	public static ArrayList<Integer> mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		for (int i = 0; i < list1.size(); i++) {
			
			newArr.add(list1.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			
			newArr.add(list2.get(i));
		}
		
		return newArr;
	}

}
