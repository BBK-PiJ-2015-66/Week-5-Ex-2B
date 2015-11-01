// Recursion
int fibonacci(int nThElement) {
	if(nThElement <= 1) { 
        	return nThElement;
    	} else {
        	return fibonacci(nThElement - 1) + fibonacci(nThElement - 2);
    	}
}
print "Please enter an integer number: ";
String str = System.console().readLine();
int num = Integer.parseInt(str);
int result = fibonacci(num);
println "The fibonacci serious of " + num + " is " + result;
/*
// Iteration 
int fibonacci(int nThElement) {
	if (nThElement == 0) {
		return 0;
	} else {
		int result = 0;
		int firstNum = 1;
		for(int i = 1; i <= nThElement; i++) {			
			result = result + firstNum; 
       			firstNum = result - firstNum;
    		}
		return result;
	}
}
print "Please enter an integer number: ";
String str = System.console().readLine();
int num = Integer.parseInt(str);
int result = fibonacci(num);
println "The fibonacci serious of " + num + " is " + result;
*/