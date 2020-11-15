package validator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
public class BookYearOfPublishExistingValidator implements ConstraintValidator<BookYearOfPublishExisting,Integer>{
    @Override
    public boolean isValid(Integer yearOfPublish, ConstraintValidatorContext context) {
        return yearOfPublish ==2019 || yearOfPublish==2020;
    }


}
