package io.swagger.api.factories;

import io.swagger.api.WithdrawalApiService;
import io.swagger.api.impl.WithdrawalApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class WithdrawalApiServiceFactory {
    private final static WithdrawalApiService service = new WithdrawalApiServiceImpl();

    public static WithdrawalApiService getWithdrawalApi() {
        return service;
    }
}
