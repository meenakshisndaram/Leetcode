package pck4;
class MaxValidSubstringSolver {

    public int findMaxValidSubstring(String s) {
        int maxLen = 0;

        // Generate all substrings
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                // Extract substring from index i to j-1
                String substring = s.substring(i, j);

                // Check if the substring is valid
                if (isValid(substring)) {
                    // Update maxLen if this substring's length is greater
                    maxLen = Math.max(maxLen, substring.length());
                }
            }
        }

        return maxLen; // Return the length of the longest valid substring
    }

    // Example validity check (can be replaced based on the problem)
    private boolean isValid(String substring) {
        // Let's assume a substring is valid if it contains no duplicate characters
        boolean[] charMap = new boolean[128]; // For ASCII characters
        for (char c : substring.toCharArray()) {
            if (charMap[c])

                return false;
            // Duplicate found
            charMap[c] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        MaxValidSubstringSolver solution = new MaxValidSubstringSolver();
        String input = "abcabcbb";

        int maxLen = solution.findMaxValidSubstring(input);
        System.out.println("Length of longest valid substring: " + maxLen);
    }
}

