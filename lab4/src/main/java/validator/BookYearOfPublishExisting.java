package  validator;
import java.lang.annotation.Documented;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy=BookYearOfPublishExistingValidator.class)
public @interface BookYearOfPublishExisting {
    String message() default "{BookYearOfPublishExisting}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
