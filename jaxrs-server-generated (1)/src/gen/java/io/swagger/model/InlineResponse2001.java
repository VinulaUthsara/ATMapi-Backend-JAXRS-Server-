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
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class InlineResponse2001   {
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

  public InlineResponse2001 accountNumber(BigDecimal accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   **/
  @JsonProperty("account_number")
  @ApiModelProperty(example = "1.12233445566E11", value = "")
  public BigDecimal getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(BigDecimal accountNumber) {
    this.accountNumber = accountNumber;
  }

  public InlineResponse2001 accountPin(BigDecimal accountPin) {
    this.accountPin = accountPin;
    return this;
  }

  /**
   * Get accountPin
   * @return accountPin
   **/
  @JsonProperty("account_pin")
  @ApiModelProperty(example = "1234.0", value = "")
  public BigDecimal getAccountPin() {
    return accountPin;
  }

  public void setAccountPin(BigDecimal accountPin) {
    this.accountPin = accountPin;
  }

  public InlineResponse2001 accountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
    return this;
  }

  /**
   * Get accountHolder
   * @return accountHolder
   **/
  @JsonProperty("account_holder")
  @ApiModelProperty(example = "VinulaUthsara", value = "")
  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public InlineResponse2001 accountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
    return this;
  }

  /**
   * Get accountBalance
   * @return accountBalance
   **/
  @JsonProperty("account_balance")
  @ApiModelProperty(example = "100000.0", value = "")
  public BigDecimal getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
  }

  public InlineResponse2001 phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   **/
  @JsonProperty("phone_number")
  @ApiModelProperty(example = "0769006126", value = "")
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
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.accountNumber, inlineResponse2001.accountNumber) &&
        Objects.equals(this.accountPin, inlineResponse2001.accountPin) &&
        Objects.equals(this.accountHolder, inlineResponse2001.accountHolder) &&
        Objects.equals(this.accountBalance, inlineResponse2001.accountBalance) &&
        Objects.equals(this.phoneNumber, inlineResponse2001.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, accountPin, accountHolder, accountBalance, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
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

