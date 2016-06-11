package org.recap.model;

import org.junit.Test;
import org.recap.BaseTestCase;
import org.recap.dao.BibliographicEntityDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pvsubrah on 6/10/16.
 */

public class BibliographicEntity_Test extends BaseTestCase {
    @Autowired
    BibliographicEntityDAO bibliographicEntityDAO;

    @Test
    public void saveBib() throws Exception {
        BibliographictEntity BibliographictEntity = new BibliographictEntity();
        BibliographictEntity.setContent("Mock Bib Content");
        BibliographictEntity.setCreatedDate(new Date());
        BibliographictEntity.setOwningInstitutionBibId("1");
        BibliographictEntity.setOwningInstitutionId(1);
        BibliographictEntity savedBibEntity = bibliographicEntityDAO.save(BibliographictEntity);
        Integer bibliographicId = savedBibEntity.getBibliographicId();
        assertNotNull(bibliographicId);

        Iterable<org.recap.model.BibliographictEntity> bibliographictEntities = bibliographicEntityDAO.findAll();

        assertNotNull(bibliographictEntities);
    }
}