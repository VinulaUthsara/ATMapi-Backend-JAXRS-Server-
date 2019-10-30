package io.swagger.api.factories;

import io.swagger.api.AccountinfoApiService;
import io.swagger.api.impl.AccountinfoApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class AccountinfoApiServiceFactory {
    private final static AccountinfoApiService service = new AccountinfoApiServiceImpl();

    public static AccountinfoApiService getAccountinfoApi() {
        return service;
    }
}
