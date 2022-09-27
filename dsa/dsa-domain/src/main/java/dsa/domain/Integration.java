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
public class Integration implements Entity {

    @JsonProperty(required = true)
    private String name;
    private List<EmailAddress> emailAddresses;
    private String homepage;
    private String technicalDocumentationUri;
    private List<UUID> documentIds;
    @JsonProperty(required = true)
    private Access access;
    private List<Scope> scopes;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate connected;
    private List<String> notes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmailAddress> getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(List<EmailAddress> emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getTechnicalDocumentationUri() {
        return technicalDocumentationUri;
    }

    public void setTechnicalDocumentationUri(String technicalDocumentationUri) {
        this.technicalDocumentationUri = technicalDocumentationUri;
    }

    public List<UUID> getDocumentIds() {
        return documentIds;
    }

    public void setDocumentIds(List<UUID> documentIds) {
        this.documentIds = documentIds;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public List<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(List<Scope> scopes) {
        this.scopes = scopes;
    }

    public LocalDate getConnected() {
        return connected;
    }

    public void setConnected(LocalDate connected) {
        this.connected = connected;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public enum Access {
        COMPLETE, READ_ONLY, WRITE_ONLY, READ_WRITE, SCOPED
    }

    public static class Scope implements Entity {

        @JsonProperty(required = true)
        private String name;
        @JsonProperty(required = true)
        private Boolean create;
        @JsonProperty(required = true)
        private Boolean read;
        @JsonProperty(required = true)
        private Boolean update;
        @JsonProperty(required = true)
        private Boolean delete;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getCreate() {
            return create;
        }

        public void setCreate(Boolean create) {
            this.create = create;
        }

        public Boolean getRead() {
            return read;
        }

        public void setRead(Boolean read) {
            this.read = read;
        }

        public Boolean getUpdate() {
            return update;
        }

        public void setUpdate(Boolean update) {
            this.update = update;
        }

        public Boolean getDelete() {
            return delete;
        }

        public void setDelete(Boolean delete) {
            this.delete = delete;
        }
    }
}
