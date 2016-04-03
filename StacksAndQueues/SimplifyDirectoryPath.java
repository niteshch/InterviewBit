package StacksAndQueues;

import java.util.Stack;

/*
Simplify Directory Path
Given an absolute path for a file (Unix-style), simplify it.

Examples:

path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"
Note that absolute path always begin with ‘/’ ( root directory )
Path will not have whitespace characters.
 */
public class SimplifyDirectoryPath {
	public String simplifyPath(String a) {
	    if(a.length() == 0){
	        return a;
	    }
	    final String BLANK = "";
	    final String DOT = ".";
	    final String DOUBLE_DOT = "..";
	    final String FORWARD_SLASH = "/";
	    String[] tokens = a.split("/");
	    Stack<String> dirStack = new Stack<String>();
	    StringBuffer output = new StringBuffer();
	    for(String token: tokens){
	        if(!BLANK.equals(token)){
	            if(DOT.equals(token)){
	                continue;
	            }else if(DOUBLE_DOT.equals(token)){
	                if(!dirStack.isEmpty()){
	                    dirStack.pop();
	                }
	            }else{
	                dirStack.push(token);
	            }
	        }
	    }
	    while(!dirStack.isEmpty()){
	        String dir = dirStack.pop();
	        output.insert(0,(FORWARD_SLASH+dir));
	    }
	    if(output.length() == 0){
	        return FORWARD_SLASH;
	    }else{
	        return output.toString();
	    }
	}
}
