public class LC205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        // Mapping array for ASCII characters (s -> t)
        char[] arr = new char[128];

        // First pass: map characters from s to t
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i);   // ASCII value of current char in s

            // If no mapping exists, create mapping
            if(arr[index] == '\0') {
                arr[index] = t.charAt(i);
            }
            // If mapping exists, check consistency
            else {
                if(arr[index] != t.charAt(i)) return false;
            }
        }

        // Reset mapping array for reverse check
        for(int i = 0; i < arr.length; i++) arr[i] = '\0';

        // Second pass: map characters from t to s (to avoid many-to-one)
        for(int i = 0; i < t.length(); i++){
            int index = t.charAt(i);   // ASCII value of current char in t

            // Create reverse mapping
            if(arr[index] == '\0') {
                arr[index] = s.charAt(i);
            }
            // Check reverse consistency
            else {
                if(arr[index] != s.charAt(i)) return false;
            }
        }

        // Both mappings are valid
        return true;
    }
}
