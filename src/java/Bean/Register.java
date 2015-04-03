package Bean;

/**
 *
 * @author niponsarikan
 */
public class Register {
    
    // For Customer
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String date;
    private String status;
    //Only For Photographer
    private String address;
    private String distinct;
    private String province;
    private String zipcode;
    private String country;
    private String paypal;

    
    //Constructor for Photographer
    public Register(String username,String password,String firstname,String lastname,String email,String phone,
            String date,String status,String address,String distinct,String province,String zipcode,String country,String paypal){
        
        this.username=username;
        this.password=password;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.phone=phone;
        this.date=date;
        this.status=status;
        this.address=address;
        this.distinct=distinct;
        this.province=province;
        this.zipcode=zipcode;
        this.country=country;
        this.paypal=paypal;
    }
    
    //For Customer
    public Register(String username,String password,String firstname,String lastname,String email,String phone,
            String date,String status){
        
        this.username=username;
        this.password=password;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.phone=phone;
        this.date=date;
        this.status=status;
    }
    
    
    
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }
    
    
    
    
    
}
