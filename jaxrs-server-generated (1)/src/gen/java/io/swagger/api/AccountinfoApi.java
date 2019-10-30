package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.AccountinfoApiService;
import io.swagger.api.factories.AccountinfoApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse200;

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

@Path("/accountinfo")


@io.swagger.annotations.Api(description = "the accountinfo API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class AccountinfoApi  {
   private final AccountinfoApiService delegate;

   public AccountinfoApi(@Context ServletConfig servletContext) {
      AccountinfoApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AccountinfoApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AccountinfoApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AccountinfoApiServiceFactory.getAccountinfoApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{accountNumber}/{pin}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Returns customer account information", notes = "", response = InlineResponse200.class, tags={ "Account Info", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A customer account object.", response = InlineResponse200.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The specified pin is invalid (e.g. not a number).", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "An account with the specified pin was not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response gETAccountinfoPin(@ApiParam(value = "account number of customers account",required=true) @PathParam("accountNumber") Integer accountNumber
,@ApiParam(value = "pin of customers account",required=true) @PathParam("pin") Integer pin
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.gETAccountinfoPin(accountNumber,pin,securityContext);
    }
}
