package contactassigment.contactlistapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import contactassigment.contactlistapp.domain.Organisation;
import contactassigment.contactlistapp.domain.OrganisationRepository;
import contactassigment.contactlistapp.dto.OrganisationDTO;

@Service
public class OrganisationServiceImpl implements OrganisationService
{

  protected final OrganisationRepository repo;

  @Autowired
  public OrganisationServiceImpl(OrganisationRepository repo)
  {
    this.repo = repo;
  }

  @Override
  public List<OrganisationDTO> listAll()
  {
    List<Organisation> resultList = repo.findAll();
    return OrganisationDTO.createListBy(resultList);
  }
}
