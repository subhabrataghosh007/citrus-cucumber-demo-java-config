package com.demo;

import com.consol.citrus.dsl.endpoint.CitrusEndpoints;
import com.consol.citrus.http.client.HttpClient;
import com.consol.citrus.xml.namespace.NamespaceContextBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
public class EndpointConfig {

    @Bean
    public HttpClient testApiClient() {
        return CitrusEndpoints
                .http()
                .client()
                .requestUrl("http://localhost:8080/test")
                .build();
    }

    @Bean
    public NamespaceContextBuilder namespaceContextBuilder() {
        final NamespaceContextBuilder namespaceContextBuilder = new NamespaceContextBuilder();
        namespaceContextBuilder.setNamespaceMappings(Collections.singletonMap("xh", "http://www.w3.org/1999/xhtml"));
        return namespaceContextBuilder;
    }
}