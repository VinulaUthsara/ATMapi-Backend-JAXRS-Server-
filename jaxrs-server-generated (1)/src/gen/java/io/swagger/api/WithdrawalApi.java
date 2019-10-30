package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.WithdrawalApiService;
import io.swagger.api.factories.WithdrawalApiServiceFactory;

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

@Path("/withdrawal")


@io.swagger.annotations.Api(description = "the withdrawal API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class WithdrawalApi  {
   private final WithdrawalApiService delegate;

   public WithdrawalApi(@Context ServletConfig servletContext) {
      WithdrawalApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("WithdrawalApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (WithdrawalApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = WithdrawalApiServiceFactory.getWithdrawalApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{accountNumber}/{pin}/{withdrawalAmount}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Withdraws money from account", notes = "creates a bank account", response = InlineResponse2001.class, tags={ "Withdrawal", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2001.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The specified pin is invalid (e.g. not a number).", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "An account with the specified pin was not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response pOSTWithdrawal(@ApiParam(value = "account number of customers account",required=true) @PathParam("accountNumber") Integer accountNumber
,@ApiParam(value = "pin of customers account",required=true) @PathParam("pin") Integer pin
,@ApiParam(value = "withdrawal amount",required=true) @PathParam("withdrawalAmount") Integer withdrawalAmount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pOSTWithdrawal(accountNumber,pin,withdrawalAmount,securityContext);
    }
}
