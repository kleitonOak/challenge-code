package newone;

import java.util.Arrays;

public class InverterArray {
    public static Integer[] inverterArray(Integer[] v){
        Integer[] d = new Integer[v.length];

        for(int i=0; i<v.length; i++){
            d[i] = v[v.length-(i+1)];
        }
        return d;
    }

    public static Integer[] inverterArrayInPlace(Integer[] v){
      for(int i=0; i<v.length/2; i++)
      {
          int temp = v[i];
          v[i] = v[v.length-(i+1)];
          v[v.length - (i+1)] = temp;
      }

      return v;
    }

    public static Integer[] inverterArrayInPlace2(Integer[] v){
        int l = 0;
        int r = v.length -1;

        while(l<r){
            int temp = v[l];
            v[l] = v[r];
            v[r] = temp;
            l++;
            r--;
        }

        return v;
    }


    public static void main(String[] args) {
        Integer[] v =  {1,2,3,4,5,6,7,8,9};

        System.out.println("Original array: "+ Arrays.toString(v));
        Integer[] d = inverterArrayInPlace(v);
        System.out.println("Modified array: "+ Arrays.toString(d));
    }
}
