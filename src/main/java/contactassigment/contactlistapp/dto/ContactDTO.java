package contactassigment.contactlistapp.dto;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import contactassigment.contactlistapp.domain.Contact;
import contactassigment.contactlistapp.domain.Organisation;
import org.springframework.format.datetime.DateFormatter;

public class ContactDTO
{

  private static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy").withZone(ZoneId.of("UTC"));

  public static ContactDTO createBy(Contact contact)
  {
    return new ContactDTO(contact);
  }

  public static List<ContactDTO> createListBy(List<Contact> contacts)
  {
    List<ContactDTO> contactDTOs = new ArrayList<>(contacts.size());
    for (Contact c : contacts)
    {
      contactDTOs.add(ContactDTO.createBy(c));
    }
    return contactDTOs;
  }

  private Integer id;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private String firstName;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private String lastName;

  private OrganisationDTO organisation;

  private String createdDate;

  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ContactDTO()
  {
  }

  public ContactDTO(Contact contact)
  {
    setId(contact.getId());
    setFirstName(contact.getFirstName());
    setLastName(contact.getLastName());
    setCreatedDate(DATE_FORMAT.format(contact.getCreatedDate()));
    Organisation org = contact.getOrganisation();
    if (org != null)
    {
      setOrganisation(new OrganisationDTO(contact.getOrganisation()));
    }
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public OrganisationDTO getOrganisation()
  {
    return organisation;
  }

  public void setOrganisation(OrganisationDTO organisation)
  {
    this.organisation = organisation;
  }

  public String getOrganisationInfo()
  {
    OrganisationDTO org = getOrganisation();
    if (org != null)
    {
      return org.getName();
    }
    else
    {
      return Constants.EMPTY_STRING;
    }
  }

  public String getOrganisationName()
  {
    OrganisationDTO org = getOrganisation();
    if (org != null)
    {
      return org.getName();
    }
    else
    {
      return Constants.EMPTY_STRING;
    }
  }
}
