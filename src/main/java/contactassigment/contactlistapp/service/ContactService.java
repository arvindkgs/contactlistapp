package contactassigment.contactlistapp.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import contactassigment.contactlistapp.domain.Contact;
import contactassigment.contactlistapp.dto.ContactDTO;
import contactassigment.contactlistapp.dto.ContactSearchCriteriaDTO;

public interface ContactService
{
  /**
   * Find by entity id and convert into a {@link ContactDTO}
   *
   * @param id
   * @return An {@link ContactDTO} or null if not found
   */
  ContactDTO findByIdFetchOrganisation(Integer id);

  /**
   * Query a contact list by {@link ContactSearchCriteriaDTO}
   *
   * @param criteria
   *          {@link ContactSearchCriteriaDTO}
   * @return All matched entities converted into a list of {@link ContactDTO}s,
   *         or an empty {@link List} if not found
   */
  List<ContactDTO> listByCriteriaFetchOrganisation(ContactSearchCriteriaDTO criteria);

  /**
   * Update a {@link Contact} entity by a {@link ContactDTO}
   *
   * @param contactDTO
   *          The id of this DTO must not be null
   * @return The updated {@link Contact} entity converted into a
   *         {@link ContactDTO}
   * @throws javax.persistence.EntityNotFoundException
   *           if no entity corresponding to the {@link ContactDTO} could be
   *           found
   */
  ContactDTO updateByDTO(ContactDTO contactDTO) throws EntityNotFoundException;
}
