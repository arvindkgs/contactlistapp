package contactassigment.contactlistapp.domain;

import java.util.List;

public interface ContactRepositoryCustom
{
  List<Contact> searchByNamesFetchOrganisation(String contactName, String organisationName);
}
