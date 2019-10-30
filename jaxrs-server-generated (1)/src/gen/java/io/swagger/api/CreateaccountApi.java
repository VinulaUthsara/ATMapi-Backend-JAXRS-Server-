package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.CreateaccountApiService;
import io.swagger.api.factories.CreateaccountApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CreateAccountDetails;

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

@Path("/createaccount")


@io.swagger.annotations.Api(description = "the createaccount API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class CreateaccountApi  {
   private final CreateaccountApiService delegate;

   public CreateaccountApi(@Context ServletConfig servletContext) {
      CreateaccountApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CreateaccountApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CreateaccountApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CreateaccountApiServiceFactory.getCreateaccountApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Creates bank account for user", notes = "Creates a bank account", response = Void.class, tags={ "CreateAccount", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "OK", response = Void.class) })
    public Response pOSTCreateaccountPin(@ApiParam(value = "Created account object" ,required=true) CreateAccountDetails body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.pOSTCreateaccountPin(body,securityContext);
    }
}
