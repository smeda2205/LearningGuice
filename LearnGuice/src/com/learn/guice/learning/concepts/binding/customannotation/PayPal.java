package com.learn.guice.learning.concepts.binding.customannotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

@BindingAnnotation
@Target({ FIELD, PARAMETER, METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PayPal {

}
