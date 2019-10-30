package io.swagger.api.factories;

import io.swagger.api.TransferApiService;
import io.swagger.api.impl.TransferApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-10-29T11:41:02.727Z")
public class TransferApiServiceFactory {
    private final static TransferApiService service = new TransferApiServiceImpl();

    public static TransferApiService getTransferApi() {
        return service;
    }
}
