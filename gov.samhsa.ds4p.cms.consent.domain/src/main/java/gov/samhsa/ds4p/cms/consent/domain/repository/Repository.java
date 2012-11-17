package gov.samhsa.ds4p.cms.consent.domain.repository;

import java.io.Serializable;

public interface Repository<DOMAIN_OBJ> extends Serializable {
	DOMAIN_OBJ findById(String id);

}
