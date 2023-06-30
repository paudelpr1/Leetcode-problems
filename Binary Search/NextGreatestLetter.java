/* https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/982555711/ */
public class NextGreatestLetter {

	public static void main(String[] args) {
		char[] letters = {'e','e','e','e','e','e','n','n','n','n','n'};
		char res = nextGreatestLetter(letters, 'e');
		System.out.println(res);
		

	}
	
	static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char res; 

        if(target >= letters[end]){
            res = letters[start];
        }
        else{
            while(start <= end){
                int mid = start + (end - start) / 2;

                if(target < letters[mid]){
                    end = mid -1 ;
                }

                else{
                    start = mid + 1;
                }

            }
            res = letters[start];
        }

        return res;
    }
}
