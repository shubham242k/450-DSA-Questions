package array;

public class kthmaxmin {

//using priortiy queue
//add items in priority queue 
	//when there's K items in queue,before adding k+1th item remove an item from priority queue
	//by that after loop only k largest element will be present in queue, so print the peek of queue.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 3, 7, 2, 6, 9, 5, 4, 21 };
		int k = 4; // means k+1 smallest element
		// pass last element as pivot
		 PriorityQueue<Integer> pq = new PriorityQueue<>();
      
	      for(int i = 0;i<n;i++){
		  if(i<k){
		     pq.add(a[i]);
		  }else{ 
		      if(a[i]>pq.peek()){
			   pq.remove();
			   pq.add(a[i]);
		      }
		  }

	      }

	      System.out.println(pq.peek());

	}

	

}
