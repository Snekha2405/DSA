class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            System.out.println("Length");
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("lower");
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("upper");
            return false;
        }

        if (!password.matches(".*[0-9].*")) {
            System.out.println("digi");
            return false;
        }

        if (!password.matches(".*[!@#$%^&*()\\-+].*")) {
            System.out.println("sp");
            return false;
        }

        for (int i = 1; i < password.length(); i++) {
            if (password.charAt(i) == password.charAt(i - 1)) {
                System.out.println("Not equals");
                return false;
            }
        }

        return true;
    }
}
