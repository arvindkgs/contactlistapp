package contactassigment.contactlistapp.dto;

public class ContactSearchCriteriaDTO
{

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private String firstName = Constants.EMPTY_STRING;
  private String lastName = Constants.EMPTY_STRING;
  private String organisationName = Constants.EMPTY_STRING;

  public String getOrganisationName()
  {
    return organisationName;
  }

  public void setOrganisationName(String organisationName)
  {
    this.organisationName = organisationName;
  }
}
