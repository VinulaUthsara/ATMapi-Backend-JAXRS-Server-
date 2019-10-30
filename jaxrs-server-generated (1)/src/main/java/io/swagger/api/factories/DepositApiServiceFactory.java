package io.swagger.api.factories;

import io.swagger.api.DepositApiService;
import io.swagger.api.impl.DepositApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class DepositApiServiceFactory {
    private final static DepositApiService service = new DepositApiServiceImpl();

    public static DepositApiService getDepositApi() {
        return service;
    }
}
