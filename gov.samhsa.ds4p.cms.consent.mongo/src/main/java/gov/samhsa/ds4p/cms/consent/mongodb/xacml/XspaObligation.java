package gov.samhsa.ds4p.cms.consent.mongodb.xacml;

public enum XspaObligation {

    OBLGTN_PATIENT_MASK_ADVANCEDIRECTIVES_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:advancedirectives:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_ALERTS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:alerts:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_ENCOUNTERS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:encounters:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_FAMILY_HISTORY_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:familyhistory:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_FUNCTIONAL_STATUS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:functionalstatus:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_IMMUNIZATIONS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:immunizations:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_MEDICAL_EQUIPMENT_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:medicalequipment:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_MEDICATIONS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:medications:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PAYERS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:payers:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PLANOFCARE_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:planofcare:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PROBLEMS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:problems:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PROCEDURES_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:procedures:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PURPOSE_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:purpose:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_RESULTS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:results:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_SOCIAL_HISTORY_DISSENTING_SUBJECT_ID("rn:oasis:names:tc:xspa:1.0:patient:masked:socialhistory:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_VITALS_DISSENTING_SUBJECT_ID("urn:oasis:names:tc:xspa:1.0:patient:masked:vitals:dissenting-subject-id");
    String identifier;

    private XspaObligation(String identifier) {
        this.identifier = identifier;
    }
    

    public String getIdentifier() {
        return identifier;
    }
}
