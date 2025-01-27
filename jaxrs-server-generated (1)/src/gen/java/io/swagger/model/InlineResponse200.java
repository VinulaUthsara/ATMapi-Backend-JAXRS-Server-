/*
 * ATMapi
 * provides bank atm  api functions
 *
 * OpenAPI spec version: v2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class InlineResponse200   {
  @JsonProperty("account_number")
  private BigDecimal accountNumber = null;

  @JsonProperty("account_pin")
  private BigDecimal accountPin = null;

  @JsonProperty("account_holder")
  private String accountHolder = null;

  @JsonProperty("account_balance")
  private BigDecimal accountBalance = null;

  @JsonProperty("phone_number")
  private String phoneNumber = null;

  public InlineResponse200 accountNumber(BigDecimal accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   **/
  @JsonProperty("account_number")
  @ApiModelProperty(example = "1234.0", value = "")
  public BigDecimal getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(BigDecimal accountNumber) {
    this.accountNumber = accountNumber;
  }

  public InlineResponse200 accountPin(BigDecimal accountPin) {
    this.accountPin = accountPin;
    return this;
  }

  /**
   * Get accountPin
   * @return accountPin
   **/
  @JsonProperty("account_pin")
  @ApiModelProperty(example = "123.0", value = "")
  public BigDecimal getAccountPin() {
    return accountPin;
  }

  public void setAccountPin(BigDecimal accountPin) {
    this.accountPin = accountPin;
  }

  public InlineResponse200 accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Get accountHolder
   * @return accountHolder
   **/
  @JsonProperty("account_holder")
  @ApiModelProperty(example = "Vinula", value = "")
  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public InlineResponse200 accountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * Get accountBalance
   * @return accountBalance
   **/
  @JsonProperty("account_balance")
  @ApiModelProperty(example = "2000.0", value = "")
  public BigDecimal getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
  }

  public InlineResponse200 phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   **/
  @JsonProperty("phone_number")
  @ApiModelProperty(example = "076866578", value = "")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.accountNumber, inlineResponse200.accountNumber) &&
        Objects.equals(this.accountPin, inlineResponse200.accountPin) &&
        Objects.equals(this.accountHolder, inlineResponse200.accountHolder) &&
        Objects.equals(this.accountBalance, inlineResponse200.accountBalance) &&
        Objects.equals(this.phoneNumber, inlineResponse200.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountPin, accountHolder, accountBalance, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountPin: ").append(toIndentedString(accountPin)).append("\n");
    sb.append("    accountHolder: ").append(toIndentedString(accountHolder)).append("\n");
    sb.append("    accountBalance: ").append(toIndentedString(accountBalance)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

