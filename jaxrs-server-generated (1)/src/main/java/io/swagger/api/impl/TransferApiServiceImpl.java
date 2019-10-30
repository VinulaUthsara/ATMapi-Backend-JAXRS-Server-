package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.InlineResponse2002;

import java.util.List;
import java.util.Map;

import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class TransferApiServiceImpl extends TransferApiService {
    @Override
    public Response pOSTTransfer( @Min(1)Integer accountNumber,  @Min(1)Integer pin,  @Min(1)Integer transferAccountNumber,  @Min(1)Integer transferAmount, SecurityContext securityContext) throws NotFoundException {
       
        AccountDetails account = new AccountDetails();
        AccountDetails transAccount = new AccountDetails();
  
        String accountInfo = "";
        Map<Integer, AccountDetails> accountMap = Bootstrap.getMap();
  
  
        if(accountMap.get(accountNumber) instanceof AccountDetails) {
            if(accountMap.get(accountNumber).getAccount_pin()== pin){
  
  
                account = accountMap.get(accountNumber);
  
                if(accountMap.get(transferAccountNumber) instanceof AccountDetails){
  
                    transAccount = accountMap.get(transferAccountNumber);
               
  
                    if((account.getAccount_balance() > 0 )&&(account.getAccount_balance()>=transferAmount)){
  
                         account.setAccount_balance(account.getAccount_balance()- transferAmount);
                         transAccount.setAccount_balance(transAccount.getAccount_balance() + transferAmount);
  
  
                   
                         Gson gson = new GsonBuilder().setPrettyPrinting().create();
                         accountInfo = gson.toJson(account);
  
                    }else{
  
                         accountInfo = "Cannot withdraw! Insufficient Account Balance!";
  
                    }
  
                }else{
                   
                    accountInfo = "Account to transfer does not exist!!!";
  
                }
  
              
            }else{
  
                accountInfo = "Wrong Account Number or PIN entered!!!";
          
            }
  
        }else{
  
            accountInfo = "Account does not exist!!!";
  
        }
  
  
  
    return Response.ok().entity(accountInfo).build();
 
 
    }
}
