//COMM3
/*

The Chef likes to stay in touch with his staff. So, the Chef, the head server, and the sous-chef all carry two-way transceivers so they can stay in constant contact. Of course, these transceivers have a limited range so if two are too far apart, they cannot communicate directly.

The Chef invested in top-of-the-line transceivers which have a few advanced features. One is that even if two people cannot talk directly because they are out of range, if there is another transceiver that is close enough to both, then the two transceivers can still communicate with each other using the third transceiver as an intermediate device.

There has been a minor emergency in the Chef's restaurant and he needs to communicate with both the head server and the sous-chef right away. Help the Chef determine if it is possible for all three people to communicate with each other, even if two must communicate through the third because they are too far apart.

Input
The first line contains a single positive integer T ≤ 100 indicating the number of test cases to follow. The first line of each test case contains a positive integer R ≤ 1,000 indicating that two transceivers can communicate directly without an intermediate transceiver if they are at most R meters away from each other. The remaining three lines of the test case describe the current locations of the Chef, the head server, and the sous-chef, respectively. Each such line contains two integers X,Y (at most 10,000 in absolute value) indicating that the respective person is located at position X,Y.

Output
For each test case you are to output a single line containing a single string. If it is possible for all three to communicate then you should output "yes". Otherwise, you should output "no".

To be clear, we say that two transceivers are close enough to communicate directly if the length of the straight line connecting their X,Y coordinates is at most R.

Example
Input:
3
1
0 1
0 0
1 0
2
0 1
0 0
1 0
2
0 0
0 2
2 1


Output:
yes
yes
no
*/





import java.util.*;
import java.lang.Math;
import java.io.*;
public class COMM3{
	public static void main(String args[]) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		ArrayList<String> answer = new ArrayList<String>();
		while(t-->0){
            int r = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            double r12 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
            double r13 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
            double r23 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
            
            int c = 0;
            if(r12 <= r)c++;
            if(r13 <= r)c++;
            if(r23 <= r)c++;

            if(c < 2){
                 answer.add("no");
            }else{
                 answer.add("yes");
            }
		}
        answer.forEach(System.out::println);
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // int t = Integer.parseInt(br.readLine());
        // while(t-->0) {
        //     int d= Integer.parseInt(br.readLine());
        //     String ar2[]= br.readLine().split(" ");
        //     String br2[] =  br.readLine().split(" ");
        //     String cr2[]= br.readLine().split(" ");
        //     int x1= Integer.parseInt(ar2[0]);
        //     int y1= Integer.parseInt(ar2[1]);
        //     int x2=Integer.parseInt(br2[0]);
        //     int y2=Integer.parseInt(br2[1]);
        //     int x3= Integer.parseInt(cr2[0]);
        //     int y3=Integer.parseInt(cr2[1]);
        //     double dis1= Math.sqrt((Math.pow((x1-x2), 2)) + (Math.pow((y1-y2), 2)));
        //     double dis2= Math.sqrt((Math.pow((x3-x2), 2)) + (Math.pow((y3-y2), 2)));
        //     double dis3= Math.sqrt((Math.pow((x1-x3), 2)) + (Math.pow((y1-y3), 2)));
        //     int con=0;
        //     if(dis1<=d) con++;
        //     if(dis2<=d) con++;
        //     if(dis3<=d) con++;
        //     if(con>1) {
        //         bw.write("yes\n");
        //         bw.flush();
        //     }
        //     else{
        //         bw.write("no\n");
        //         bw.flush();
        //     }



        //}
	}
}