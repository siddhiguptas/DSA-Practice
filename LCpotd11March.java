class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 0, a = 0, b = 0, c = 0, ct = 0;
        char ch = s.charAt(r);
        if (ch == 'a') {
            a++;
        } else if (ch == 'b') {
            b++;
        } else {
            c++;
        }
        while (l <= r && r < s.length()) {
            
            while (a >= 1 && b >= 1 && c >= 1) {
                ch = s.charAt(l);
                ct++;
                if (ch == 'a') {
                    a--;
                    if (a == 0) {
                        a++;
                        break;
                    }
                } else if (ch == 'b') {
                    b--;
                    if (b == 0) {
                        b++;
                        break;
                    }
                } else {
                    c--;
                    if (c == 0) {
                        c++;
                        break;
                    }
                }
                l++;
            }
            r++;
            if (r < s.length()) {
                ch = s.charAt(r);
                if (ch == 'a') {
                    a++;
                } else if (ch == 'b') {
                    b++;
                } else {
                    c++;
                }
                if (a >= 1 && b >= 1 && c >= 1 && l > 0) {
                    ct += l;
                }
            }

        }
        return ct;

    }
}