public class Authenticate {
    public static class AuthenticationException extends Exception {
        public AuthenticationException(String message) {
            super(message);
        }
    }

    public static class Authenticator {
        private static final String USERNAME = "admin";
        private static final String PASSWORD = "password123";

        public void authenticate(String username, String password) throws AuthenticationException {
            if (!USERNAME.equals(username) || !PASSWORD.equals(password)) {
                throw new AuthenticationException("Invalid username or password");
            }
            // Perform additional authentication logic here if needed
        }
    }

    public static void main(String[] args) {
        System.out.println("J Siddharth");
        System.out.println("SJC22MCA-2034");
        System.out.println("23-06-2023");
        System.out.println("20MCA132 , Object Oriented Programming Lab \n\n");
        Authenticator authenticator = new Authenticator();

        try {
            authenticator.authenticate("admin", "password123");
            System.out.println("Authentication successful");
            System.out.println("Admin Logged In!");
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}

