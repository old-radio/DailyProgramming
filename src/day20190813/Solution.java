package day20190813;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		str = scan.nextLine();
		
		str = str.replaceAll(" ", ""); //공백제거
        String[] StringSplitedArray = str.split(","); //  (,)콤마로 구분하여 String배열에 담기
        
        int [] intArray = new int[StringSplitedArray.length];  // String배열을 int 배열로 변환
        
        for(int i = 0; i<StringSplitedArray.length; i++){
        	intArray[i] = Integer.parseInt(StringSplitedArray[i]);
        }
        
        System.out.println("Answer : " + calc(intArray));

	}
	
	public static int calc(int[] arr ){
		  int maxSum = arr[0];
		  int currentSum = arr[0];
		  for(int i = 1; i < arr.length; i++) {
		    currentSum = Math.max(currentSum + arr[i], arr[i]); // 연속된 수를 더한 현재의 합
		    maxSum = Math.max(currentSum, maxSum);              // 현재의 합과 현재의 맥스값을 비교
		  }
		  return maxSum;		
	}

}
