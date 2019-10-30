package io.swagger.api.factories;

import io.swagger.api.DeleteApiService;
import io.swagger.api.impl.DeleteApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class DeleteApiServiceFactory {
    private final static DeleteApiService service = new DeleteApiServiceImpl();

    public static DeleteApiService getDeleteApi() {
        return service;
    }
}
