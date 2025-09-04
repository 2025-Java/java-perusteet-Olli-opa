package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String oikea = "java123";
        int maxYritykset = Math.min(3, tries.length);
        for (int i = 0; i < maxYritykset; i++) {
            if (oikea.equals(tries[i])) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}   