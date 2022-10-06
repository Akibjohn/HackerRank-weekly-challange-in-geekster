/*
 * Meeting Room 1
 * 
 * You are given a meeting room which can only hold one meeting at a time. However, you are getting a lot of requests to book the meeting room. You need to find the maximum number of meetings that you can hold in the meeting room given the starting and ending times of each of meetings, such that there is no overlap (in the times) between any two meetings. Note that, if a meeting ends at a time then you cannot start another meeting at the same time. Assume that all the bookings are requested at once.

Input Format

The first line contains a single integer N (1 ≤ N ≤ 10^5 ) denoting the number of meetings. Each of the following N lines contain two space-separated integers Si and Ei (1 ≤ Si < Ei ≤ 10^9 ) denoting the starting and ending times (the i th line has the timings of the i th meeting).

Constraints

N (1 ≤ N ≤ 10^5 )
(1 ≤ Si < Ei ≤ 10^9 )
Output Format

Print a single integer X, denoting the maximum number of meetings you can hold in the meeting room without any overlap.

Sample Input 0

5
1 3
4 7
2 4
6 10
8 10
Sample Output 0

3
 */



import java.util.*;
public class ques_2 {
    public static Scanner scn = new Scanner(System.in);

  public static int meetingRooms(int intervals[][]) {
    
    // write your code here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
    for(int[] interval : intervals){
        if(pq.size() == 0){
            pq.add(interval[1]);
        }
        else{
            if(interval[0] < pq.peek()){
                pq.add(interval[1]);
            }
            else{
                pq.remove();
                pq.add(interval[1]);
            }
        }
    }
    return pq.size();
  }
  public static void main(String args[]) {
    
    // Input Format
    int n = scn.nextInt();
    int input[][] = new int[n][2];
    for (int i = 0 ; i <  n ; i++) {
      int sp = scn.nextInt();
      int ep = scn.nextInt();
      input[i][0] = sp;
      input[i][1] = ep;
    }
    // Output Format
    System.out.println(meetingRooms(input));
  }
}