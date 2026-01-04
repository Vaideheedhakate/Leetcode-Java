public class LC443_StringCompression {
    public int compress(char[] arr) {
        StringBuilder s = new StringBuilder();
        int i=0, j=0;
        while(j<arr.length){
            if(arr[i]==arr[j]) j++;
            else{
                s.append(arr[i]);
                if((j-i)>1) s.append(j-i);
                i=j;
            }
        }
        s.append(arr[i]);
        if((j-i)>1) s.append(j-i);
        for(i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }
        return s.length();
    }
}
