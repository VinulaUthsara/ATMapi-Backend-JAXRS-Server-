package io.swagger.api.factories;

import io.swagger.api.CreateaccountApiService;
import io.swagger.api.impl.CreateaccountApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class CreateaccountApiServiceFactory {
    private final static CreateaccountApiService service = new CreateaccountApiServiceImpl();

    public static CreateaccountApiService getCreateaccountApi() {
        return service;
    }
}
