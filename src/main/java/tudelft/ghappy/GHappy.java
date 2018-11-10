package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        if (str.isEmpty()) return true; // no g's in the string, so all g's are happy
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
