package com.sh.sellfast.base.inject;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by sunny01 on 2016/3/14.
 */
@Retention(RUNTIME)
@Target(FIELD)
public @interface InjectViewData {
    String value();
    Class<?>[] classArray() default {};
    String[] getDataArgs() default {};
}
