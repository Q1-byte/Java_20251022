package ex04;

import java.util.Arrays;

/*
 *  1.배열 10개 방에 랜덤하게 1~100사이 값을 저장
 *  2.배열에서 최대값, 최소값을 출력
 *  3.배열 10개 값 총점 / 평균 구하기
 *  4.10개 값을 정렬 (오름차순)
 */
public class 연습문제02 {

	public static void main(String[] args) {
		
		int[] iArr = new int[10];
		
		for(int i=0; i<10; i++) {
			iArr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(iArr));
		
		int max, min;
		max = min = iArr[0];
		for(int i=0; i<iArr.length; i++) {
			
			if(max < iArr[i])
			max=iArr[i];
			
			if(min > iArr[i])
			min=iArr[i];
		
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<10; i++)
		sum += iArr[0];
		avg = (double)sum/iArr.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr.length -i -1; j++) {
				if(iArr[j]>iArr[j+1]) {
					int t = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = t;
				}
			}
			
		}
		System.out.println("정렬 : " + Arrays.toString(iArr));
	}

}
