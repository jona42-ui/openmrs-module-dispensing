package org.openmrs.module.dispensing.importer;

public class DrugImporterRow {

    // Inventory code currently not used

    public static final String[] FIELD_COLUMNS = { "uuid", "inventoryCode", "productName", "concept" };

    private String uuid;

    private String inventoryCode;

    private String productName;

    private String concept;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }
}
