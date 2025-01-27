class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        String del = "#";
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length() + del + strs.get(i));
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (i != 0) {
                i--;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder stlen = new StringBuilder();
            if (Character.isDigit(str.charAt(i))) {
                int j = i;
                while (str.charAt(j) != '#') {
                    stlen.append(str.charAt(j));
                    j++;
                }
                i = j - 1;
            }
            int len = Integer.parseInt(stlen.toString());

            i += 2;
            for (int j = 0; j < len; j++) {
                sb.append(str.charAt(i));
                i++;
            }

            ans.add(sb.toString());
        }

        return ans;
    }
}
