//https://www.hackerrank.com/challenges/dynamic-array/problem

package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int q = scanner.nextInt();

        int lastAnswer = 0;

        ArrayList<ArrayList<Integer>> listSeq = new ArrayList<ArrayList<Integer>>();
        for(int j=0;j<N;j++){
            listSeq.add(new ArrayList<>());
        }

        while(q-->0){

            int type = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int seq=((x^lastAnswer)%N);

            if(type==1){
                listSeq.get(seq).add(y);
            }else{
                lastAnswer = y% (listSeq.get(seq).size());
                System.out.println(lastAnswer);
            }
        }
    }
}
