package contactassigment.contactlistapp.domain;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;

@Entity
public class Contact
{

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Access(AccessType.PROPERTY)
  private Integer id;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @Column(nullable = false, length = 30)
  private String firstName;

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Column(nullable = false, length = 30)
  private String lastName;

  @CreatedDate
  private Instant createdDate;

  public Instant getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Instant createdDate) {
    this.createdDate = createdDate;
  }

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

  public Organisation getOrganisation()
  {
    return organisation;
  }

  public void setOrganisation(Organisation organisation)
  {
    this.organisation = organisation;
  }
}
