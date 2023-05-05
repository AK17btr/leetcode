class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        
    
        int num = 0;
        for (int i = 0; i < k; i++) {
             num += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int answer = num;
        
     
        for (int i = k; i < s.length(); i++) {
            num += vowels.contains(s.charAt(i)) ? 1 : 0;
            num -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
}