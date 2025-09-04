package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int suurin=Math.max(a,Math.max(b,c));
        int pienin=Math.min(a,Math.min(b,c));
        int keskimmäinen=a + b + c - suurin - pienin;
        return pienin + "," + keskimmäinen + "," + suurin;  
    }
}