package testingJunit;
public class Testing {

/**
 * 2 simple functions: square return a squared value.
 * countA returns the number of 'a' or 'A' in a word.
 * @param x
 * @return
 */
	public int square(int x){
		return (x*x);
	}
	
	public int countA(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)== 'a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
}
