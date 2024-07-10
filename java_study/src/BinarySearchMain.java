
public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper (int - Integer)
		// Integer i = new Integer(10) ; int sum = i + 10 ; print(sum)
		// 객체비교를 통한 sorting 
		// Integer [] ary = new Integer[10] ;  ary[i].equals(ary[j]) ; 
		
		/*
		Integer [] ary = new Integer[14] ; 
		// Math.random() 난수 발생시키고 값을 배열에 할당.
		for(int i = 0 ; i < ary.length ; i++) {
			ary[i] = (int)(Math.random() * 100) + 1 ;
		}
		*/
		
		Integer [] ary = {1, 3, 4, 5, 7, 9, 10, 11, 13, 15, 16, 18, 19, 20} ;
		int target = 7 ;
		aryPrt(ary);
		
		/*
		이진탐색 개념 정리
		- 중앙값의 인덱스를 필요
		- 찾고자하는 데이터(target)
		- low(0) , high(ary.length - 1) 
		- mid 값을 조절하면서 반복(재귀)
		종료조건
		- 데이터 검색 성공시 종료
		- 데이터 검색 실패시 종료
		- 더 이상 검색할 데이터가 없을 경우(반복, 재귀)
 		*/
		/*
		int low  = 0 ;
		int high = ary.length -1 ; 
		int mid  = low + ((low + high) / 2) ; 
		int target = 7 ; 
		System.out.println("mid index = " + mid + "\t" + ary[mid] );  
		if(target == ary[mid]) {
			System.out.println("탐색 완료되었습니다.");
		} else if( target < ary[mid] ) {
			high = mid - 1 ; 
		} else {
			low = mid + 1 ;
		} 
		System.out.println("low  = " + low ); 
		System.out.println("high = " + high );
		System.out.println("찾고자하는 데이터가 중앙값보다 작아서 다시 중앙값을 조절 >>> "); 
		
		mid =  low + ((low + high) / 2) ; 
		System.out.println("mid index = " + mid + "\t" + ary[mid] );  
		
		if(target == ary[mid]) {
			System.out.println("탐색 완료되었습니다.");
		} else if( target < ary[mid] ) {
			high = mid - 1 ; 
		} else {
			low = mid + 1 ;
		}
		System.out.println("low  = " + low ); 
		System.out.println("high = " + high );
		*/
		// int findIdx = search(ary, target); 
		int findIdx = search(ary, target, 0, ary.length - 1);
		if(findIdx != -1) {
			System.out.println("target  : " + target);
			System.out.println("탐색 완료 : " + ary[findIdx] + " , index : " + findIdx);
		} else {
			System.out.println("탐색 실패 : " + findIdx ); 
		}
	}
	
	// 재귀구문>>>>>>
	public static int search(Integer [] ary , int target , int start, int finish) {
		if(finish <= start) {
			return -1 ;
		}
		int mid = (start + finish) / 2  ; 
		if( target == ary[mid] ) {
			return mid ; 
		}
		if( target < ary[mid] ) {
			return search(ary, target, start, mid - 1);
		} else {
			return search(ary, target, mid + 1, finish);
		}
	}
	
	// 반복구문>>>>>>
	// return value : index 
	public static int search(Integer [] ary , int target) {
		int low  = 0 ; 
		int high = ary.length -1 ; 
		int mid  = 0 ; 
		while(low <= high) {
			mid =  low + ((high - low) / 2) ; 
			if(target == ary[mid]) {
				return mid ;
			} else if( target < ary[mid] ) {
				high = mid - 1 ; 
			} else {
				low = mid + 1 ;
			}
		}
		return -1 ; 
	}
	
	public static void aryPrt(Integer [] ary) {
		System.out.println("정렬전 데이터 >>>> ");
		for(Integer data : ary) {
			System.out.print(data + "\t");
		}
		System.out.println();
	}
	
}




