package dsa.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dsa.domain.io.LocalDateDeserializer;
import dsa.domain.io.LocalDateSerializer;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author hakan
 */
public class Project implements Entity {

    @JsonProperty(required = true)
    private Long id;
    @JsonProperty(required = true)
    private String name;
    private List<String> customerNumbers;
    private List<String> supplierNumbers;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate startDate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate endDate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate closedDate;
    private List<UUID> documentIds;
    private List<String> notes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCustomerNumbers() {
        return customerNumbers;
    }

    public void setCustomerNumbers(List<String> customerNumbers) {
        this.customerNumbers = customerNumbers;
    }

    public List<String> getSupplierNumbers() {
        return supplierNumbers;
    }

    public void setSupplierNumbers(List<String> supplierNumbers) {
        this.supplierNumbers = supplierNumbers;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDate closedDate) {
        this.closedDate = closedDate;
    }

    public List<UUID> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<UUID> documentIds) {
        this.documentIds = documentIds;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

}
