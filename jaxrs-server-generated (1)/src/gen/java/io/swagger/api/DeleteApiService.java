package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public abstract class DeleteApiService {
    public abstract Response dELETEDeleteAccount( @Min(1)Integer accountNumber, @Min(1)Integer pin, @Min(1)Integer adminCode,SecurityContext securityContext) throws NotFoundException;
}
