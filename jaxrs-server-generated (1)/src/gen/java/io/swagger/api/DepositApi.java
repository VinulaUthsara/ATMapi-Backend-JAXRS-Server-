package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DepositApiService;
import io.swagger.api.factories.DepositApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse2001;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/deposit")


@io.swagger.annotations.Api(description = "the deposit API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class DepositApi  {
   private final DepositApiService delegate;

   public DepositApi(@Context ServletConfig servletContext) {
      DepositApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DepositApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DepositApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DepositApiServiceFactory.getDepositApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{accountNumber}/{pin}/{depositAmount}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deposits money to account", notes = "creates a bank account", response = InlineResponse2001.class, tags={ "Deposit", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The specified pin is invalid (e.g. not a number).", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "An account with the specified pin was not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response pOSTDeposit(@ApiParam(value = "account number of customers account",required=true) @PathParam("accountNumber") Integer accountNumber
,@ApiParam(value = "pin of customers account",required=true) @PathParam("pin") Integer pin
,@ApiParam(value = "deposit amount",required=true) @PathParam("depositAmount") Integer depositAmount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pOSTDeposit(accountNumber,pin,depositAmount,securityContext);
    }
}
