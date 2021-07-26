package contactassigment.contactlistapp.web.validators;

import contactassigment.contactlistapp.dto.ContactDTO;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class ContactDTOValidator implements Validator
{

  /**
   * This Validator validates *just* Person instances
   */
  public boolean supports(Class clazz)
  {
    return ContactDTO.class.equals(clazz);
  }

  public void validate(Object obj, Errors e)
  {
    ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
    ContactDTO p = (ContactDTO) obj;
    if (p.getName().length() > 30)
    {
      e.rejectValue("name", "name.too.long");
    }
  }
}
