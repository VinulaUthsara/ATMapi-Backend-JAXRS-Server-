package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.DeleteApiService;
import io.swagger.api.factories.DeleteApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


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

@Path("/delete")


@io.swagger.annotations.Api(description = "the delete API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class DeleteApi  {
   private final DeleteApiService delegate;

   public DeleteApi(@Context ServletConfig servletContext) {
      DeleteApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DeleteApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DeleteApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DeleteApiServiceFactory.getDeleteApi();
      }

      this.delegate = delegate;
   }

    @DELETE
    @Path("/{accountNumber}/{pin}/{adminCode}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a specified account", notes = "Deletes a specified account under admin permissions", response = Void.class, tags={ "DeleteAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK (Account Deleted)", response = Void.class) })
    public Response dELETEDeleteAccount(@ApiParam(value = "account number of customers account",required=true) @PathParam("accountNumber") Integer accountNumber
,@ApiParam(value = "pin of customers account",required=true) @PathParam("pin") Integer pin
,@ApiParam(value = "admin permission code",required=true) @PathParam("adminCode") Integer adminCode
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.dELETEDeleteAccount(accountNumber,pin,adminCode,securityContext);
    }
}
