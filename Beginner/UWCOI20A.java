//UWCOI20A

/*

Well known investigative reporter Kim "Sherlock'' Bumjun needs your help! Today, his mission is to sabotage the operations of the evil JSA. If the JSA is allowed to succeed, they will use the combined power of the WQS binary search and the UFDS to take over the world!

But Kim doesn't know where the base is located. He knows that the base is on the highest peak of the Himalayan Mountains. He also knows the heights of each of the N mountains. Can you help Kim find the height of the mountain where the base is located?

Input:
First line will contain T, number of testcases. Then the testcases follow.
The first line in each testcase contains one integer, N.
The following N lines of each test case each contain one integer: the height of a new mountain.
Output:
For each testcase, output one line with one integer: the height of the tallest mountain for that test case.

Constraints
1≤T≤10
1≤N≤100000
0≤ height of each mountain ≤109
Subtasks:
100 points: No additional constraints.
Sample Input:
1
5
4
7
6
3
1
Sample Output:
7


*/


import java.util.*;
import java.lang.Math;
public class UWCOI20A{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<Integer> answer = new ArrayList<Integer>();
		while(t-->0){
            int n = sc.nextInt();
            // MaxHeap<Integer> heap = new MaxHeap<Integer>();
            // for(int i = 0; i < n; i++){
            //     heap.insert(sc.nextInt());
            // }
            // answer.add(heap.findPeak());
            int max = 0;
            for(int i = 0; i < n; i++){
                max = Math.max(max, sc.nextInt());
            }
            answer.add(max);
		}
		answer.forEach(System.out::println);
    }
}


class MaxHeap<T extends Comparable<T>>{

    LinkedList<T> linkedList;
    MaxHeap(){
        linkedList = new LinkedList<T>();
    }
    public void insert(T data){
        linkedList.add(data);
        heapify();
    }

    public void heapify(){
        if(size() != 0){
            for(int i = 0; i < size(); i++){
                int parent = (i-1)/2;
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                if(right < size() && linkedList.get(i).compareTo(linkedList.get(right)) < 0) 
                    heapifyDown(i);
                if(left < size() && linkedList.get(i).compareTo(linkedList.get(left)) < 0) 
                    heapifyDown(i);
                if(parent >= 0 && linkedList.get(i).compareTo(linkedList.get(parent)) > 0){
                    heapifyUp(i);
                }
            }
        }
    }

    private void heapifyDown(int i){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if(right < size() && linkedList.get(i).compareTo(linkedList.get(right)) < 0){
            swap(i, right);
            heapifyDown(i);
        }
        if(left < size() && linkedList.get(i).compareTo(linkedList.get(left)) < 0){
            swap(i, left);
            heapifyDown(i);
        }
    }

    private void heapifyUp(int i){
        int parent = (i-1) / 2;
        if(parent >= 0 && linkedList.get(i).compareTo(linkedList.get(parent)) > 0){
            swap(i, parent);
            heapifyUp(parent);
        }
    }

    public T findPeak(){
        return linkedList.get(0);
    }

    public void swap(int indexOne, int indexTwo){
        T data = linkedList.get(indexOne);
        linkedList.set(indexOne, linkedList.get(indexTwo));
        linkedList.set(indexTwo, data);
    }

    public int size(){
        return linkedList.size();
    }
} 