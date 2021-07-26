package contactassigment.contactlistapp.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer>, ContactRepositoryCustom
{
  @Query("SELECT c FROM Contact c LEFT JOIN FETCH c.organisation WHERE c.id = ?1")
  Contact findByIdFetchOrganisation(Integer id);

  @Query("FROM Contact c LEFT JOIN FETCH c.organisation")
  List<Contact> findAllFetchOrganisation();
}
