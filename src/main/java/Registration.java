public class Registration {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (email != null && email.endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email. Only Yahoo emails are accepted.");
            }
        }

        public void setUserName(String userName) {
            if (userName != null && userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. It cannot be empty and must be longer than 6 characters.");
            }
        }

        public void setPassword(String password) {
            if (password != null && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. It must be longer than 6 characters and cannot contain the username.");
            }
        }

        @Override
        public String toString() {
            return "Registration [email=" + email + ", userName=" + userName + "]";
        }

        public static void main(String[] args) {
            Registration reg = new Registration();
            reg.setEmail("example@yahoo.com");
            reg.setUserName("username123");
            reg.setPassword("securePassword");

            System.out.println(reg);
        }
    }

