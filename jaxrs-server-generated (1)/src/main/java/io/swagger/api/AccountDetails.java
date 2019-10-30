
package io.swagger.api;
 
public class AccountDetails {
 
   private int account_number = 0;
   private int account_pin = 0;
   private String account_holder = "";
   private int account_balance = 0;
   private String phone_number = "";
 
   public AccountDetails() {
   }
 
   public AccountDetails(int account_number, int account_pin, String account_holder, int account_balance, String phone_number) {
       this.account_number = account_number;
       this.account_pin = account_pin;
       this.account_holder = account_holder;
       this.account_balance = account_balance;
       this.phone_number = phone_number;
   }
 
   public int getAccount_number() {
       return account_number;
   }
 
   public void setAccount_number(int account_number) {
       this.account_number = account_number;
   }
 
   public int getAccount_pin() {
       return account_pin;
   }
 
   public void setAccount_pin(int account_pin) {
       this.account_pin = account_pin;
   }
 
   public String getAccount_holder() {
       return account_holder;
   }
 
   public void setAccount_holder(String account_holder) {
       this.account_holder = account_holder;
   }
 
   public int getAccount_balance() {
       return account_balance;
   }
 
   public void setAccount_balance(int account_balance) {
       this.account_balance = account_balance;
   }
 
   public String getPhone_number() {
       return phone_number;
   }
 
   public void setPhone_number(String phone_number) {
       this.phone_number = phone_number;
   }
}
