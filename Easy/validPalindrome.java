class Solution {
    public boolean isPalindrome(String s) {
        s = s.replace(" ", "");
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();
        System.out.println(s.length());

        boolean hasNoAlphanumeric = !s.matches(".*[a-zA-Z0-9].*");

        if (hasNoAlphanumeric)
            return true;

        while (i < j) {
            System.out.println(j);
            while (!alphaNum(s.charAt(i)))
                i++;
            while (!alphaNum(s.charAt(j)))
                j--;
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }

    public boolean alphaNum(char c) {
        return (c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

}
