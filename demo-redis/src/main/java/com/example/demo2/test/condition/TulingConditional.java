package com.example.demo2.test.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TulingConditional implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //容器中包含tulingAspect组件才返回Ture
        if(context.getBeanFactory().containsBean("tulingAspect")){
            return true;
        }else{
            return false;
        }
    }
}
