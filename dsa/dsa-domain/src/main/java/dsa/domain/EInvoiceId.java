package dsa.domain;

/**
 *
 * @author hl
 */
public record EInvoiceId(EInvoiceType type, String id) implements Entity {

    public enum EInvoiceType {
        PEPPOL, GLN // Fylla på med fler?
    }
}
