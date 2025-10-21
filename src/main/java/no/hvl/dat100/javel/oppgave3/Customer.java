package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // Object variables
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        // Constructor
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;

    }
        // getter/setter methods for all objectvariables
        // name
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        // email
        public void setEmail(String email) {
            this.email = email;
        }
        public String getemail() {
            return email;
        }

        // customer_id
        public void setCustomer_id(int customer_id) {
            this.customer_id = customer_id;
        }
        public int getCustomer_id() {
            return customer_id;
        }

        // agreement
        public void setAgreement(PowerAgreementType agreement) {
            this.agreement = agreement;
        }
        public PowerAgreementType getAgreement() {
            return agreement;
        }


        // toString method
        public String toString() {
        
        }



}
