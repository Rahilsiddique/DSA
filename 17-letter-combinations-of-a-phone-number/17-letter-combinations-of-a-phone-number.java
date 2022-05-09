class Solution {
    public List<String> letterCombinations(String digits) {
        var res = new ArrayList<String>();
        if(digits == null || digits.isEmpty()) {
            return res;
        }
        var map = Map.of('2', new Character[] { 'a', 'b', 'c' }, '3', new Character[] { 'd', 'e', 'f' }, '4',
                new Character[] { 'g', 'h', 'i' }, '5', new Character[] { 'j', 'k', 'l' }, '6',
                new Character[] { 'm', 'n', 'o' }, '7', new Character[] { 'p', 'q', 'r', 's' }, '8',
                new Character[] { 't', 'u', 'v' }, '9', new Character[] { 'w', 'x', 'y', 'z' });

        util(map, res, "", digits, 0);
        return res;
    }

    private void util(Map<Character, Character[]> map, List<String> res, String partial, String digits, int i) {
        if (partial.length() == digits.length()) {
            res.add(partial);
            return;
        }

        Character[] t = map.get(digits.charAt(i));
        for (int p = 0; p < t.length; p++) {
            partial += t[p];
            util(map, res, partial, digits, i + 1);
            partial = partial.substring(0, partial.length() - 1);
        }
    }
}