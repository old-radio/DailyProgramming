package day20190813;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String str = "";
		str = scan.nextLine();
		
		str = str.replaceAll(" ", ""); //��������
        String[] StringSplitedArray = str.split(","); //  (,)�޸��� �����Ͽ� String�迭�� ���
        
        int [] intArray = new int[StringSplitedArray.length];  // String�迭�� int �迭�� ��ȯ
        
        for(int i = 0; i<StringSplitedArray.length; i++){
        	intArray[i] = Integer.parseInt(StringSplitedArray[i]);
        }
        
        System.out.println("Answer : " + calc(intArray));

	}
	
	public static int calc(int[] arr ){
		  int maxSum = arr[0];
		  int currentSum = arr[0];
		  for(int i = 1; i < arr.length; i++) {
		    currentSum = Math.max(currentSum + arr[i], arr[i]); // ���ӵ� ���� ���� ������ ��
		    maxSum = Math.max(currentSum, maxSum);              // ������ �հ� ������ �ƽ����� ��
		  }
		  return maxSum;		
	}

}
