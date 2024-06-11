package quiz01;

import java.util.*;
class Solution {
    public String[] solution(String myString) {
    	String[] a = myString.split("x");
    	Arrays.sort(a);
		return a;
    }
}