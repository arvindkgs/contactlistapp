package contactassigment.contactlistapp.domain;

import javax.persistence.*;

@Entity
public class Contact
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Access(AccessType.PROPERTY)
  private Integer id;

  @Column(nullable = false, length = 30)
  private String name;

  @ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.MERGE)
  private Organisation organisation;

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

  public Organisation getOrganisation()
  {
    return organisation;
  }

  public void setOrganisation(Organisation organisation)
  {
    this.organisation = organisation;
  }
}
