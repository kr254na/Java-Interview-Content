package DSA.Array.TwoPointer;

class BackspaceString {
    public boolean backspaceCompare(String s, String t) {

        int sp = s.length() - 1;
        int tp = t.length() - 1;

        while (sp >= 0 || tp >= 0) {

            int skipS = 0;
            while (sp >= 0) {
                if (s.charAt(sp) == '#') {
                    skipS++;
                    sp--;
                }
                else if (skipS > 0) {
                    skipS--;
                    sp--;
                }
                else {
                    break;
                }
            }

            int skipT = 0;
            while (tp >= 0) {
                if (t.charAt(tp) == '#') {
                    skipT++;
                    tp--;
                }
                else if (skipT > 0) {
                    skipT--;
                    tp--;
                }
                else {
                    break;
                }
            }

            if (sp >= 0 && tp >= 0) {
                if (s.charAt(sp) != t.charAt(tp)) {
                    return false;
                }
            }
            else if (sp >= 0 || tp >= 0) {
                return false;
            }

            sp--;
            tp--;
        }

        return true;
    }
}
