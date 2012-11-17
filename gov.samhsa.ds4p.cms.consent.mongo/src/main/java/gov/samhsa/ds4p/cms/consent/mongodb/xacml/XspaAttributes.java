/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.samhsa.ds4p.cms.consent.mongodb.xacml;

/**
 *
 * @author ben.neuman
 */
public enum XspaAttributes {

    SUBJECT_SUBJECT_ID("subject:subject-id", "urn:oasis:names:tc:xacml:1.0:subject:subject-id"),
    SUBJECT_ORGANIZATION("subject:organization", "urn:oasis:names:tc:xspa:1.0:subject:organization"),
    SUBJECT_ORGANIZATION_ID("subject:organziation-id", "urn:oasis:names:tc:xspa:1.0:subject:organization-id"),
    SUBJECT_HL7_PERMISSION("subject:hl7:permission", "urn:oasis:names:tc:xspa:1.0:subject:hl7:permission"),
    SUBJECT_ROLE("subject:role", "urn:oasis:names:tc:xacml:2.0:subject:role"),    
    SUBJECT_PURPOSE_OF_USE("subject:purposeofuse", "urn:oasis:names:tc:xspa:1,0:subject:purposeofuse"),    
    RESOURCE_RESOURCE_ID("resource:resource-id","urn:oasis:names:tc:xacml:1.0:resource:resource-id"),
    RESOURCE_HL7_TYPE("resource:hl7:type","urn:oasis:names:tc:xspa:1.0:resource:hl7:type"),
    RESOURCE_ORG_PERMISSION("resource:org:permission","urn:oasis:names:tc:xspa:1.0:resource:org:hl7:permissions"),
    RESOURCE_ORG_ROLE("resource:org:role","urn:oasis:names:tc:xspa:1.0:resource:org:role"),
    RESOURCE_PATIENT_CONFIDENTIALITY_CODE("resource:patient:confidentiality-code","urn:oasis:names:tc:xspa:1.0:resource:patient:hl7:confidentiality-code"),
    RESOURCE_HL7_DISSENTING_SUBJECT_ID("resource:hl7:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:dissenting-subject-id"),
    RESOURCE_HL7_DISSENTING_ROLE("resource:hl7:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:dissenting-role"),
    ENVIRONMENT_LOCALITY("environment:locality","urn:oasis:names:tc:xspa:1.0:environment:locality"),
    SUBJECT_NPI("subject:npi","urn:oasis:names:tc:xspa:1.0:subject:npi"),
    SUBJECT_FUNCTIONAL_ROLE("subject:functional-role","urn:oasis:names:tc:xspa:1.0:subject:functional-role"),
    RESOURCE_ORG_ALLOWED_ORGANIZATIONS("resource:org:allowed-organizations","urn:oasis:names:tc:xspa:1.0:resource:org:allowed-organizations"),
    RESOURCE_ORG_HOURS_OF_OPERATIONS_START("resource:org:hoursofoperations:start","urn:oasis:names:tc:xspa:1.0:resource:org:hoursofoperation:start"),
    RESOURCE_ORG_HOURSE_OF_OPERATIONS_END("resource:org:hoursofoperation:end","urn:oasis:names:tc:xspa:1.0:resource:org:hoursofoperation:end"),
    RESOURCE_PATIENT_OPT_IN("resource:patient:opt-in","urn:gov:hhs:fha:nhinc:patient-opt-in"),
    RESOURCE_PATIENT_ALLOWED_ORGANIZATIONS("resource:patient:allowed-organizations","urn:oasis:names:tc:xspa:1.0:resource:patient:allowed-organizations"),
    OBLGTN_PATIENT_MASK_ADVANCEDIRECTIVES_DISSENTING_ROLE("obligation:patient:mask:advancedirectives:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:advancedirectives:dissenting-role"),
    OBLGTN_PATIENT_MASK_ALERTS_DISSENTING_ROLE("obligation:patient:mask:alerts:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:alerts:dissenting-role"),
    OBLGTN_PATIENT_MASK_ENCOUNTERS_DISSENTING_ROLE("obligation:patient:mask:encounters:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:encounters:dissenting-role"),
    OBLGTN_PATIENT_MASK_FAMILY_HISTORY_DISSENTING_ROLE("obligation:patient:mask:familyhistory:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:familyhistory:dissenting-role"),
    OBLGTN_PATIENT_MASK_FUNCTIONAL_STATUS_DISSENTING_ROLE("obligation:patient:mask:functionalstatus:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:functionalstatus:dissenting-role"),
    OBLGTN_PATIENT_MASK_IMMUNIZATIONS_DISSENTING_ROLE("obligation:patient:mask:immunizations:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:immunizations:dissenting-role"),
    OBLGTN_PATIENT_MASK_MEDICAL_EQUIPMENT_DISSENTING_ROLE("obligation:patient:mask:medicalequipment:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:medicalequipment:dissenting-role"),
    OBLGTN_PATIENT_MASK_MEDICATIONS_DISSENTING_ROLE("obligation:patient:mask:medications:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:medications:dissenting-role"),
    OBLGTN_PATIENT_MASK_PAYERS_DISSENTING_ROLE("obligation:patient:mask:payers:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:payers:dissenting-role"),
    OBLGTN_PATIENT_MASK_PLANOFCARE_DISSENTING_ROLE("obligation:patient:mask:planofcare:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:planofcare:dissenting-role"),
    OBLGTN_PATIENT_MASK_PROBLEMS_DISSENTING_ROLE("obligation:patient:mask:problems:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:problems:dissenting-role"),
    OBLGTN_PATIENT_MASK_PROCEDURES_DISSENTING_ROLE("obligation:patient:mask:procedures:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:procedures:dissenting-role"),
    OBLGTN_PATIENT_MASK_PURPOSE_DISSENTING_ROLE("obligation:patient:mask:purpose:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:purpose:dissenting-role"),
    OBLGTN_PATIENT_MASK_RESULTS_DISSENTING_ROLE("obligation:patient:mask:results:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:results:dissenting-role"),
    OBLGTN_PATIENT_MASK_SOCIAL_HISTORY_DISSENTING_ROLE("obligation:patient:mask:socialhistory:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:socialhistory:dissenting-role"),
    OBLGTN_PATIENT_MASK_VITALS_DISSENTING_ROLE("obligation:patient:mask:vitals:dissenting-role","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:vitals:dissenting-role"),
    OBLGTN_PATIENT_MASK_ADVANCEDIRECTIVES_DISSENTING_SUBJECT_ID("obligation:patient:mask:advancedirectives:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:advancedirectives:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_ALERTS_DISSENTING_SUBJECT_ID("obligation:patient:mask:alerts:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:alerts:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_ENCOUNTERS_DISSENTING_SUBJECT_ID("obligation:patient:mask:encounters:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:encounters:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_FAMILY_HISTORY_DISSENTING_SUBJECT_ID("obligation:patient:mask:familyhistory:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:familyhistory:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_FUNCTIONAL_STATUS_DISSENTING_SUBJECT_ID("obligation:patient:mask:functionalstatus:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:functionalstatus:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_IMMUNIZATIONS_DISSENTING_SUBJECT_ID("obligation:patient:mask:immunizations:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:immunizations:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_MEDICAL_EQUIPMENT_DISSENTING_SUBJECT_ID("obligation:patient:mask:medicalequipment:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:medicalequipment:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_MEDICATIONS_DISSENTING_SUBJECT_ID("obligation:patient:mask:medications:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:medications:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PAYERS_DISSENTING_SUBJECT_ID("obligation:patient:mask:payers:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:payers:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PLANOFCARE_DISSENTING_SUBJECT_ID("obligation:patient:mask:planofcare:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:planofcare:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PROBLEMS_DISSENTING_SUBJECT_ID("obligation:patient:mask:problems:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:problems:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PROCEDURES_DISSENTING_SUBJECT_ID("obligation:patient:mask:procedures:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:procedures:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_PURPOSE_DISSENTING_SUBJECT_ID("obligation:patient:mask:purpose:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:purpose:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_RESULTS_DISSENTING_SUBJECT_ID("obligation:patient:mask:results:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:results:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_SOCIAL_HISTORY_DISSENTING_SUBJECT_ID("obligation:patient:mask:socialhistory:dissenting-subject-id","rn:oasis:names:tc:xspa:1.0:resource:patient:masked:socialhistory:dissenting-subject-id"),
    OBLGTN_PATIENT_MASK_VITALS_DISSENTING_SUBJECT_ID("obligation:patient:mask:vitals:dissenting-subject-id","urn:oasis:names:tc:xspa:1.0:resource:patient:masked:vitals:dissenting-subject-id");
    
    String id;
    String identifier;

    private XspaAttributes(String id, String identifier) {
        this.id = id;
        this.identifier = identifier;
    }

    public String getId() {
        return id;
    }

    public String getIdentifier() {
        return identifier;
    }
}
