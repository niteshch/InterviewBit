package Strings;
/*
Compare Version Numbers
Compare two version numbers version1 and version2.

If version1 > version2 return 1,
If version1 < version2 return -1,
otherwise return 0.
You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 1.13 < 1.13.4
 */
public class CompareVersionNumbers {
	public int compareVersion(String a, String b) {
	    String[] aSplit = a.split("\\.");
	    String[] bSplit = b.split("\\.");
	    int m = aSplit.length;
	    int n = bSplit.length;
	    if(m > n){
	        return compareVersion(aSplit, m, bSplit, n);
	    }else{
	        return (-compareVersion(bSplit, n, aSplit, m));
	    }
	}
	private int compareVersion(String[] aSplit, int m, String[] bSplit, int n){
	    for(int i = 0; i < n; i++){
	        String s1 = aSplit[i];
	        String s2 = bSplit[i];
	        s1 = removeLeadingZeros(s1);
	        s2 = removeLeadingZeros(s2);
	        int res = compareNumberString(s1,s2);//s1.compareTo(s2);
	        if(res < 0){
	            return -1;
	        }else if(res > 0){
	            return 1;
	        }
	    }
	    if(m != n){
	        for(int i = n; i < m; i++){
	            String s1 = aSplit[i];
	            s1 = removeLeadingZeros(s1);
	            if(!s1.isEmpty()){
	                return 1;
	            }
	        }
	    }
        return 0;
	}
	private String removeLeadingZeros(String s){
	    if(s.startsWith("0")){
	        StringBuffer sb = new StringBuffer(s);
	        for(int i = 0; i < sb.length(); i++){
	            if(sb.charAt(i) == '0'){
	                sb.deleteCharAt(i);
	            }else{
	                break;
	            }
	        }
	        return sb.toString();
	    }
	    return s;
	}
	
	private int compareNumberString(String s1, String s2){
	    int m = s1.length();
	    int n = s2.length();
	    if(m > n){
	        return compareNumberString(s1, m, s2, n);
	    }else{
	        return (-compareNumberString(s2, n, s1, m));
	    }
	}
	private int compareNumberString(String s1, int m, String s2, int n){
	    if(m != n){
	        return 1;
	    }
	    for(int i = 0; i < n; i++){
	        char c1 = s1.charAt(i);
	        char c2 = s2.charAt(i);
	        if(c1 < c2){
	            return -1;
	        }else if(c1 > c2){
	            return 1;
	        }
	    }
        return 0;
	 }
}
