package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.CreateAccountDetails;

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
public class CreateaccountApiServiceImpl extends CreateaccountApiService {
    @Override
    public Response pOSTCreateaccountPin(CreateAccountDetails body, SecurityContext securityContext) throws NotFoundException {
        System.out.println("body is : "+body.toString());
 
 
       //creating GsonBuilder with pretty printing
      Gson gson = new GsonBuilder().setPrettyPrinting().create();
      // creating Account details object from the json
      AccountDetails acc1 = gson.fromJson(body.toString(), AccountDetails.class);
      //calling account map from bootstrap class
      Map<Integer, AccountDetails> accountMap = Bootstrap.getMap();
      //putting acc1 to account map
      accountMap.put(acc1.getAccount_number(), acc1);
      //converting acc1 details to json
      String jsonNewAccountDetails =  gson.toJson(acc1);
      System.out.println("acc1 to json"+jsonNewAccountDetails);
 
      return Response.ok().entity(jsonNewAccountDetails).build();
    }
}
