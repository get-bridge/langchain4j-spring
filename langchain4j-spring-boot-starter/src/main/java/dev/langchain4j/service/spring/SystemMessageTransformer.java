package dev.langchain4j.service.spring;

import dev.langchain4j.invocation.InvocationContext;

public interface SystemMessageTransformer {
    String transform(String systemMessage, InvocationContext invocationContext);
}
