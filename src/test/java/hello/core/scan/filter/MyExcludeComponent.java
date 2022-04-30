package hello.core.scan.filter;

import java.lang.annotation.*;

/**
 * Created by cadqe13@gmail.com on 2022-05-01
 * Blog : https://velog.io/@donsco
 * GitHub : https://github.com/wlwlsus
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyExcludeComponent {
}
