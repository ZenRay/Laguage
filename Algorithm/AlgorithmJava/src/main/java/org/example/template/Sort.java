package org.example.template;

public class Sort {
    public static void sort(Comparable[] a){}

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
    }

    private static void show(Comparable[] a){
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i = 0; i < a.length - 1; i++){
            if(less(a[i], a[i+1])){
                return false;
            }
        }
        return true;
    }


}
