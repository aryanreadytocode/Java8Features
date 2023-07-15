package lambda_exp;

import java.util.ArrayList;
import java.util.Collections;

public class LambdaWithCollection {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Before Sorting :"+al);
        Collections.sort(al, (o1, o2) -> (o1<o2) ? -1: o1>o2 ? 1: 0);
        System.out.println("After Sorting :"+al);
    }


}


