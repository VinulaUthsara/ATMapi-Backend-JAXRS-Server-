package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TransferApiService;
import io.swagger.api.factories.TransferApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse2002;

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

@Path("/transfer")


@io.swagger.annotations.Api(description = "the transfer API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class TransferApi  {
   private final TransferApiService delegate;

   public TransferApi(@Context ServletConfig servletContext) {
      TransferApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TransferApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TransferApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TransferApiServiceFactory.getTransferApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/{accountNumber}/{pin}/{transferAccountNumber}/{transferAmount}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Transfers money to another account", notes = "Transfers money to another account", response = InlineResponse2002.class, tags={ "Transfer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = InlineResponse2002.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "The specified pin is invalid (e.g. not a number).", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "An account with the specified pin was not found.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    public Response pOSTTransfer(@ApiParam(value = "account number of customers account",required=true) @PathParam("accountNumber") Integer accountNumber
,@ApiParam(value = "pin of customers account",required=true) @PathParam("pin") Integer pin
,@ApiParam(value = "account number of transfer account",required=true) @PathParam("transferAccountNumber") Integer transferAccountNumber
,@ApiParam(value = "transfer amount",required=true) @PathParam("transferAmount") Integer transferAmount
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pOSTTransfer(accountNumber,pin,transferAccountNumber,transferAmount,securityContext);
    }
}
