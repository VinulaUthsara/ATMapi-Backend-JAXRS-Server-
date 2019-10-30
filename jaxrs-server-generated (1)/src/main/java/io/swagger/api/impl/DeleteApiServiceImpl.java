package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

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
public class DeleteApiServiceImpl extends DeleteApiService {
    @Override
    public Response dELETEDeleteAccount( @Min(1)Integer accountNumber,  @Min(1)Integer pin,  @Min(1)Integer adminCode, SecurityContext securityContext) throws NotFoundException {
        
        Integer AdminCode = 99;
        AccountDetails account = new AccountDetails();
        String accountInfo = "";
        Map<Integer, AccountDetails> accountMap = Bootstrap.getMap();
  
         if(accountMap.get(accountNumber) instanceof AccountDetails) {
            if(accountMap.get(accountNumber).getAccount_pin()== pin){
                if(adminCode == AdminCode){

                 accountMap.remove(accountNumber);
                 //account details
                //  Gson gson = new GsonBuilder().setPrettyPrinting().create();
                //  accountInfo = gson.toJson(account);
                accountInfo = "Account Deleted";

                }else{
                    accountInfo = "Wrong Admin Authorization Code";
                }

            }else{
                accountInfo = "Wrong Account Number or PIN entered!!!";
            }
        }else{
            accountInfo = "Account does not exist!!!";
        }

        //returns a string saying "cant parse JSON Raw result : "
        return Response.ok().entity(accountInfo).build();
 
    }
}
