class Solution {
    public boolean isAnagram(String s, String t) {
        // Quick length check
        if (s.length() != t.length()) return false;
        
        // Count character frequencies
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Verify characters in t
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) return false;
            
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) < 0) return false;
        }
        
        return true;
    }
}