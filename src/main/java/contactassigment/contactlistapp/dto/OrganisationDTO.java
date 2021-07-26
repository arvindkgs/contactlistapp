package contactassigment.contactlistapp.dto;

import java.util.ArrayList;
import java.util.List;

import contactassigment.contactlistapp.domain.Organisation;

public class OrganisationDTO
{

  public static OrganisationDTO createBy(Organisation organisation)
  {
    return new OrganisationDTO(organisation);
  }

  public static List<OrganisationDTO> createListBy(List<Organisation> organisations)
  {
    List<OrganisationDTO> organisationDTOs = new ArrayList<OrganisationDTO>(organisations.size());
    for (Organisation o : organisations)
    {
      organisationDTOs.add(OrganisationDTO.createBy(o));
    }
    return organisationDTOs;
  }

  private Integer id;
  private String name;
  private String abn;

  public String getAbn() {
    return abn;
  }

  public void setAbn(String abn) {
    this.abn = abn;
  }

  public OrganisationDTO()
  {
  }

  public OrganisationDTO(Organisation organisation)
  {
    setId(organisation.getId());
    setName(organisation.getName());
    setAbn(organisation.getAbn());
  }

  public String getInfo() {
    return name + "(" + abn + ")";
  }

  public Integer getId()
  {
    return id;
  }

  public void setId(Integer id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

}
