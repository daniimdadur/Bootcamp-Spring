package bootcampjavapamarican.spring.core.factory;

import bootcampjavapamarican.spring.core.client.PaymentGatewayClient;
import lombok.Getter;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("paymentGatewayClient")
public class PaymentGatewayFactoryBean implements FactoryBean<PaymentGatewayClient> {


    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient paymentGatewayClient = new PaymentGatewayClient();
        paymentGatewayClient.setEndpoint("https://example.com");
        paymentGatewayClient.setPublicKey("public");
        paymentGatewayClient.setPrivateKey("private");
        return paymentGatewayClient;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
