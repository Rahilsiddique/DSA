// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
            if (ans.size() == 1 && ans.get(0) == -1)
                System.out.print("Imaginary");
            else
                for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        int x = -1;
        int y = -1;
        ArrayList<Integer> roots = new ArrayList<Integer>(1);
        int delta = (int)Math.floor(b*b - 4*a*c);
        if(delta < 0){
            roots.add(-1);
            return roots;
        }
        x = (int)Math.floor((-b + Math.sqrt(delta))/(2*a));
        y = (int)Math.floor((-b - Math.sqrt(delta))/(2*a));
        roots.add(x);
        roots.add(y);
        Collections.sort(roots, Collections.reverseOrder());
        return roots;
    }
}