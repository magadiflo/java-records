package record03;

public record Person(String name, int age, Contact contact) {
    public static class Contact {
        private final String email;
        private final String phone;

        public Contact(String email, String phone) {
            this.email = email;
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Contact{");
            sb.append("email='").append(email).append('\'');
            sb.append(", phone='").append(phone).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
}

